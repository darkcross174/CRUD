package ru.netology.repository;

import ru.netology.domain.Issue;

import java.util.ArrayList;
import java.util.List;

public class IssueRepository {
    private List<Issue> issues = new ArrayList<>();


    public void add(Issue issue) {
        issues.add(issue);
    }

    public List<Issue> getAll() {
        return issues;
    }

    public List<Issue> findOpen(List<Issue> issues) {
        List<Issue> result = new ArrayList<>();
        for (Issue issue : issues) {
            if (issue.isStatus()) {
                result.add(issue);
            }
        }
        return result;
    }

    public List<Issue> findClose(List<Issue> issues) {
        List<Issue> result = new ArrayList<>();
        for (Issue issue : issues) {
            if (issue.isStatus()) {
                result.add(issue);
            }
        }
        return result;
    }

    public void openById(List<Issue> issues, int id) {
        for (Issue issue : issues) {
            if (issue.getId() == id) {
                issue.setStatus(true);
            }
        }
    }

    public void closedById(List<Issue> issues, int id) {
        for (Issue issue : issues) {
            if (issue.getId() == id) {
                issue.setStatus(true);
            }
        }
    }
}