# Traffic Lights
A feladat a következő:
Van egy **x** hosszúságú utca, amelynek a különböző pozíciói meg vannak számozva: 0, 1, ... x <br/>
Jelenleg nincs egyetlen közlekedési lámpa sem az utcában, most azonban egyesével ki lesz helyezve **n** darab. <br/>
A feladat kiszámolni a pillanatnyilag leghosszabb jelzőlámpa nélküli útszakaszt minden egyes lámpa hozzáadása után.

## Input
Az első bemeneti sor két **egész számot** tartalmaz: **x** és **n** (**x** az utca hossza, **n** a jelzőlámpák száma) <br/>
A következő bemeneti sor tartalmaz **n** darab egész számot: az egyes jelzőlámpák pozícióját. Minden pozíció különböző.

## Output
Ki kell írni minden jelzőlámpa hozzáadása után a leghosszabb lámpa nélküli útszakaszt a konzolra.

## Ötletek

<ins> A legelső jelzőlámpa kihelyezése utáni leghosszabb útszakasz kiszámítása: </ins> <br/>
Ha a beolvasott pozíció **kisebb**, mint utcahossz/2, akkor a **leghosszabb szakasz** = utcahossz - beolvasott pozíció. <br/>
Ha a beolvasott pozíció **nagyobb, vagy egyenlő**, mint utcahossz/2, akkor a **leghosszabb szakasz** megegyezik a beolvasott pozícióval.
