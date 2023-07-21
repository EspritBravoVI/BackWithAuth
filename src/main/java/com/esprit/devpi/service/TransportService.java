package com.esprit.devpi.service;


import com.esprit.devpi.entities.Transport;

import java.util.List;

public interface TransportService {
    Transport saveTransport(Transport transport);
    Transport getTransportById(Long id);
    List<Transport> getAllTransports();
    void deleteTransport(Long id);
}



