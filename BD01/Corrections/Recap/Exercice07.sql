/*select h.nom
from Hamburger h
where h.ID IN (select m.ID_H from Mange m, Personne p where m.ID_P = p.ID and p.Poids > 100 and p.Sexe = "M")
and  h.ID NOT IN (*/select m.ID_H from Mange m, Personne p where m.ID_P = p.ID and p.Age > 30 and p.Sexe = "F"/*)*/