CREATE TABLE user_tb
(
    id UUID,
    name VARCHAR(36),
    cpf VARCHAR(11),
    email VARCHAR(50),
    created_at timestamp,
    updated_at timestamp,
    CONSTRAINT user_pk PRIMARY KEY (id)
);

CREATE UNIQUE INDEX user_id_idx ON user_tb (id);