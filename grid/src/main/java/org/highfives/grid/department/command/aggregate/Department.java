package org.highfives.grid.department.command.aggregate;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "department")
@Getter
@NoArgsConstructor
@ToString
public class Department {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "department_name", length = 127, nullable = false)
    private String departmentName;

    @Column(name = "member_cnt", nullable = false)
    private int memberCnt;

    @Column(name = "department_status", length = 127, nullable = false)
    private String departmentStatus;

    @Column(name = "start_time", length = 127, nullable = false)
    private String startTime;

    @Column(name = "end_time", length = 127)
    private String endTime;

    @Column(name = "high_department", length = 127)
    private String highDepartment;

    @Column(name = "leader_id", nullable = false)
    private int leaderId;

    @Column(name = "department_code", nullable = false)
    private String departmentCode;

    @Builder
    public Department(int id, String departmentName, int memberCnt, String departmentStatus,
                      String startTime, String endTime, String highDepartment, int leaderId, String departmentCode) {
        this.id = id;
        this.departmentName = departmentName;
        this.memberCnt = memberCnt;
        this.departmentStatus = departmentStatus;
        this.startTime = startTime;
        this.endTime = endTime;
        this.highDepartment = highDepartment;
        this.leaderId = leaderId;
        this.departmentCode = departmentCode;
    }
}
