package ru.job4j.tracker.singleton;

import org.junit.Test;

import static org.junit.Assert.assertSame;

/**
 * Тестирование 4-х вариантов singleton.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $2.0$
 * @since 28.06.2020
 */
public class TrackerSingle1Test {

    @Test
    public void whenSingletonEnumThenOneInstance() {
        TrackerSingle1 trackerEnum1 = TrackerSingle1.INSTANCE;
        TrackerSingle1 trackerEnum2 = TrackerSingle1.INSTANCE;
        assertSame(trackerEnum1, trackerEnum2);
    }
}
