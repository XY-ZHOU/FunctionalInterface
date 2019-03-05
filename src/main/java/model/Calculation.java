package main.java.model;

public class Calculation {
    private int i;
    private int j;

    public Calculation(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int calculate(MyFunctionalInterface res) {
        return res.function(i, j);
    }
}
