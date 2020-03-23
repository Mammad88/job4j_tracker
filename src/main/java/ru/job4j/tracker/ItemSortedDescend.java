package ru.job4j.tracker;

import java.util.Comparator;

/**
 * Компаратор для реализации сортировки заявок по убыванию.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $1.0$
 * @since 23.03.2020
 */
public class ItemSortedDescend implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        return second.getName().compareTo(first.getName());
    }
}
