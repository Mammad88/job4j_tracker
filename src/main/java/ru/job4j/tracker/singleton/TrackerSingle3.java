package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Tracker;

/**
 * Третий вариант singleton, static final field.
 * Этот вариант вариант похож на предыдущей.
 * Основное отличие, мы сразу создаем и инициализируем объект.
 * Eager loading.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $1.0$
 * @since 24.06.2020
 */
public class TrackerSingle3 {
    private static final TrackerSingle3 INSTANCE = new TrackerSingle3();

    /**
     * конструктор по умолчанию.
     */
    private TrackerSingle3() {
    }

    public static TrackerSingle3 getInstance() {
        return INSTANCE;
    }

    private Tracker tracker = new Tracker();

    public Tracker getTracker() {
        return tracker;
    }
}
