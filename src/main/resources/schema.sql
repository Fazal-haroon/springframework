create table person
(
    ID integer not null,
    PERSON_NAME varchar(255) not null,
    LOCATION varchar(255),
    BIRTH_DATE timestamp,
    primary key(ID)
);

INSERT INTO PERSON (ID, PERSON_NAME, LOCATION, BIRTH_DATE )
VALUES(1,  'Fazal', 'Peshawar',NOW());
INSERT INTO PERSON (ID, PERSON_NAME, LOCATION, BIRTH_DATE )
VALUES(2,  'Haroon', 'Islamabad',NOW());
INSERT INTO PERSON (ID, PERSON_NAME, LOCATION, BIRTH_DATE )
VALUES(3,  'Khan', 'Lahore',NOW());
INSERT INTO PERSON (ID, PERSON_NAME, LOCATION, BIRTH_DATE )
VALUES(4,  'Khan', 'Islamabad',NOW());