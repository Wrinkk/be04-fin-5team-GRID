package org.highfives.grid.approval.query.repository;

import org.apache.ibatis.annotations.Mapper;
import org.highfives.grid.approval.common.dto.BTApprovalDTO;
import org.highfives.grid.approval.common.dto.OvertimeApprovalDTO;
import org.highfives.grid.approval.common.dto.OvertimeInWeekDTO;
import org.highfives.grid.approval.query.dto.ApprovalEmpDTO;

import java.util.List;

@Mapper
public interface ApprovalMapper {

    List<OvertimeApprovalDTO> findOInWeekByEmployeeId(OvertimeInWeekDTO overtimeInWeek);
    List<BTApprovalDTO> findAllBTApproval();
    List<ApprovalEmpDTO> findAllBTApprovalByEmployeeId(int employeeId);
    List<ApprovalEmpDTO> findAllOApprovalByEmployeeId(int employeeId);
    List<ApprovalEmpDTO> findAllRWApprovalByEmployeeId(int employeeId);
    List<ApprovalEmpDTO> findAllVApprovalByEmployeeId(int employeeId);
    List<ApprovalEmpDTO> findAllBTApprovalByEmployeeId(Map<String, Integer> params);
    List<ApprovalEmpDTO> findAllOApprovalByEmployeeId(Map<String, Integer> params);
    List<ApprovalEmpDTO> findAllRWApprovalByEmployeeId(Map<String, Integer> params);
    List<ApprovalEmpDTO> findAllVApprovalByEmployeeId(Map<String, Integer> params);
    ApprovalEmpDTO findBTDetailByApprovalId(int approvalId);
    ApprovalEmpDTO findODetailByApprovalId(int approvalId);
    ApprovalEmpDTO findRWDetailByApprovalId(int approvalId);
    ApprovalEmpDTO findVDetailByApprovalId(int approvalId);
    List<ApprovalEmpDTO> findAllBTApprovalByApproverId(Map<String, Integer> params);
}
