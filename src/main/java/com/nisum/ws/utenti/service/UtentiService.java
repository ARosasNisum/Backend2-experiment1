package com.nisum.ws.utenti.service;

import com.nisum.ws.utenti.model.request.RegisterRequest;
import com.nisum.ws.utenti.model.response.LoginResponse;
import com.nisum.ws.utenti.model.response.RegisterResponse;
import com.nisum.ws.utenti.model.response.UtenteListResponse;

import java.util.List;

public interface UtentiService {
    LoginResponse login(String username, String password);

    RegisterResponse register(RegisterRequest request);

    List<UtenteListResponse> utenteList();
}
