/*1. Quantitat de registres de la taula de vols: */

SELECT count(*) FROM flights;
 
/*2. Retard promig de sortida i arribada segons l’aeroport origen. */


SELECT origin, AVG(arrdelay), AVG(depdelay)  FROM flights GROUP BY origin;

 
/*3. Retard promig d’arribada dels vols, per mesos i segons l’aeroport origen. A més, volen que els resultat es mostrin de la següent forma (fixa’t en l’ordre de les files): LAX, 2000, 01, retard LAX, 2000, ​02​, retard LAX, 2000, ​03​, retard … LAX, 2000, ​12​, retard LAX, ​2001​, ​01​, retard … LAX, 2001, ​12​, retard ONT​, ​2000​, ​01​, retard ONT, 2000, ​02​, retard etc.*/ 
 
SELECT origin, f.Year, f.Month, AVG(arrdelay) FROM flights as f GROUP BY origin, f.Year, f.Month ORDER BY origin;
 
/*4. Retard promig d’arribada dels vols, per mesos i segons l’aeroport origen (mateixa consulta que abans i amb el mateix ordre). Però a més, ara volen que en comptes del codi de l’aeroport es mostri el nom de la ciutat. Los Angeles, 2000, 01, retard Los Angeles, 2000, 02, retard */
 
 SELECT a.city, f.Year, f.Month, AVG(arrdelay) FROM flights as f LEFT JOIN airports as a ON a.iata = f.origin  GROUP BY a.city, f.Year, f.Month;
 
/*5. Les companyies amb més vols cancelats. A més, han d’estar ordenades de forma que les companyies amb més cancelacions apareguin les primeres. */
 
SELECT c.Description, COUNT(f.Cancelled) FROM flights as f LEFT JOIN carriers as c on c.Code = f.UniqueCarrier GROUP BY c.Description ORDER BY COUNT(f.Cancelled) DESC;
 
/*6. L’identificador dels 10 avions que més distància han recorregut fent vols. */
 
 SELECT TailNum, SUM(Distance) FROM flights GROUP BY TailNum LIMIT 10;
 
/*7. Companyies amb el seu retard promig només d’aquelles les quals els seus vols arriben al seu destí amb un retràs promig major de 10 minuts. */

SELECT c.Description, AVG(f.ArrDelay) FROM flights as f LEFT JOIN carriers as c on c.Code = f.UniqueCarrier GROUP BY c.Description HAVING AVG(f.ArrDelay) >10;