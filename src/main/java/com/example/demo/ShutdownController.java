package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ShutdownController {

    private ShutdownService shutdownService;

    @DeleteMapping("/shutdown")
    public ResponseEntity<?> shutdown() {
        shutdownService.shutdown();
        return ResponseEntity.ok().build();
    }

}
