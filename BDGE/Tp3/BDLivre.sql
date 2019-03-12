
/* Création Base de données BDLivre */

CREATE DATABASE BDLivre;
GO

/* Utilisation DB */
USE BDLivre;

/* Création des types */
/* Remarques : pas de check sur les types en SQL Server  */
CREATE TYPE TNOM FROM VARCHAR(20) ;
CREATE TYPE TPRENOM  FROM VARCHAR(15) ;
CREATE TYPE TTITRE  FROM VARCHAR(50);
CREATE TYPE TGENRE  FROM VARCHAR(15);
CREATE TYPE TLANGUE  FROM CHAR(2);
CREATE TYPE TANNEE FROM INT; 
CREATE TYPE TSEXE FROM CHAR(1);
CREATE TYPE TISBN FROM VARCHAR(15)
GO


/* Créations des tables */

/* Table Oeuvre */
CREATE TABLE œuvre (
  IDOEUVRE	INT NOT NULL IDENTITY ,
  TITRE	TTITRE NOT NULL,
  ANNEE	TANNEE,
  GENRE	TGENRE,
  LANGUE	TLANGUE
 )
GO

/*Table  Traducteur_Ecrivain */
CREATE TABLE traducteur_ecrivain (
  IDTRAD_ECRIV INT NOT NULL IDENTITY,
  NOM TNOM NOT NULL,
  PRENOM	TPRENOM,
  DDN	DATE,
  DDD	DATE,
  NAT	TLANGUE,
  SEXE TSEXE
 )
GO

/* Table ecrit_par */
CREATE TABLE ecrit_par(numOeuvre INT NOT NULL, numEcriv INT NOT NULL)
GO

/* Table Livre */

CREATE TABLE livre_paru (
  IDLIVRE	INT NOT NULL IDENTITY,  
  ISBN	TISBN,
  TITRE	TTITRE NOT NULL,
  EDITEUR	TNOM,
  LANGUE	TLANGUE,
  PAYS	TNOM,
  DATE_PARUTION	DATE,
  NB_PAGES	INT,
  NUMOEUVRE	INT
 )
GO

/* Table traduit_par */

CREATE TABLE traduit_par (numLivre INT NOT NULL, numTrad INT NOT NULL)
GO

/* Contraintes de clés primaires et étrangères : */

/* Table Œuvre */
ALTER TABLE Oeuvre ADD CONSTRAINT PK_Oeuvre PRIMARY KEY (idOeuvre) 
GO

/* Table livre_paru */
ALTER TABLE Livre_paru ADD CONSTRAINT PK_Livre PRIMARY KEY (idLivre) 
ALTER TABLE livre_paru ADD CONSTRAINT FK_Livre FOREIGN KEY (numoeuvre) REFERENCES Oeuvre(idoeuvre) ON DELETE SET NULL  on update cascade
GO

/* Table Traducteur_Ecrivain */
ALTER TABLE  Traducteur_Ecrivain  ADD CONSTRAINT PK_TRAD_ECRIV PRIMARY KEY (IDTRAD_ECRIV) 
GO

/* Table Traduit_Par */
ALTER TABLE TRADUIT_PAR ADD CONSTRAINT PK_traduit_par PRIMARY KEY (numlivre,numtrad) 
ALTER TABLE TRADUIT_PAR ADD CONSTRAINT FK_TRAD1 FOREIGN KEY (NUMLIVRE) REFERENCES LIVRE_PARU (IDLIVRE)  ON DELETE CASCADE on update cascade
ALTER TABLE TRADUIT_PAR ADD CONSTRAINT FK_TRAD2 FOREIGN KEY (NUMTRAD) REFERENCES TRADUCTEUR_ECRIVAIN (IDTRAD_ECRIV)  ON DELETE CASCADE on update cascade
GO

/* Table Ecrit_Par */
ALTER TABLE ECRIT_PAR ADD CONSTRAINT PK_ecrit_par PRIMARY KEY (numoeuvre, numecriv) 
ALTER TABLE ECRIT_PAR ADD CONSTRAINT FK_ECRIV1 FOREIGN KEY (NUMOEUVRE) REFERENCES OEUVRE (IDOEUVRE)  ON DELETE CASCADE on update cascade
ALTER TABLE ECRIT_PAR ADD CONSTRAINT FK_ECRIV2 FOREIGN KEY (NUMECRIV) REFERENCES TRADUCTEUR_ECRIVAIN (IDTRAD_ECRIV)  ON DELETE CASCADE on update cascade
GO



