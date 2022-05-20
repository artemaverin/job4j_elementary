package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Массив ages типа short содержит: " + ages.length + " элементов");
        System.out.println("Массив surnames типа String содержит: " + surnames.length + " элементов");
        System.out.println("Массив prices типа float содержит: " + prices.length + " элементов");
        String[] names = new String[4];
        names[0] = "Harry Kane";
        names[1] = "Phil Foden";
        names[2] = "Jack Grealish";
        names[3] = "Ollie Watkins";
        System.out.println();
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
