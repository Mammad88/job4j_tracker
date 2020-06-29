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
public class TrackerSingle4Test {

    @Test
    public void whenSingletonStaticLazyThenOneInstance() {
        TrackerSingle4 tracker = TrackerSingle4.getInstance();
        TrackerSingle4 tracker2 = TrackerSingle4.getInstance();
        assertSame(tracker, tracker2);
    }
}