/* Encodage de tuples : illustration de la désactivation du champ identity*/
set IDENTITY_INSERT oeuvre ON
/* table oeuvre */
insert into oeuvre (IDOEUVRE,TITRE,ANNEE,GENRE,LANGUE)values(1,'The tragical history of Hamlet, Prince of Denmark',1603,'théâtre','En')
insert into oeuvre (IDOEUVRE,TITRE,ANNEE,GENRE,LANGUE) values(2,'Mais qui a tordu la trompette de Dizzy',2009,'Musique','Fr')
insert into oeuvre (IDOEUVRE,TITRE,ANNEE,GENRE,LANGUE) values(3,'The young man with the trumpet',1938,'Biographie','En')
insert into oeuvre (IDOEUVRE,TITRE,ANNEE,GENRE,LANGUE)values (4,'Don Quijote',1605,'Roman','Sp')
insert into oeuvre (IDOEUVRE,TITRE,ANNEE,GENRE,LANGUE)values (5,'La peste', 1947,'Roman','Fr')
insert into oeuvre(IDOEUVRE,TITRE,ANNEE,GENRE,LANGUE) values (6,'Programming in C++', 1989,'informatique','En')
insert into oeuvre (IDOEUVRE,TITRE,ANNEE,GENRE,LANGUE)values(7,'Caligula',1944,'théâtre','Fr')
insert into oeuvre (IDOEUVRE,TITRE,ANNEE,GENRE,LANGUE)values(8,'Il deserto dei Tartari ',1940,'roman','It')

set IDENTITY_INSERT Oeuvre OFF
GO



/* table traducteur_ecrivain */
set identity_insert traducteur_ecrivain on
insert into traducteur_ecrivain (idTrad_Ecriv, nom, prenom, nat, sexe,DDN,DDD) values(1,'Camus','Albert','Fr','M','1913-11-07','1960-01-04')
insert into traducteur_ecrivain (idTrad_Ecriv, nom, prenom, nat, sexe,DDN) values(2,'Nothomb','Amélie','Be','F','1967-08-13')
insert into traducteur_ecrivain (idTrad_Ecriv, nom, prenom, nat, sexe) values(3,'Badinter','Elisabeth','Fr','F')
insert into traducteur_ecrivain (idTrad_Ecriv, nom, prenom, nat, sexe) values(4,'Simenon','Georges','Be','M')
insert into traducteur_ecrivain (idTrad_Ecriv, nom, prenom, nat, sexe,DDN,DDD) values(5,'Vian','Boris','Fr','M','1920-03-10','1959-06-23')
insert into traducteur_ecrivain (idTrad_Ecriv, nom, prenom, nat, sexe) values (6,'Baker','Dorothy','En','F')
insert into traducteur_Ecrivain(idTrad_Ecriv,nom,prenom,nat,sexe) values (7,'Costemalle','Bruno','Fr','M')
insert into traducteur_Ecrivain(idTrad_Ecriv,nom,prenom,nat,sexe) values (8,'Shakespeare','William','En','M')
insert into traducteur_Ecrivain(idTrad_Ecriv,nom,prenom,nat,sexe) values (9,'Cervantes','Miguel','Sp','M')
insert into traducteur_Ecrivain(idTrad_Ecriv,nom,prenom,nat,sexe,DDN,DDD) values (10,'Buzzati','Dino','It','M','1906-10-10','1972-01-19')
insert into traducteur_Ecrivain(idTrad_Ecriv,nom,prenom,nat,sexe) values (11,'Dewhurst','Stephen','US','M')
insert into traducteur_Ecrivain(idTrad_Ecriv,nom,prenom,nat,sexe) values (12,'Stark','Katy','US','F')
insert into traducteur_Ecrivain(idTrad_Ecriv,nom,prenom,nat,sexe) values (13,'Adam','Anne','Be','F')
insert into traducteur_Ecrivain(idTrad_Ecriv,nom,prenom,nat,sexe) values (14,'Minelli','Lucia','It','F')
insert into traducteur_Ecrivain(idTrad_Ecriv,nom,prenom,nat,sexe) values (15,'Vandamme','Mark','Nl','M')

set identity_insert traducteur_ecrivain off
GO

