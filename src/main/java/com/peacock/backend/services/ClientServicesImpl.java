package com.peacock.backend.services;

import com.peacock.backend.entities.Client;
import com.peacock.backend.repositories.ClientRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Service
@Transactional

public class ClientServicesImpl implements ClientServices {
    @Autowired

    private ClientRepository clientRepository;

    @Override
    public List<Client> getAllClients() {
        List<Client> clients=clientRepository.findAll();
        return clients ;
    }

    @Override
    public Client createClient(Client client) {
        Client newClient=new Client();
        newClient.setFirstName(client.getFirstName());
        newClient.setLastName(client.getLastName());
        newClient.setEmail(client.getEmail());
        newClient.setAddress(client.getAddress());
        newClient.setPhoneNumber(client.getPhoneNumber());
        return clientRepository.save(newClient);
    }

    @Override
    public Client getClient(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client editClient(Client updatedClient) {
        Client oldClient=this.getClient(updatedClient.getId());
        if(oldClient==null)
            return null;
        oldClient.setFirstName(updatedClient.getFirstName());
        oldClient.setLastName(updatedClient.getLastName());
        oldClient.setEmail(updatedClient.getEmail());
        oldClient.setPhoneNumber(updatedClient.getPhoneNumber());
        oldClient.setEmail(updatedClient.getEmail());




        return clientRepository.save(oldClient);
    }
}
