package com.peacock.backend.dto;

import com.peacock.backend.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class UserDTO {
    private Long id;

    private String email;

    private String token;
    private String role;

}
