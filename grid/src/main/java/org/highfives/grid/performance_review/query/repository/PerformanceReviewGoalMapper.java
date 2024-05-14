package org.highfives.grid.performance_review.query.repository;

import org.apache.ibatis.annotations.Mapper;
import org.highfives.grid.performance_review.query.aggregate.PerformanceReviewGoal;
import org.highfives.grid.performance_review.query.dto.PerformanceReviewGoalDTO;

import java.util.List;

@Mapper
public interface PerformanceReviewGoalMapper {
    List<PerformanceReviewGoalDTO> selectAllGoalByWriterId(int employeeId);
}
