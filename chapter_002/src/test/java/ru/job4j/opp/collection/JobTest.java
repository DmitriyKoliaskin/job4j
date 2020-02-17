package ru.job4j.opp.collection;

import org.junit.Test;
import ru.job4j.oop.collection.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;


public class JobTest {
    @Test
    public void whenComparatorByNameAndPriorityDesc() {
        Comparator<Job> cmpNamePriority = new JobDecsByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Aeboy", 7)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByNameAndPriorityInc() {
        Comparator<Job> cmpNamePriority = new JobIncByName().thenComparing(new JobIncByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 7)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenDescByName() {
        Comparator<Job> cmpName = new JobDecsByName();
        int rsl = cmpName.compare(
                new Job("Impl task", 0),
                new Job("Bug", 7)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenIncByName() {
        Comparator<Job> cmpName = new JobIncByName();
        int rsl = cmpName.compare(
                new Job("Bug", 7),
                new Job("Impl task", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenDescByPriority() {
        Comparator<Job> cmpPriority = new JobDescByPriority();
        int rsl = cmpPriority.compare(
                new Job("Bug", 5),
                new Job("Bug", 2)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenIncByPriority() {
        Comparator<Job> cmpPriority = new JobIncByPriority();
        int rsl = cmpPriority.compare(
                new Job("Bug", 2),
                new Job("Bug", 5)
        );
        assertThat(rsl, lessThan(0));
    }
}
