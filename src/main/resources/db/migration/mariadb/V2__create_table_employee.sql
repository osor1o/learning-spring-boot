CREATE TABLE employee (
	id				BIGINT(20)	PRIMARY KEY		AUTO_INCREMENT,
	name			VARCHAR(80)	NOT NULL,
	password		VARCHAR(80)	NOT NULL,
	cpf				VARCHAR(11)	NOT NULL,
	hourly_value	BIGINT(20)	NULL,
	hours_worked 	BIGINT(20)	NULL,
	lunch_hours 	BIGINT(20)	NULL,
	profile			VARCHAR(80)	NOT NULL,
	created_at 		DATETIME 	NOT NULL,
	updated_at 		DATETIME 	NOT NULL,
	company 		BIGINT(20)	NOT NULL,
	
	FOREIGN KEY		(company) 	REFERENCES 		company(id)
	
) ENGINE=InnoDB DEFAULT CHARSET=utf8;