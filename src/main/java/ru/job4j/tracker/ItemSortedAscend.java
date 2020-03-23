package ru.job4j.tracker;

import java.util.Comparator;

/**
 * Компаратор для реализации сортировки заявок по возрастанию.
 *
 * @author Bruki Mammad (bruki_mammad@mail.ru)
 * @version $1.0$
 * @since 23.03.2020
 */
public class ItemSortedAscend implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        return first.getName().compareTo(second.getName());
    }
}
