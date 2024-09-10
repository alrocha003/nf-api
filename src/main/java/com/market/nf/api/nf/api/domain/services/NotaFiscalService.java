package com.market.nf.api.nf.api.domain.services;

import com.market.nf.api.nf.api.infra.entities.NotaFiscal;
import com.market.nf.api.nf.api.infra.repository.NotaFiscalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public class NotaFiscalService {

    @Autowired
    private NotaFiscalRepository mongoRepository;

    public void insert(NotaFiscal data){
        mongoRepository.insert(data);
    }
}
