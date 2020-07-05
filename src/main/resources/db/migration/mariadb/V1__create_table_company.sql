CREATE TABLE spring_test.company (
	id 				BIGINT(20) 		PRIMARY KEY		AUTO_INCREMENT,
	cnpj 			VARCHAR(30) 	NOT NULL,
	social_reason 	VARCHAR(255) 	NOT NULL,
	created_at 		DATETIME 		NOT NULL,
	updated_at		DATETIME 		NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;