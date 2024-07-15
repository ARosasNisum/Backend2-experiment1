package com.nisum.ws.utenti.model.response;

import com.nisum.ws.utenti.model.constant.RoleEnum;
import lombok.Builder;
import lombok.Value;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link com.nisum.ws.utenti.model.entity.UtenteEntity}
 */
@Value
@Builder
public class UtenteListResponse implements Serializable {
    Long id;
    String username;
    String email;
    Date dataCreazione;
    RoleEnum role;
}