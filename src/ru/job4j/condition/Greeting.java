package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {
        String idea  = "I like Java!";
        System.out.println(idea);
        String separate = " ";
        idea += separate;
        idea += "But I am a newbie.";
        int year = 2020;
        idea += "\n" + year;
        System.out.println(idea);

    }
}
