//hw8_4, 類別的練習
class CBox {
    int length;
    int width;
    int height;
}

public class EX04 {
    public static void main(String args[]) {
        CBox box;
        box = new CBox();
        
        // 將 box 物件的成員變數值設定為所需的值
        box.length = 15;
        box.width = 10;
        box.height = 25;

        // 印出 box 物件的成員變數值
        System.out.println("length = " + box.length);
        System.out.println("width = " + box.width);
        System.out.println("height = " + box.height);
    }
}
