package com.luciana.desafio.beer.mapper;

import com.luciana.desafio.beer.dto.BeerDTO;
import pcom.luciana.desafio.beer.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
