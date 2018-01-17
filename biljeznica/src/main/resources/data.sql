INSERT INTO user(ime, prezime,username,password,enabled)
VALUES ('Ivo','Ivić','iivic','password', true);
INSERT INTO user(ime, prezime,username,password,enabled)
VALUES ('Marko','Markić','mmarkic','password', true);
INSERT INTO user(ime, prezime,username,password,enabled)
VALUES ('Pero','Perić','pperic','password', true);
INSERT INTO user(ime, prezime,username,password,enabled)
VALUES ('Adminko','Adminić','admin','password', true);
INSERT INTO user_role (username, role)
VALUES ('iivic', 'ROLE_USER');
INSERT INTO user_role (username, role)
VALUES ('mmarkic', 'ROLE_USER');
INSERT INTO user_role (username, role)
VALUES ('pperic', 'ROLE_USER');
INSERT INTO user_role (username, role)
VALUES ('admin', 'ROLE_USER');
INSERT INTO user_role (username, role)
VALUES ('admin', 'ROLE_ADMIN');
INSERT INTO biljeznica(naziv, opis)
VALUES('Web aplikacije u Javi', 'Bilješke s predavanja iz kolegija web aplikacije u Javi');
INSERT INTO biljeznica(naziv, opis)
VALUES('Razvoj aplikacija na Android platformi', 'Bilješke s predavanja kolegija razvoj
aplikacija na Android platformi');
INSERT INTO biljeznica(naziv, opis)
VALUES('Napredne teme računalnih mreža', 'Bilješke s predavanja napredne teme
računalnih mreža');
INSERT INTO biljeska(naslov, tekst, korisnik, biljeznica)
VALUES('Testni naslov', 'Testni tekst', 'iivic', 'Web aplikacije u Javi');