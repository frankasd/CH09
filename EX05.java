class CBox {
    int length;
    int width;
    int height;

    // (b) volume 函數，用來傳回 box 物件的體積
    int volume() {
        return length * width * height;
    }

    // (c) surfaceArea 函數，用來傳回 box 物件的表面積
    int surfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    // (d) showData 函數，用來顯示 box 物件的 length、width、height 三個資料成員的值
    void showData() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }

    // (e) showAll 函數，用來顯示 box 物件的 length、width、height 三個資料成員的值，以及其表面積與體積
    void showAll() {
        showData(); // 使用 showData 函數顯示長、寬、高
        System.out.println("Volume: " + volume());
        System.out.println("Surface Area: " + surfaceArea());
    }
}

public class EX05 {
    public static void main(String[] args) {
        // (a) 使用 CBox 類別建立一個 box 物件並設定 length、width、height 的值均為 1
        CBox box = new CBox();
        box.length = 1;
        box.width = 1;
        box.height = 1;

        // 使用 showAll 函數顯示 box 的資料和計算的體積與表面積
        box.showAll();
    }
}
