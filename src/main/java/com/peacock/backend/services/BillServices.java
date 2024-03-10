package com.peacock.backend.services;

import com.peacock.backend.entities.Bill;

import java.util.List;

public interface BillServices {
    public List<Bill> getAllBills();
    public Bill getBillById();
    public Bill createBill(Bill bill);
    public Bill editBill(Bill bill);

}
