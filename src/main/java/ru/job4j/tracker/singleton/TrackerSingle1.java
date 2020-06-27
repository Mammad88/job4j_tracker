package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

/**
 * Первый вариант singleton, enum - оно используется для ограниченного количество объектов.
 * Eager loading.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $1.0$
 * @since 24.06.2020
 */
public enum TrackerSingle1 {
    /**
     * здесь мы указываем перечисления.
     */
    INSTANCE;

    private Tracker tracker = new Tracker();

    public Tracker getTracker() {
        return tracker;
    }

    /*
     * метод добавление элемента в хранилище.
     */
    public Item add(Item model) {
        return model;
    }
}
