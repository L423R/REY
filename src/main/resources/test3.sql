SELECT rasp.КодРаспис, rasp.ДатаЗан, rasp.НачЗан, rasp.КолЧас, rasp.ТипЗан, rasp.ТипСтуд, rasp.День, disc.НаимДисц,  rasp.Ставка, rasp.ПрОпл, preps.Фамилия, preps.Имя, preps.Отчество, rasp.Примеч, concat(preps.Фамилия,' ', LEFT(preps.Имя,1),'.', LEFT(preps.Отчество,1),'.') AS IO
FROM (rasp INNER JOIN disc ON rasp.КодДисц = disc.КодДисц) LEFT JOIN preps ON rasp.КодПреп = preps.КодПреп
WHERE rasp.ДатаЗан Between '2016-01-02' And '2017-01-02' AND rasp.КодГруп=179
ORDER BY rasp.ДатаЗан;
