package ru.netology.sort;

import java.util.Comparator;
import ru.netology.domain.Issue;

public class MostCommented implements Comparator<Issue> {

    @Override
    public int compare(Issue o1, Issue o2) {
        return o2.getCountComment() - o1.getCountComment();
    }

}
