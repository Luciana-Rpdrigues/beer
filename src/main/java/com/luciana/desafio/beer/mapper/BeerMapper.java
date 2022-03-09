package com.luciana.desafio.beer.mapper;

import com.luciana.desafio.beer.dto.BeerDTO;
import com.luciana.desafio.beer.entity.Beer;


@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
