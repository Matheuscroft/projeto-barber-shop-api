package com.matheus.projeto_barber_shop_angular.service.impl;

import com.matheus.projeto_barber_shop_angular.entity.ClientEntity;
import com.matheus.projeto_barber_shop_angular.repository.IClientRepository;
import com.matheus.projeto_barber_shop_angular.service.IClientService;
import com.matheus.projeto_barber_shop_angular.service.query.IClientQueryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class ClientService implements IClientService {

    private final IClientRepository repository;
    private final IClientQueryService queryService;

    @Override
    public ClientEntity save(final ClientEntity entity) {
        queryService.verifyEmail(entity.getEmail());
        queryService.verifyPhone(entity.getPhone());

        return repository.save(entity);
    }

    @Override
    public ClientEntity update(final ClientEntity entity) {
        queryService.verifyEmail(entity.getId(), entity.getEmail());
        queryService.verifyPhone(entity.getId(), entity.getPhone());

        var stored = queryService.findById(entity.getId());
        stored.setName(entity.getName());
        stored.setPhone(entity.getPhone());
        stored.setEmail(entity.getEmail());
        return repository.save(stored);
    }

    @Override
    public void delete(final long id) {
        queryService.findById(id);
        repository.deleteById(id);
    }
}