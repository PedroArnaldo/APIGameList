CREATE TABLE games(
    id SERIAL PRIMARY KEY,
    title TEXT NOT NULL,
    image TEXT,
    price INTEGER NOT NULL
);