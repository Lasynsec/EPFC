/*Enable inserts*/
SET IDENTITY_INSERT dbo.livre_paru ON

alter table dbo.livre_paru add constraint gutenberg check(YEAR(date_parution) > 1434)

/*Test*/
insert into dbo.livre_paru (IDLIVRE,ISBN,TITRE,EDITEUR,LANGUE,PAYS,DATE_PARUTION,NB_PAGES,NUMOEUVRE) values (12,NULL,'Neuromencer','Flammarion','En','Angleterre','1434-11-21',145,3)
