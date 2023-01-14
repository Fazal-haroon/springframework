create table person
(
    id integer not null,
    name varchar(255) not null,
    location varchar(255),
    birth_date timestamp,
    primary key(id)
);

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE )
VALUES(1,  'Fazal', 'Peshawar',NOW());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE )
VALUES(2,  'Haroon', 'Islamabad',NOW());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE )
VALUES(3,  'Khan', 'Lahore',NOW());