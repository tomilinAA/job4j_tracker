package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        id = item.getId();
        items[index].setName(item.getName());
        boolean b = indexOf(id) > -1;
        return b;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        int start = index + 1;
        int distPos = index;
        int length = size - index - 1;
        boolean rsl = index != -1;
        if (rsl) {
            System.arraycopy(items, start, items, distPos, length);
            items[size - 1] = null;
            size--;
        }
        return rsl;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
            rsl = index;
            break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int count = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                rsl[count] = item;
                count++;
            }
        }
        return Arrays.copyOf(rsl, count);
    }
}