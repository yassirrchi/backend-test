package com.peacock.backend.Controllers;

import com.peacock.backend.dto.ClientDTO;
import com.peacock.backend.dto.UserDTO;
import com.peacock.backend.entities.User;
import com.peacock.backend.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequiredArgsConstructor
public class MainController {
    private final UserService userService;
    @GetMapping("/live")
    public ResponseEntity<String> liveTest(){
        return ResponseEntity.ok("its live");
    }





}
