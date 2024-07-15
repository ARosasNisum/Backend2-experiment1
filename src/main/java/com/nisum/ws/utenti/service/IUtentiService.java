package com.nisum.ws.utenti.service;

import com.nisum.ws.utenti.model.constant.RoleEnum;
import com.nisum.ws.utenti.model.entity.UtenteEntity;
import com.nisum.ws.utenti.model.request.RegisterRequest;
import com.nisum.ws.utenti.model.response.LoginResponse;
import com.nisum.ws.utenti.model.response.RegisterResponse;
import com.nisum.ws.utenti.model.response.UtenteListResponse;
import com.nisum.ws.utenti.repository.UtenteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.security.auth.login.CredentialNotFoundException;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class IUtentiService implements UtentiService {

    private final UtenteRepository utenteRepository;

    @Override
    public LoginResponse login(String username, String password) {
        try {
            UtenteEntity utenteEntity = utenteRepository.findByUsernameAndPassword(username, password).orElseThrow(CredentialNotFoundException::new);

            return LoginResponse.builder().username(utenteEntity.getUsername()).build();
        } catch (CredentialNotFoundException e) {
            log.error("[IUtentiService][login] Usuario no encontrado | username: {}", username, e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public RegisterResponse register(RegisterRequest request) {
        UtenteEntity entityRequest = UtenteEntity.builder()
                .username(request.getUsername())
                .password(request.getPassword())
                .email(request.getEmail())
                .role(RoleEnum.ROLE_USER)
                .build();

        UtenteEntity entitySaved = utenteRepository.save(entityRequest);

        return RegisterResponse.builder().username(entitySaved.getUsername()).build();
    }

    @Override
    public List<UtenteListResponse> utenteList() {
        List<UtenteEntity> utenteList = utenteRepository.findAll();

        return utenteList.stream()
                .map(utente -> UtenteListResponse.builder()
                        .id(utente.getId())
                        .username(utente.getUsername())
                        .email(utente.getEmail())
                        .role(utente.getRole())
                        .dataCreazione(utente.getDataCreazione())
                        .build()).toList();
    }


}
