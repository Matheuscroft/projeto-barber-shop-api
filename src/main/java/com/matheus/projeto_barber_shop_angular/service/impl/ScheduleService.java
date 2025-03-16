package com.matheus.projeto_barber_shop_angular.service.impl;

import com.matheus.projeto_barber_shop_angular.entity.ScheduleEntity;
import com.matheus.projeto_barber_shop_angular.repository.IScheduleRepository;
import com.matheus.projeto_barber_shop_angular.service.IScheduleService;
import com.matheus.projeto_barber_shop_angular.service.query.IScheduleQueryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ScheduleService implements IScheduleService {

    private final IScheduleRepository repository;
    private final IScheduleQueryService queryService;

    @Override
    public ScheduleEntity save(final ScheduleEntity entity) {
        queryService.verifyIfScheduleExists(entity.getStartAt(), entity.getEndAt());

        return repository.save(entity);
    }

    @Override
    public void delete(final long id) {
        queryService.findById(id);
        repository.deleteById(id);
    }
}