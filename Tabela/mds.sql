/*


CREATE TABLE CLIENTES (
    CODICOC           INTEGER NOT NULL,
    NOMEC             VARCHAR(30) NOT NULL,
    CPFC              CHAR(12) NOT NULL,
    ENDERECOC         VARCHAR(30) NOT NULL,
    TELEFONEC         CHAR(12) NOT NULL,
    DATA_NASCIMENTOC  DATE NOT NULL,
    DATA_CADASTROC    DATE NOT NULL
);

  */


/******************************************************************************/
/****                             Primary Keys                             ****/
/******************************************************************************/

ALTER TABLE CLIENTES ADD CONSTRAINT PK_CLIENTES PRIMARY KEY (CODICOC);


/******************************************************************************/
/****                              Privileges                              ****/
/******************************************************************************/

