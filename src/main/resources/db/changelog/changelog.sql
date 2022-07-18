-- liquibase formatted sql

-- changeset liquibase:1
CREATE TABLE test_table (test_id INT, test_column VARCHAR, PRIMARY KEY (test_id))

-- changeset ken:2-add-users-table
    create table users (
       id  bigserial not null,
        name varchar(255),
        remarks varchar(255),
        primary key (id)
    )
