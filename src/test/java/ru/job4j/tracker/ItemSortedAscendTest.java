package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemSortedAscendTest {
    @Test
    public void sortedAscTest() {
        List<Item> items = Arrays.asList(
                new Item("Item 1"),
                new Item("Urgent item"),
                new Item("Important item")
        );
        items.sort(new ItemSortedAscend());
        List<String> itemsNames = new ArrayList<>();
        for (Item item: items) {
            itemsNames.add(item.getName());
        }
        List<String> expected = Arrays.asList("Important item", "Item 1", "Urgent item");
        assertThat(itemsNames, is(expected));
    }
}
