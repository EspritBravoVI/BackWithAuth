package com.esprit.devpi.service;



import com.esprit.devpi.DAO.TransportRepository;
import com.esprit.devpi.entities.Transport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportServiceImpl implements TransportService {

    private final TransportRepository transportRepository;

    @Autowired
    public TransportServiceImpl(TransportRepository transportRepository) {
        this.transportRepository = transportRepository;
    }

    @Override
    public Transport saveTransport(Transport transport) {
        return transportRepository.save(transport);
    }

    @Override
    public Transport getTransportById(Long id) {
        return transportRepository.findById(id).orElse(null);
    }

    @Override
    public List<Transport> getAllTransports() {
        return transportRepository.findAll();
    }

    @Override
    public void deleteTransport(Long id) {
        transportRepository.deleteById(id);
    }
}

