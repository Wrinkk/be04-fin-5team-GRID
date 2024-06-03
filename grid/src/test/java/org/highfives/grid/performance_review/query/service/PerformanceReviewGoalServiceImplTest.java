package org.highfives.grid.performance_review.query.service;

import org.highfives.grid.performance_review.query.dto.DetailGoalDTO;
import org.highfives.grid.performance_review.query.dto.PerformanceReviewGoalDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PerformanceReviewGoalServiceImplTest {

    @Autowired
    private PerformanceReviewGoalServiceImpl performanceReviewGoalService;

    @DisplayName("11번 직원의 업적 평가 목표 목록 조회")
    @Test
    public void findGoalByWriterId(){
        int employeeId = 11;
        List<PerformanceReviewGoalDTO> findGoalList = performanceReviewGoalService.findAllGoalByWriterId(employeeId);

        System.out.println(findGoalList);
        assertNotNull(findGoalList);
    }

    @DisplayName("10번 직원이 결재할 업적 평가 목록 조회")
    @Test
    public void findGoalByEApproverId(){
        int employeeId = 10;
        List<PerformanceReviewGoalDTO> findGoalList = performanceReviewGoalService.findAllGoalByApproverId(employeeId);

        System.out.println(findGoalList);
        assertNotNull(findGoalList);
    }

    @DisplayName("1번 평가 목표 상세 조회")
    @Test
    public void findDetailGoalById(){
        int id = 1;
        DetailGoalDTO findGoal = performanceReviewGoalService.findDetailGoalById(id);

        assertNotNull(findGoal);
    }


    @DisplayName("11번 직원의 2024 업적 평가 목표 조회")
    @Test
    public void findGoalByWriterIdAndYear(){
        int writerId = 11;

        int year = 2024;

        PerformanceReviewGoalDTO performanceReviewGoalDTO = performanceReviewGoalService.findGoalByWriterIdAndYear(writerId, year);

        System.out.println(performanceReviewGoalDTO);

        assertNotNull(performanceReviewGoalDTO);
    }
}