/* table ecrit_par  illustration d'un select dans un insert*/
insert into ecrit_par(numoeuvre,numecriv) values ((select idoeuvre from œuvre where TITRE = 'The tragical history of Hamlet, Prince of Denmark'),8)
insert into ecrit_par(numoeuvre,numecriv) values (
	(select idoeuvre from œuvre where TITRE = 'Mais qui a tordu la trompette de Dizzy'),7)

insert into ecrit_par(numoeuvre,numecriv) values (
	(select idoeuvre from œuvre where TITRE = 'The young man with the trumpet'),6)
insert into ecrit_par(numoeuvre,numecriv) values (
	(select idoeuvre from œuvre where TITRE = 'Don Quijote'),9)
insert into ecrit_par(numoeuvre,numecriv) values (6,11)
insert into ecrit_par(numoeuvre,numecriv) values (6,12)
insert into ecrit_par(numoeuvre,numecriv) values (5,1)
insert into ecrit_par(numoeuvre,numecriv) values (7,1)
insert into ecrit_par(numoeuvre,numecriv) values (8,10)
GO
/* table livre_paru */
set identity_insert livre_paru on
insert into livre_paru (idlivre, titre, editeur, langue, date_parution, pays, nb_Pages, numoeuvre) 
	values (1,'Mais qui a tordu la trompette de Dizzy','Nova','Fr','2009-11-18','France',144,
	(select idoeuvre from œuvre where TITRE = 'Mais qui a tordu la trompette de Dizzy'))
insert into livre_paru (idlivre, titre, editeur, langue, date_parution, pays, nb_Pages, numoeuvre) 
	values(3,'El muchacho con la trompeta','Arte nuevo','Es','1988-01-01','Espagne',287,
	(select idoeuvre from œuvre where TITRE = 'The young man with the trumpet'))
insert into livre_paru (idlivre, titre, editeur, langue, date_parution, pays, nb_Pages, numoeuvre) 
	values (2,'Le jeune homme à la trompette','Flammarion','Fr','1991-01-01','France',null,
	(select idoeuvre from œuvre where TITRE = 'The young man with the trumpet'))
insert into livre_paru(IDLIVRE,TITRE,LANGUE,NUMOEUVRE) values(4,'Don Quichotte','Fr',
	(SELECT idOeuvre FROM œuvre WHERE TITRE = 'Don Quijote'))
insert into livre_paru(IDLIVRE,TITRE,LANGUE,NUMOEUVRE) values(7,'Don Quijote','Es',
	(SELECT idOeuvre FROM œuvre WHERE TITRE = 'Don Quijote'))
insert into livre_paru(IDLIVRE,TITRE,LANGUE,NUMOEUVRE) values(5,'Don Quichot','Nl',
	(SELECT idOeuvre FROM œuvre WHERE TITRE = 'Don Quijote'))
insert into livre_paru(IDLIVRE,TITRE,NUMOEUVRE) values(6,'L''histoire tragique de Hamlet, Prince du Danemark',
	(select idoeuvre from œuvre where TITRE = 'The tragical history of Hamlet, Prince of Denmark'))

insert into livre_paru (idlivre, titre, editeur, langue, date_parution, pays, nb_Pages, numoeuvre)  values(8,'La peste','Flammarion','Fr','2005-06-05','France',310,
	(select idoeuvre from œuvre where TITRE = 'La peste'))
insert into livre_paru (idlivre, titre, editeur, langue, date_parution, pays, nb_Pages, numoeuvre)  values(9,'Die peste','Pies','De','2001-01-05','Allemagne',304,
	(select idoeuvre from œuvre where TITRE = 'La peste'))
insert into livre_paru (idlivre, titre, editeur, langue, date_parution, pays, nb_Pages, numoeuvre)  values(10,'Programmer en C++','Masson','Fr','2005-06-05','France',185,
	(select idoeuvre from œuvre where TITRE = 'Programming in C++'))
insert into livre_paru(IDLIVRE,TITRE,NUMOEUVRE) values(11,'Caligula',7)
	

set identity_insert livre_paru off
GO
/* table traduit_par */
insert into traduit_par(numlivre,numtrad) values (3,5)
insert into traduit_par(numLivre,numTrad) VALUES (4,13)
insert into traduit_par(numLivre,numTrad) VALUES (4,7)
insert into traduit_par(numLivre,numTrad) VALUES (5,15)
insert into traduit_par(numLivre,numTrad) VALUES (6,13)
insert into traduit_par(numLivre,numTrad) VALUES (9,13)
insert into traduit_par(numLivre,numTrad) VALUES (10,7)


GO
