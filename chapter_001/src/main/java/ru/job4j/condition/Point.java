package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    /**
     * Это поле объекта. Оно доступно только конкретному объекту.
     */
    private int x;

    /**
     * И это поле объекта. Оно доступно только конкретному объекту.
     */
    private int y;

    /**
     * Еще одно поле объекта. Оно доступно только конкретному объекту.
     */
    private int z;

    /**
     * Конструтор, который принимает начальное состояние объекта "точка"
     * @param first координата x
     * @param second координата y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Конструтор, который принимает начальное состояние объекта "точка"
     * @param first координата x
     * @param second координата y
     * @param third координата z
     */
    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }
}