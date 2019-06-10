CREATE TABLE clients (
  ClientID BIGINT NOT NULL,
  FirstName VARCHAR,
  LastName VARCHAR,
  Phone INT,
  CellPhone INT,
  Address VARCHAR,
  Gender VARCHAR,
  Password VARCHAR,
  Email VARCHAR,
  PRIMARY KEY (ClientID)
);

CREATE TABLE
    hibernate_sequence
    (
        next_val BIGINT
);

INSERT INTO clients (ClientID, FirstName, LastName, Phone, CellPhone, Address, Gender, Password, Email) VALUES
(1, 'Alex', 'De Assis', 123456789, 987654321, 'Siempreviva 1234', 'Male', 'Password123', 'prueba@hotmail.com');

INSERT INTO hibernate_sequence (next_val) VALUES (2);