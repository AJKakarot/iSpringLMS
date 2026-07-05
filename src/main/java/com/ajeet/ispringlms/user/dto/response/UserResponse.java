package com.ajeet.ispringlms.user.dto.response;

import com.ajeet.ispringlms.user.enums.Role;
import lombok.Builder;
import lombok.Getter;

/**
 * Response DTO for user information.
 */
@Getter
@Builder
public class UserResponse {

    private Long id;

    private String name;

    private String email;

    private Role role;


}