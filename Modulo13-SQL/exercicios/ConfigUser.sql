-- exercise 1
CREATE DATABASE ml_app_consultorio;

CREATE USER 'ml_app_user1'@'localhost' IDENTIFIED BY 'ml_app_user1';
GRANT SELECT, INSERT, UPDATE ON ml_app_consultorio.* TO 'ml_app_user1'@'localhost';

-- exercise 2

CREATE USER 'ml_app_user2'@'localhost' IDENTIFIED BY 'ml_app_user2';
GRANT ALL PRIVILEGES ON ml_app_consultorio.*  TO 'ml_app_user2'@'localhost';

-- exercise 3

CREATE USER 'ml_app_user3'@'localhost' IDENTIFIED BY 'ml_app_user3';
GRANT SELECT ON ml_app_consultorio.*  TO 'ml_app_user3'@'localhost';