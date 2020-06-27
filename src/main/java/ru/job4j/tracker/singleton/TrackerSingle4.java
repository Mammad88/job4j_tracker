package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Tracker;

/**
 * Четвертый вариант singleton, private static final class.
 * Lazy loading.
 * объект класса находиться в поле внутреннего класса.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $1.0$
 * @since 24.06.2020
 */
public class TrackerSingle4 {

    private TrackerSingle4() {
    }

    public static TrackerSingle4 getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final TrackerSingle4 INSTANCE = new TrackerSingle4();
    }

    private Tracker tracker = new Tracker();

    public Tracker getTracker() {
        return tracker;
    }
}
