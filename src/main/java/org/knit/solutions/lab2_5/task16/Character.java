package org.knit.solutions.lab2_5.task16;


public class Character implements Flyweight {
    private final int code;
    private final org.knit.solutions.lab2_5.task16.Pair cord;
    private final String style;


    public Character(String key, int code, Pair cord, String style) {
        this.code = code;
        this.cord = cord;
        this.style = style;
    }

    public void operation(String externalState) {
        System.out.println("Внутреннее состояние: " + code + ", Внешнее состояние: " + externalState);
    }
}