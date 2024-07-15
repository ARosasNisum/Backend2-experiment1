package com.nisum.ws.utenti.controller;

import com.nisum.ws.utenti.model.request.RegisterRequest;
import com.nisum.ws.utenti.model.response.LoginResponse;
import com.nisum.ws.utenti.model.response.RegisterResponse;
import com.nisum.ws.utenti.model.response.UtenteListResponse;
import com.nisum.ws.utenti.service.UtentiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
public class UtenteController {
    private final UtentiService utentiService;

    @PostMapping(value = "/login")
    public ResponseEntity<LoginResponse> login(@RequestParam String username, @RequestParam String password) {
        return ResponseEntity.ok(utentiService.login(username, password));
    }

    @PostMapping(value = "/register")
    public ResponseEntity<RegisterResponse> register(@RequestBody RegisterRequest registerRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(utentiService.register(registerRequest));
    }

    @GetMapping(value = "/list")
    public ResponseEntity<List<UtenteListResponse>> utenteList() {
        return ResponseEntity.ok(utentiService.utenteList());
    }
}
