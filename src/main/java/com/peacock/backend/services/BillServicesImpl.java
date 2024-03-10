package com.peacock.backend.services;

import com.peacock.backend.entities.Bill;
import com.peacock.backend.repositories.ClientRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@RequiredArgsConstructor
@Service
@Transactional

public class BillServicesImpl implements BillServices {

    @Override
    public List<Bill> getAllBills() {
        return null;
    }

    @Override
    public Bill getBillById() {
        return null;
    }

    @Override
    public Bill createBill(Bill bill) {
        return null;
    }

    @Override
    public Bill editBill(Bill bill) {
        return null;
    }
}
