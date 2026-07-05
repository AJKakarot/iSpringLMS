package com.ajeet.ispringlms.user.dto.response;

import com.ajeet.ispringlms.user.enums.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
public class UserResponse {

    private Long id;

    private String name;

    private String email;

    private Role role;

    @Getter
    @Setter
    public static class UserRegistrationRequest {

        @NotBlank(message = "Name is required")
        private String name;

        @Email(message = "Invalid email")
        @NotBlank(message = "Email is required")
        private String email;

        @NotBlank(message = "Password is required")
        private String password;

    }
}