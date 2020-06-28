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
public class TrackerSingle3Test {

    @Test
    public void whenSingletonStaticEagerThenOneInstance() {
        TrackerSingle3 tracker = TrackerSingle3.getInstance();
        TrackerSingle3 tracker2 = TrackerSingle3.getInstance();
        assertThat(tracker, is(tracker2));
    }
}
