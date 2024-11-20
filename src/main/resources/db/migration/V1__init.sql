CREATE TABLE customer (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL
);
CREATE TABLE client (
                        id SERIAL PRIMARY KEY,
                        name VARCHAR(100) NOT NULL,
                        email VARCHAR(100) UNIQUE NOT NULL,
                        phone VARCHAR(20),
                        address TEXT
);
CREATE TABLE activity (
                          id SERIAL PRIMARY KEY,
                          client_id INT NOT NULL,
                          activity_date DATE NOT NULL,
                          description TEXT NOT NULL,
                          duration INT,
                          FOREIGN KEY (client_id) REFERENCES client (id)
);
CREATE TABLE invoice (
                         id SERIAL PRIMARY KEY,
                         client_id INT NOT NULL,
                         invoice_date DATE NOT NULL,
                         total_amount DECIMAL(10, 2) NOT NULL,
                         status VARCHAR(50) DEFAULT 'Pending',
                         FOREIGN KEY (client_id) REFERENCES client (id)
);

