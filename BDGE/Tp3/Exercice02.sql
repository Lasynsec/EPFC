alter table dbo.oeuvre add constraint specificGenders check(GENRE in('Roman','théâtre','essai','poésie','Musique','Biographie','informatique'))
/*test*/
insert into dbo.œuvre (IDOEUVRE,TITRE,ANNEE,GENRE,LANGUE) values (9,'Necromencer',1985,'Action','En')
