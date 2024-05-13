package org.highfives.grid.user.command.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.highfives.grid.user.command.dto.UserDTO;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class ResAddUserVO {

    private int statusCode;
    private String message;
    private String href;
    private List<UserDTO> result;
}
