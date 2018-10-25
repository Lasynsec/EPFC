1)
SELECT s.SNAME from (s join spj ON s.ID_S = spj.ID_S) JOIN p on spj.ID_P = p.ID_P where p.ID_P = 'p4';
2)
SELECT j.jNAME from (j join spj ON j.ID_j = spj.ID_j) JOIN s on spj.ID_s = s.ID_s where s.ID_s = 's1';
3)
SELECT p.COLOR from (p join spj ON p.ID_P = spj.ID_P) JOIN s on spj.ID_s = s.ID_s where s.ID_s = 's3';
4)
SELECT distinct p.PNAME from (p join spj ON p.ID_P = spj.ID_P) where spj.QTY >= 150 and spj.QTY <= 250;
5)
SELECT distinct p.ID_P from (p join spj ON p.ID_P = spj.ID_P) JOIN s on spj.ID_s = s.ID_s where p.CITY = 'London' and s.city = 'Athens';
6)
SELECT s.SNAME as NAME, p.PNAME as PIECE, j.JNAME as PROJET, spj.QTY as QUANTITE FROM s JOIN spj ON s.ID_S = spj.ID_S JOIN p ON p.ID_p = spj.ID_p JOIN j ON p.ID_p = spj.ID_p;
7)
SELECT distinct j.CITY from (j join spj ON j.ID_j = spj.ID_j) JOIN s on spj.ID_s = s.ID_s where s.SNAME = 'Adams';