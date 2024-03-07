package com.peacock.backend.Controllers;

import com.peacock.backend.dto.CredentialsDTO;
import com.peacock.backend.dto.UserDTO;
import com.peacock.backend.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor

public class AuthController {
    private final UserService userService;
    @PostMapping("/login")
    public ResponseEntity<UserDTO> login(@RequestBody CredentialsDTO credentialsDTO){
        UserDTO userDTO=userService.login(credentialsDTO);
        return ResponseEntity.ok(userDTO);



    }
}
