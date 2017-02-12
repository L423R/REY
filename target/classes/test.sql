#SELECT stavki.КодСтав, stavki.НаимСтав, stavki.ЕдИзм, stavki.КодВида, npr.НаимНПР, stavki.КодНПР, stavki.Ставка_Спец, stavki.Ставка_Маг, stavki.Примеч FROM stavki INNER JOIN npr ON stavki.КодНПР = npr.КодНПР WHERE stavki.КодВида=1;



SELECT rasp.КодРаспис, rasp.КодПреп, rasp.ДатаЗан, rasp.КодГруп, rasp.НачЗан, rasp.КолЧас, rasp.Семестр, rasp.КодДисц, rasp.ТипЗан, rasp.ТипСтуд, rasp.День, disc.НаимДисц, preps.Фамилия, preps.Имя, preps.Отчество, rasp.Ставка, rasp.ПрОпл, rasp.Оборуд, rasp.Примеч, rasp.Аудит, concat(preps.Фамилия,' ', LEFT(preps.Имя,1),'.', LEFT(preps.Отчество,1),'.') AS IO
FROM (rasp INNER JOIN disc ON rasp.КодДисц = disc.КодДисц) LEFT JOIN preps ON rasp.КодПреп = preps.КодПреп
WHERE rasp.ДатаЗан Between '2016-01-02' And '2017-01-02' AND rasp.КодГруп=179
ORDER BY rasp.ДатаЗан;

