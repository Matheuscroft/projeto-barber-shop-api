package com.matheus.projeto_barber_shop_angular.service;


import com.matheus.projeto_barber_shop_angular.entity.ClientEntity;

public interface IClientService {

    ClientEntity save(final ClientEntity entity);

    ClientEntity update(final ClientEntity entity);

    void delete(final long id);

}