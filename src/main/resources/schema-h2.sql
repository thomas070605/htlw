create table person
(
    id integer not null primary key ,
    name varchar,
    last_name varchar,
    birth_date date
);

insert into person values (1, 'Test', 'Tester', '2000-01-01');
