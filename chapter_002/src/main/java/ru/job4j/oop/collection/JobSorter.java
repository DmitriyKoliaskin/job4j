package ru.job4j.oop.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Impl task", 2),
                new Job("Impl task", 8),
                new Job("Reboot server", 1)
        );
        System.out.println(jobs);
        Collections.sort(jobs);
        System.out.println(jobs);
        Collections.sort(jobs, new JobDecsByName().thenComparing(new JobDescByPriority()));
        System.out.println(jobs);
        Collections.sort(jobs, new JobIncByName().thenComparing(new JobIncByPriority()));
        System.out.println(jobs);
    }
}
