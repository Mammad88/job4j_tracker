package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Tracker;

/**
 * Второй вариант singleton, static field.
 * Lazy loading.
 * Для того, чтобы закрыть возможность создавать экземпляр класса,
 * нам нужно явно создать конструтор по умолчанию и присвоить ему модификатор private.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $1.0$
 * @since 24.06.2020
 */
public class TrackerSingle2 {
    private static TrackerSingle2 instance;

    /**
     * конструктор по умолчанию с модификатором private.
     */
    private TrackerSingle2() {
    }

    public static TrackerSingle2 getInstance() {
        if (instance == null) {
            instance = new TrackerSingle2();
        }
        return instance;
    }

    private Tracker tracker = new Tracker();

    public Tracker getTracker() {
        return tracker;
    }
}
