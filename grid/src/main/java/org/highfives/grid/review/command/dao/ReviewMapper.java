package org.highfives.grid.review.command.dao;

import org.highfives.grid.department.command.dao.DepartmentMapper;
import org.highfives.grid.review.command.aggregate.ReviewHistory;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ReviewMapper {

    ReviewMapper INSTANCE = Mappers.getMapper(ReviewMapper.class);


    @Mapping(target = "id", source = "id")
    public void reviewHistoryToReviewHistoryDTO(ReviewHistory reviewHistory);


}
