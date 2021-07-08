package com.example.models.mapers;

import com.example.models.documents.Generic;
import com.example.models.dtos.GenericRequest;
import com.example.models.dtos.GenericResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GenericMapper {
       GenericMapper INSTANCE = Mappers.getMapper( GenericMapper.class );

       @Mapping(source = "name", target = "name")
       GenericResponse genericToGenericResponse(Generic generic);

       @Mapping(source = "name", target = "name")
       Generic genericRequestToGeneric(GenericRequest genericDTO);
}

