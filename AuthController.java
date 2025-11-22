package com.example.ecommerce.controller;

import com.example.ecommerce.model.User;
import com.example.ecommerce.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
  private final UserRepository userRepository;

  public AuthController(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @PostMapping("/register")
  public ResponseEntity<?> register(@RequestBody Map<String, String> body) {
    String username = body.get("username");
    String password = body.get("password");
    String email = body.get("email");
    if (username == null || password == null) {
      return ResponseEntity.badRequest().body(Map.of("status", "error", "message", "username/password required"));
    }
    if (userRepository.findByUsername(username).isPresent()) {
      return ResponseEntity.badRequest().body(Map.of("status", "error", "message", "username exists"));
    }
    User u = new User();
    u.setUsername(username);
    u.setPassword(password); // demo only
    u.setEmail(email);
    userRepository.save(u);
    return ResponseEntity.ok(Map.of("status", "ok", "id", u.getId()));
  }

  @PostMapping("/login")
  public ResponseEntity<?> login(@RequestBody Map<String, String> body) {
    String username = body.get("username");
    String password = body.get("password");
    var opt = userRepository.findByUsername(username);
    if (opt.isPresent() && opt.get().getPassword().equals(password)) {
      User u = opt.get();
      return ResponseEntity.ok(Map.of("status", "ok", "id", u.getId(), "username", u.getUsername()));
    }
    return ResponseEntity.status(401).body(Map.of("status", "error", "message", "Invalid credentials"));
  }
}
