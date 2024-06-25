package org.highfives.grid.department.command.dao;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public class TeamMapper {

    TeamMapper INSTANCE = Mappers.getMapper(TeamMapper.class);
}
