package com.market.nf.api.nf.api.infra.repository;

import com.market.nf.api.nf.api.infra.entities.NotaFiscal;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotaFiscalRepository extends MongoRepository<NotaFiscal, Integer> {

}
