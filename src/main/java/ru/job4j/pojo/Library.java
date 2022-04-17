package ru.job4j.pojo;

import java.util.Objects;

public class Library {
    public static void main(String[] args) {
        Book atlasShrugged = new Book("Atlas Shrugged", 1395);
        Book theAlchemist = new Book("The Alchemist", 163);
        Book theGoal = new Book("The goal", 321);
        Book cleanCode = new Book("Clean code", 23);
        Book[] library = new Book[4];
        library[0] = atlasShrugged;
        library[1] = theAlchemist;
        library[2] = theGoal;
        library[3] = cleanCode;
        for (int index = 0; index < library.length; index++) {
            Book lib = library[index];
            System.out.println(lib.getName() + ": " + lib.getPages());
        }

        System.out.println(System.lineSeparator() + "Index[0] replace Index[3]");
        library[0] = cleanCode;
        library[3] = atlasShrugged;
        for (int index = 0; index < library.length; index++) {
            Book lib = library[index];
            System.out.println(lib.getName() + " : " + lib.getPages());
        }

        System.out.println(System.lineSeparator() + "If you want clean code");
        for (int index = 0; index < library.length; index++) {
            Book lib = library[index];
            if (lib.getName().equals("Clean code")) {
                System.out.println(lib.getName() + " : " + lib.getPages());
            }
        }
    }
}
