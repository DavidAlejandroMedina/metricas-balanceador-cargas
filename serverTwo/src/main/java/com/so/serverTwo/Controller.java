package com.so.serverTwo;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

        @GetMapping
        public ResponseEntity<?> getString() {

            return ResponseEntity.ok().body("Service Two :)");
        }
}
