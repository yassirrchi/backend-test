package com.peacock.backend.services;

import com.peacock.backend.entities.Client;
import com.peacock.backend.repositories.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service

public class ClientServicesImpl implements ClientServices {
    private ClientRepository clientRepository;

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client createClient(Client client) {
        return null;
    }

    @Override
    public Client editClient(Client client) {
        return null;
    }
}
