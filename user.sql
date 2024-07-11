create table "user"
(
    id   serial
        constraint user_pk
            primary key,
    name varchar(64)
);

alter table "user"
    owner to "user";

INSERT INTO public."user" (id, name) VALUES (1, 'Francisco');
