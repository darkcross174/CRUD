package ru.netology.sort;

import ru.netology.domain.Issue;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Comparator;
import java.util.Date;

public class LeastRecentlyUpdate implements Comparator<Issue> {
    Date data1;
    Date data2;

    @Override
    public int compare(Issue o1, Issue o2) {
        String dat1 = o1.getDataUpdate();
        String dat2 = o2.getDataUpdate();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            data1 = format.parse(dat1);
        }

        catch (ParseException e){
            e.printStackTrace();
        }
        try {
            data2 = format.parse(dat2);
        }
        catch (ParseException e){
            e.printStackTrace();
        }

        return data1.compareTo(data2);
    }
}

