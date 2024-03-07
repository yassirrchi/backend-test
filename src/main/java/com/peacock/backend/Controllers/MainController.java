package com.peacock.backend.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/live")
    public ResponseEntity<String> liveTest(){
        return ResponseEntity.ok("its live");
    }

}
