public class DeskTop implements Component {

    @Override
    public void mouseClick(int x, int y) {
        System.out.println(this);
    }

    public String toString() {
        return "[DeskTop]";
    }
}