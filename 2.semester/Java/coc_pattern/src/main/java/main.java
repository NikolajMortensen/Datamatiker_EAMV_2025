public class main {
    public static void main(String[] args) {
        Component deskTop = new DeskTop();
        Component window1 = new Window(deskTop, 300, 250, 250, 300);
        Component window2 = new Window(window1, 300, 250, 250, 300);
        Component window3 = new Window(window2, 300, 250, 250, 300);
        Component window4 = new Window(window3, 300, 250, 250, 300);

        window4.mouseClick(450, 450);

    }
}