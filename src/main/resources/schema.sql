CREATE TABLE IF NOT EXISTS Item(
    id BIGINT NOT NULL,
    name varchar(255)  NOT NULL,
    price decimal(9,2)  NOT NULL,
    last_updated date  NOT NULL
);