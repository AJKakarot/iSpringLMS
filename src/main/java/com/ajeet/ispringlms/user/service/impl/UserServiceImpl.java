package com.ajeet.ispringlms.user.service.impl;

import com.ajeet.ispringlms.common.exception.EmailAlreadyExistsException;
import com.ajeet.ispringlms.user.dto.response.UserResponse;
import com.ajeet.ispringlms.user.entity.User;
import com.ajeet.ispringlms.user.enums.Role;
import com.ajeet.ispringlms.user.repository.UserRepository;
import com.ajeet.ispringlms.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserResponse register(UserResponse.UserRegistrationRequest request) {

        if(userRepository.existsByEmail(request.getEmail())){

            throw new EmailAlreadyExistsException("Email already exists");

        }

        User user = User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(request.getPassword())
                .role(Role.STUDENT)
                .build();

        userRepository.save(user);


        User savedUser = userRepository.save(user);

        return UserResponse.builder()
                .id(savedUser.getId())
                .name(savedUser.getName())
                .email(savedUser.getEmail())
                .role(savedUser.getRole())
                .build();

    }

}