package com.peacock.backend.services;

import com.peacock.backend.dto.BillDTO;
import com.peacock.backend.dto.BillItemDTO;
import com.peacock.backend.entities.Bill;
import com.peacock.backend.entities.BillItem;
import com.peacock.backend.entities.Client;
import com.peacock.backend.entities.Product;
import com.peacock.backend.repositories.BillItemRepository;
import com.peacock.backend.repositories.BillRepository;
import com.peacock.backend.repositories.ClientRepository;

import com.peacock.backend.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@RequiredArgsConstructor
@Service
@Transactional

public class BillServicesImpl implements BillServices {
    @Autowired
    private BillRepository billRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private BillItemRepository billItemRepository;
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Bill> getAllBills() {
        return billRepository.findAll();
    }

    @Override
    public Bill getBillById(Long id) {
        return billRepository.findById(id).orElse(null); //exception to fix
    }

    @Override
    public Bill createBill(BillDTO billDTO) {
        System.out.println("  ProductId: " +billDTO.client_id() );

        ArrayList<BillItem> temp = new ArrayList<>();
        BillItem tempBillItem;
        Product tempProduct;
        Client client;

        Bill newBill=new Bill();
        //traitement Bill-Client
        client=clientRepository.findById(billDTO.client_id()).orElse(null);
        if(client==null)
            throw new RuntimeException("clientNotFound");
        newBill.setClient(client);
        client.getBills().add(newBill);
        newBill.setDateFacture(new Date());
        billRepository.save(newBill);
        clientRepository.save(client);
        //traitement bill-billItem
        for (BillItemDTO billItem : billDTO.billItems()) {
            tempBillItem=new BillItem();
            tempBillItem.setQuantity(tempBillItem.getQuantity());
            tempProduct=productRepository.findById(billItem.product_id()).orElse( null);

            //product exception to be fixed
            // traitement billItem-product
            tempBillItem.setProduct(tempProduct);
            tempBillItem.setBill(newBill);
            tempBillItem.setQuantity(billItem.quantity());

            newBill.getBillItems().add(billItemRepository.save(tempBillItem));
            billRepository.save(newBill);


            System.out.println("  ProductId: " +billItem.product_id() );
            System.out.println("  Quantity: " + billItem.quantity());
            // Add more fields as needed


        }





        return newBill;
    }



    @Override
    public Bill editBill(BillDTO bill) {

        return null;
    }
}
