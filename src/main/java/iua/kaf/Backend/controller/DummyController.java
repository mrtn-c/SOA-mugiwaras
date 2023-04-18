package iua.kaf.Backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

    @GetMapping("/dummy")
    public ResponseEntity<Void> getDummy() {
        return ResponseEntity.ok().build();
    }
}
