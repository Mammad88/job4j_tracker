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
public class TrackerSingle4Test {

    @Test
    public void whenSingletonStaticLazyThenOneInstance() {
        TrackerSingle4 tracker = TrackerSingle4.getInstance();
        TrackerSingle4 tracker2 = TrackerSingle4.getInstance();
        assertThat(tracker, is(tracker2));
    }
}
