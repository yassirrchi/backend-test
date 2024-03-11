package com.peacock.backend.Controllers;

import com.peacock.backend.dto.UserDTO;
import com.peacock.backend.entities.Product;
import com.peacock.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/all-users")
    public ResponseEntity<List<UserDTO>> getAllUsers(){


        return ResponseEntity.ok(userService.getAllUsers());
    }

}
