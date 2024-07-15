package com.nisum.ws.utenti.model.request;

import lombok.Builder;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.nisum.ws.utenti.model.entity.UtenteEntity}
 */
@Value
@Builder
public class RegisterRequest implements Serializable {
    String username;
    String password;
    String email;
}