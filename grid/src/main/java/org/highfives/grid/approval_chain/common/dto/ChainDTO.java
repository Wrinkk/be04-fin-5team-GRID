package org.highfives.grid.approval_chain.common.dto;

import lombok.*;
import org.highfives.grid.approval_chain.command.aggregate.ChainStatus;
import org.highfives.grid.user.query.dto.UserDTO;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ChainDTO {

    int stage;

    private int id;

    private String approvalTime;

    private ChainStatus chainStatus;

    private String comment;

    private int approvalId;

    private int employeeId;

    private int chainId;

    private UserDTO user;
}
