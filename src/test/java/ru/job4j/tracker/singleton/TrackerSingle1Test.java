package ru.job4j.tracker.singleton;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тестирование 4-х вариантов singleton.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $1.0$
 * @since 24.06.2020
 */
public class TrackerSingle1Test {

    @Test
    public void whenSingletonEnumThenOneInstance() {
        TrackerSingle1 trackerEnum1 = TrackerSingle1.INSTANCE;
        TrackerSingle1 trackerEnum2 = TrackerSingle1.INSTANCE;
        assertThat(trackerEnum1, is(trackerEnum2));
    }
}
