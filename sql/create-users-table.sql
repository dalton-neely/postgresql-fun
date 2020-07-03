DROP TABLE IF EXISTS Users;

CREATE TABLE Users (
    id bigserial NOT NULL primary key,
    firstName varchar(25) NOT NULL,
    lastName varchar(25) NOT NULL
);