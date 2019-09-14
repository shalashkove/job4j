package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String result;
        result = "Неизвестное слово. " + eng;
        return result;
    }

    public static void main(String[] args) {
        DummyDic ditcionary = new DummyDic();
        System.out.println(ditcionary.engToRus("Cat"));
        System.out.println(ditcionary.engToRus("Dog"));
    }
}
