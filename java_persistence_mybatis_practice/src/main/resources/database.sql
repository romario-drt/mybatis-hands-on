--database name : java_persistence_mybatis;

CREATE TABLE address
(
    id      SERIAL PRIMARY KEY,
    street  VARCHAR(50),
    city    VARCHAR(50),
    state   VARCHAR(50),
    zip     VARCHAR(50),
    country VARCHAR(50)
);

create table student
(
    id         serial PRIMARY KEY,
    name       varchar(50) NOT NULL,
    email      varchar(50) NOT NULL,
    dob        date DEFAULT NULL,
    address_id INTEGER,
    CONSTRAINT fk_address FOREIGN KEY (address_id) REFERENCES address (id)
);

-- Insert dummy data
insert into address(street, city, state, zip, country)
VALUES ('street1', 'city1', 'state1', 'zip1', 'country1');
insert into address(street, city, state, zip, country)
VALUES ('street2', 'city2', 'state2', 'zip2', 'country2');

insert into student(name, email, dob, address_id)
values ('Student1', 'student1@gmail.com', '1983-06-25', 1);
insert into student(name, email, dob, address_id)
values ('Student2', 'student2@gmail.com', '1983-06-25', 2);

