--liquibase formatted sql
--changeset martins:1

CREATE TABLE books
(
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL ,
    author VARCHAR(255) NOT NULL
)