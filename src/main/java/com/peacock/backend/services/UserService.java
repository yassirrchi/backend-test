package com.peacock.backend.services;

import com.peacock.backend.dto.ClientDTO;
import com.peacock.backend.dto.CredentialsDTO;
import com.peacock.backend.dto.UserDTO;
import com.peacock.backend.entities.User;
import com.peacock.backend.mapper.UserMapper;
import com.peacock.backend.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.nio.CharBuffer;
import java.util.Optional;

@RequiredArgsConstructor
@Service

public class UserService {
    private final UserRepository userRepository;
    private  final PasswordEncoder passwordEncoder;
    private  final UserMapper userMapper;
    public UserDTO login(CredentialsDTO credentialsDTO){
       User user= userRepository.findByEmail(credentialsDTO.email()).orElseThrow(()->new RuntimeException("userNotFound"));
        if(passwordEncoder.matches(CharBuffer.wrap(credentialsDTO.password()),user.getPassword())){
            return userMapper.toUserDTO(user);
        }
        throw new RuntimeException("userNotFound");
    }

    public UserDTO createClient(ClientDTO clientDTO) {
        return null;
    }
}
