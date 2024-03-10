package com.peacock.backend.services;

import com.peacock.backend.entities.Client;
import com.peacock.backend.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ClientServices {
    public List<Client> getAllClients();
    public Client createClient(Client client);
    public Client getClient(Long id);
    public Client editClient(Client client);
}
