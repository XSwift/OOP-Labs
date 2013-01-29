In acest proiect aveti scheletul de cod pentru tema.

Proiectul contine 9 clase:

	* Dictionary - clasa ce defineste tipul dictionar. In ea este definit un constructor ce primeste ca parametru
	numele unui fisier text ce reprezinta dictionarul. Fisierul este citit linie cu linie. Trebuie sa procesati
	fiecare linie (strLine) pentru a obtine o pereche de tipul cheie-valoare, unde cheia este cuvantul din dictionar,
	iar valoarea este o lista cu indicii documentelor in care se gaseste cuvantul respectiv.
                     - Fiecare linie este impartita in string-uri, primul este luat drept cheie , iar restul sunt convertite la integer
                        si introduse intr-un vector. Apoi cele 2 sunt date ca parametru pentru insertie in Trie.
                     - Fiecare linie pe care se gaseste o interogare este data ca parametru ca atare pentru a fi prelucrata in ExTree.
                       Functia de inserare intoarce radacina arborelui , care este data ca parametru in functia rezultat, obtinandu-se ulterior 
                       rezultatul dorit.   

	* Main - clasa in care se gaseste metoda main.
        * Node - clasa pentru tipul Node al arborelui Trie in care sunt introduse cuvintele.
        * Trie - clasa ce contine functia de insert si cea de search , pentru inserarea respectiv cautarea unui cuvant in arbore.
        * ETNode - clasa pentru tipul ETNode al arborelui binar in care sunt introduse expresiile.
        * ExTree - clasa ce contine functia de inserare a unei expresii in Tree, de afisare a arborelui si cea de intoarcere a 
rezultatului expresiei
        * Stacks - Clasa in care se gasesc stivele
          - OStacks - Clasa cu stiva pentru operatori
          - TStacks - Clasa cu stiva pentru operanzi
        

May the source be with you!


