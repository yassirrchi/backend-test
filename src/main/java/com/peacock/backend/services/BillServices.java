package com.peacock.backend.services;

import com.peacock.backend.dto.BillDTO;
import com.peacock.backend.entities.Bill;

import java.util.List;

public interface BillServices {
    public List<Bill> getAllBills();
    public Bill getBillById(Long id);
    public Bill createBill(BillDTO bill);
    public Bill editBill(BillDTO bill);

}
