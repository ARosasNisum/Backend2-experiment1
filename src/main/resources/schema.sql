CREATE TABLE IF NOT EXISTS Utente
(
    id             BIGINT PRIMARY KEY AUTO_INCREMENT,
    username       VARCHAR(40) UNIQUE           NOT NULL,
    password       VARCHAR(40) DEFAULT '123456' NOT NULL,
    email          VARCHAR(100)                 NOT NULL,
    data_creazione TIMESTAMP                    NOT NULL,
    role           VARCHAR(30)                  NOT NULL
);

CREATE UNIQUE INDEX IF NOT EXISTS ID_UTENTE_IDX ON Utente (id);
CREATE UNIQUE INDEX IF NOT EXISTS USERNAME_UTENTE_IDX ON Utente (username);