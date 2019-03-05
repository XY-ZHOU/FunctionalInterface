import main.java.model.Calculation;

public class Main {
    public static void main(String[] args) {
        Calculation test = new Calculation(6, 3);
        System.out.println(test.calculate((i, j) -> i + j));
        System.out.println(test.calculate((i, j) -> i - j));
        System.out.println(test.calculate((i, j) -> i * j));
        System.out.println(test.calculate((i, j) -> i / j));
    }
}
