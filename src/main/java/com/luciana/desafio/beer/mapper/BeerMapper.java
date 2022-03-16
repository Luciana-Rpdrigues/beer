package com.luciana.desafio.beer.mapper;

import com.luciana.desafio.beer.dto.BeerDTO;
import com.luciana.desafio.beer.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO dto);

    BeerDTO toDTO(Beer dto);
}
