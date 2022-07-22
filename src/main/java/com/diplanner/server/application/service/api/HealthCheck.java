package com.diplanner.server.application.service.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
  @GetMapping("/healthCheck")
  public ResponseEntity<?> healthCheckResponse() {
    try {
      return ResponseEntity.ok().body("Server is running Now");
    } catch (Exception ex) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
    }
  }

}
