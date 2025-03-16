package com.matheus.projeto_barber_shop_angular.service;

import com.matheus.projeto_barber_shop_angular.entity.ScheduleEntity;

public interface IScheduleService {

    ScheduleEntity save(final ScheduleEntity entity);

    void delete(final long id);

}