package com.nisum.ws.utenti.model.response;

import lombok.Builder;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.nisum.ws.utenti.model.entity.UtenteEntity}
 */
@Value
@Builder
public class LoginResponse implements Serializable {
    String username;
}
