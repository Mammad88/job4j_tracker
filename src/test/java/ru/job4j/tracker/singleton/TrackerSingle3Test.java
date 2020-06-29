package ru.job4j.tracker.singleton;

import org.junit.Test;

import static org.junit.Assert.assertSame;

/**
 * Тестирование 4-х вариантов singleton.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $3.0$
 * @since 29.06.2020
 */
public class TrackerSingle3Test {

    @Test
    public void whenSingletonStaticEagerThenOneInstance() {
        TrackerSingle3 tracker = TrackerSingle3.getInstance();
        TrackerSingle3 tracker2 = TrackerSingle3.getInstance();
        assertSame(tracker, tracker2);
    }
}
