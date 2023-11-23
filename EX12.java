class CWin {
    int width;
    int height;
    String name;

    void setW(int w) {
        width = w;
    }

    void setH(int h) {
        height = h;
    }

    void setName(String s) {
        name = s;
    }

    public void show() {
        System.out.println("Name=" + name);
        System.out.println("W=" + width + ", H=" + height);
    }

    void setWindows(int w, int h) {
        width = w;
        height = h;
    }

    void setWindows(int w, int h, String s) {
        width = w;
        height = h;
        name = s;
    }
}

public class hw8_12 {
    public static void main(String args[]) {
        CWin cw = new CWin();

        cw.setName("My Window");

        cw.setW(5);
        cw.setH(3);

        cw.show();

        cw.setWindows(8, 6);

        cw.show();

        cw.setWindows(10, 7, "New Window");

        cw.show();
    }
}
