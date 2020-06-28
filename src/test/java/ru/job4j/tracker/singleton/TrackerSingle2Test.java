package ru.job4j.tracker.singleton;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тестирование 4-х вариантов singleton.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $2.0$
 * @since 28.06.2020
 */
public class TrackerSingle2Test {

    @Test
    public void whenSingletonHolderLazyThenOneInstance() {
        TrackerSingle2 trackerHolder1 = TrackerSingle2.getInstance();
        TrackerSingle2 trackerHolder2 = TrackerSingle2.getInstance();
        assertThat(trackerHolder1, is(trackerHolder2));
    }
}
