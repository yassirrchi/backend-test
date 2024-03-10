package com.peacock.backend.Controllers;

import com.peacock.backend.entities.Client;
import com.peacock.backend.services.ClientServices;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

@AllArgsConstructor
@NoArgsConstructor

public class ClientController {
    @Autowired
    private ClientServices clientServices;
    @GetMapping("/all-clients")
    public ResponseEntity<List<Client>> liveTest(){


        return ResponseEntity.ok(clientServices.getAllClients());
    }
    @GetMapping("/client/{id}")
    public ResponseEntity<Client> getClient(@PathVariable Long id){


        return ResponseEntity.ok(clientServices.getClient(id));
    }
    @PutMapping("/client/update")
    public ResponseEntity<Client> updateClient(@RequestBody Client client){


        return ResponseEntity.ok(clientServices.editClient(client));
    }
    @PostMapping("/client/create")
    public ResponseEntity<Client> createClient(@RequestBody Client client){


        return ResponseEntity.ok(clientServices.createClient(client));
    }




}
