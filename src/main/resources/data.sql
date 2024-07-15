-- Password: admin
INSERT INTO Utente (username, password, email, data_creazione, role)
VALUES ('admin',
        'admin',
        'admin@gmail.com',
        '2022-12-31 23:59:59',
        'ROLE_ADMIN');
-- Password: test
INSERT INTO Utente (username, password, email, data_creazione, role)
VALUES ('test',
        'test',
        'test@gmail.com',
        '2022-12-31 23:59:59',
        'ROLE_USER');