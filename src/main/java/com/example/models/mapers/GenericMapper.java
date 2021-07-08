package com.example.models.mapers;

import com.example.models.documents.Generic;
import com.example.models.dtos.GenericDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GenericMapper {

        GenericMapper INSTANCE = Mappers.getMapper( GenericMapper.class );

        @Mapping(source = "name", target = "name")
        GenericDTO genericToGenericDto(Generic generic);

       @Mapping(source = "name", target = "name")
       Generic genericDTOToGeneric(GenericDTO genericDTO);
}

