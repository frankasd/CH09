class CCalculator {
    private int a;
    private int b;
    private int c;

    public void set_value(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    public void show() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }

    public int add() {
        return a + b + c;
    }

    public int sub() {
        return a - b - c;
    }

    public int mul() {
        return a * b * c;
    }

    public double avg() {
        return (double) (a + b + c) / 3;
    }
}

public class EX09 {
    public static void main(String[] args) {
        CCalculator obj = new CCalculator();
      
        obj.set_value(25, 3, 7);

        System.out.println("Show values:");
        obj.show();

        System.out.println("Sum: " + obj.add());

        System.out.println("Difference: " + obj.sub());

        System.out.println("Product: " + obj.mul());

        System.out.println("Average: " + obj.avg());
    }
}
