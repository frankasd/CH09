public class EX02 {
    public static class Cbbb {
        double x;
        double y;
    }
    public static void main(String[] args) {

        Cbbb obj1 = new Cbbb();
        Cbbb obj2 = new Cbbb();
        Cbbb avg = new Cbbb();

        obj1.x = 5.2;
        obj1.y = 3.9;

        obj2.x = 6.5;
        obj2.y = 4.6;

        avg.x = (obj1.x + obj2.x) / 2.0; 
        avg.y = (obj1.y + obj2.y) / 2.0;

        System.out.println("obj1 的值:x=" + obj1.x + ", y=" + obj1.y);
        System.out.println("obj2 的值:x=" + obj2.x + ", y=" + obj2.y);
        System.out.println("avg 的值:x=" + avg.x + ", y=" + avg.y);
    }
}
