package com.nisum.ws.utenti.model.entity;

import com.nisum.ws.utenti.model.constant.RoleEnum;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Utente")
@EntityListeners(AuditingEntityListener.class)
public class UtenteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    private String email;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCreazione;

    @Enumerated(EnumType.STRING)
    private RoleEnum role;

}