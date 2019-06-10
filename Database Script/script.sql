DROP TABLE IF EXISTS clients;

CREATE TABLE clients (
  ClientID,
  FirstName,
  LastName,
  Phone,
  CellPhone int,
  Address varchar,
  Gender varchar,
  Password varchar,
  Email varchar,
  PRIMARY KEY (ClientID)
);


INSERT INTO clients (ClientID,FirstName,LastName,Phone,CellPhone,Address,Gender,Password,Email) 
VALUES (1,'Alex','De Assis',123456789,987654321,'Siempreviva 1234','Male','Password123','prueba@hotmail.com');
