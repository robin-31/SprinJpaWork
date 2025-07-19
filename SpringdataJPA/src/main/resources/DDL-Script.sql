-- "JPA".student_prod definition

-- Drop table

-- DROP TABLE "JPA".student_prod;

CREATE TABLE "JPA".student_prod (
	student_id int8 NOT NULL,
	city varchar(255) NULL,
	passout_year varchar(255) NULL,
	cgpa varchar(255) NULL,
	college_name varchar(255) NULL,
	course varchar(255) NULL,
	mail_id varchar(255) NOT NULL,
	student_name varchar(255) NULL,
	CONSTRAINT student_prod_pkey PRIMARY KEY (student_id),
	CONSTRAINT unquie_mailid UNIQUE (mail_id)
);