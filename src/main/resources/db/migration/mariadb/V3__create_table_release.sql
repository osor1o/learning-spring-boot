CREATE TABLE spring_test.release (
	id				BIGINT(20)		PRIMARY KEY		AUTO_INCREMENT,
	date			TIMESTAMP		NOT NULL,
	description		VARCHAR(255)	NOT NULL,
	address			VARCHAR(255)	NOT NULL,
	createdAt		DATETIME		NOT NULL,
	updatedAt		DATETIME		NOT NULL,
	type			VARCHAR(255)	NOT NULL,
	employee		BIGINT(20)		NOT NULL,
	
	FOREIGN KEY		(employee) 		REFERENCES 		employee(id)

) ENGINE=InnoDB DEFAULT CHARSET=utf8;