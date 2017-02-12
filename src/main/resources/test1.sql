SELECT groups.КодГр, groups.РасшПрог, rasp.Семестр, groups.СокрНГ, groups.ПрофПрог, groups.ДатаОткр, groups.ДатаЗакр
                FROM rasp INNER JOIN groups ON rasp.КодГруп = groups.КодГр
                WHERE rasp.ДатаЗан Between '2016-01-02' And '2017-01-02'
                GROUP BY groups.КодГр, groups.РасшПрог, rasp.Семестр, groups.СокрНГ, groups.ПрофПрог, groups.ДатаОткр, groups.ДатаЗакр
                HAVING groups.ДатаЗакр Is Null
                ORDER BY groups.РасшПрог