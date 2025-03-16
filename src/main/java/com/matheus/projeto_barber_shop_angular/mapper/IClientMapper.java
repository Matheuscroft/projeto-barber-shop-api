package com.matheus.projeto_barber_shop_angular.mapper;

import com.matheus.projeto_barber_shop_angular.controller.request.SaveClientRequest;
import com.matheus.projeto_barber_shop_angular.controller.request.UpdateClientRequest;
import com.matheus.projeto_barber_shop_angular.controller.response.ClientDetailResponse;
import com.matheus.projeto_barber_shop_angular.controller.response.ListClientResponse;
import com.matheus.projeto_barber_shop_angular.controller.response.SaveClientResponse;
import com.matheus.projeto_barber_shop_angular.controller.response.UpdateClientResponse;
import com.matheus.projeto_barber_shop_angular.entity.ClientEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IClientMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "schedules", ignore = true)
    ClientEntity toEntity(final SaveClientRequest request);

    SaveClientResponse toSaveResponse(final ClientEntity entity);

    @Mapping(target = "schedules", ignore = true)
    ClientEntity toEntity(final long id, final UpdateClientRequest request);

    UpdateClientResponse toUpdateResponse(final ClientEntity entity);

    ClientDetailResponse toDetailResponse(final ClientEntity entity);

    List<ListClientResponse> toListResponse(final List<ClientEntity> entities);

}