package ru.job4j.tracker.singleton;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerSingle2Test {

    @Test
    public void whenSingletonHolderLazyThenOneInstance() {
        TrackerSingle2 trackerHolder1 = TrackerSingle2.getInstance();
        TrackerSingle2 trackerHolder2 = TrackerSingle2.getInstance();
        assertThat(trackerHolder1, is(trackerHolder2));
    }
}
