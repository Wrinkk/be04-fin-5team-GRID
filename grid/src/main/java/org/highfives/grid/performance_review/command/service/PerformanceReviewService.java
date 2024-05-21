package org.highfives.grid.performance_review.command.service;


import org.highfives.grid.performance_review.command.dto.ModifyPerformanceReviewDTO;
import org.highfives.grid.performance_review.command.dto.PerformanceReviewDTO;
import org.highfives.grid.performance_review.command.vo.RequestPerformanceReviewVO;

public interface PerformanceReviewService {

    PerformanceReviewDTO addNewPerformanceReview(PerformanceReviewDTO performanceReviewDTO);

    ModifyPerformanceReviewDTO modifyPerformanceReviewStatusInProgress(RequestPerformanceReviewVO requestPerformanceReviewVO);
}
