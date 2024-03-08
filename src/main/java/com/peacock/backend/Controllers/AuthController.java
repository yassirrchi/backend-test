package com.peacock.backend.Controllers;

import com.peacock.backend.Config.UserAuthProvider;
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
    private final UserAuthProvider userAuthProvider;
    @PostMapping("/login")
    public ResponseEntity<UserDTO> login(@RequestBody CredentialsDTO credentialsDTO){
        System.out.println("test");
        UserDTO user=userService.login(credentialsDTO);
        user.setToken(userAuthProvider.createToken(user));
        return ResponseEntity.ok(user);



    }
}
