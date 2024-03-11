package com.peacock.backend.Controllers;

import com.peacock.backend.dto.BillDTO;
import com.peacock.backend.dto.BillItemDTO;
import com.peacock.backend.entities.Bill;
import com.peacock.backend.entities.Client;
import com.peacock.backend.services.BillServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class BillController {//HTTP CODES to be fixed
    @Autowired
    private BillServices billServices;
    @GetMapping("/all-bills")
    public ResponseEntity<List<Bill>> getAllClients(){


        return ResponseEntity.ok(billServices.getAllBills());
    }

    @PostMapping("/bill/create")
    public ResponseEntity<Bill> createBill(@RequestBody BillDTO billDTO){
        ;
        return ResponseEntity.ok(billServices.createBill(billDTO));

    }
    @PutMapping("/bill/update")
    public ResponseEntity<Bill> editBill(@RequestBody BillDTO billDTO){

        return ResponseEntity.ok(billServices.editBill(billDTO));

    }

}
