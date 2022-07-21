--<ScriptOptions statementTerminator=";"/>

CREATE TABLE student (
		id INT8[ ] NOT NULL,
		name VARCHAR(30)
	);

CREATE UNIQUE INDEX student_pkey ON student (id ASC);

ALTER TABLE student ADD CONSTRAINT student_pkey PRIMARY KEY (id);

