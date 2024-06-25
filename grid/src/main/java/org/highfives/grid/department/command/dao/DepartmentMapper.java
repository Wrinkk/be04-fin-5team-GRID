package org.highfives.grid.department.command.dao;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public class DepartmentMapper {


    DepartmentMapper INSTANCE = Mappers.getMapper(DepartmentMapper.class);


}
