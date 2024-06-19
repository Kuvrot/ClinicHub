CREATE DATABASE clinichub;

use clinichub;

CREATE TABLE patients(

p_id int auto_increment,
p_name varchar (50),
p_age int,
p_sex varchar(10),
p_phone varchar(15),
p_allergies varchar(256),
p_additional_info varchar (500),
PRIMARY KEY (p_id)
);

