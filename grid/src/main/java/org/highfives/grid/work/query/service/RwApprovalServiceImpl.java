package org.highfives.grid.work.query.service;

import org.highfives.grid.work.query.aggregate.RwApproval;
import org.highfives.grid.work.query.dto.AdTimeDTO;
import org.highfives.grid.work.query.dto.RwApprovalDTO;
import org.highfives.grid.work.query.repository.RwApprovalMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RwApprovalServiceImpl implements RwApprovalService{

    private final RwApprovalMapper rwApprovalMapper;

    private final ModelMapper modelMapper;

    @Autowired
    public RwApprovalServiceImpl(RwApprovalMapper rwApprovalMapper, ModelMapper modelMapper) {
        this.rwApprovalMapper = rwApprovalMapper;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<RwApprovalDTO> findAllRw() {

        try{
            List<RwApproval> rwApprovalList = rwApprovalMapper.selectAllRw();

            // 조회된 requestId로 employee 조회 추가 필요

            List<RwApprovalDTO> findRwApprovalDTOList = rwApprovalList.stream()
                    .map(data -> modelMapper.map(data, RwApprovalDTO.class))
                    .collect(Collectors.toList());

            return findRwApprovalDTOList;
        } catch (Exception e) {
            // 예외 발생 시 빈 리스트 반환
            return Collections.emptyList();
        }

    }

    @Override
    public List<RwApprovalDTO> findRwByEmployeeId(int employeeId) {

        List<RwApproval> rwApprovalList = rwApprovalMapper.selectRwByEmployeeId(employeeId);

        // 조회된 requestId로 employee 조회 추가 필요

        List<RwApprovalDTO> findRwApprovalDTOList = rwApprovalList.stream()
                .map(data -> modelMapper.map(data, RwApprovalDTO.class))
                .collect(Collectors.toList());

        return findRwApprovalDTOList;
//        try{
//            List<RwApproval> rwApprovalList = rwApprovalMapper.selectRwByEmployeeId(employeeId);
//
//            // 조회된 requestId로 employee 조회 추가 필요
//
//            List<RwApprovalDTO> findRwApprovalDTOList = rwApprovalList.stream()
//                    .map(data -> modelMapper.map(data, RwApprovalDTO.class))
//                    .collect(Collectors.toList());
//
//            return findRwApprovalDTOList;
//        } catch (Exception e) {
//            // 예외 발생 시 빈 리스트 반환
//            return Collections.emptyList();
//        }
    }
}
