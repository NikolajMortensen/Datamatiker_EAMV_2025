public class Window implements Component {
    private Component next;
    private int xpos, ypos;
    private int width, height;

    public Window(Component next, int xpos, int ypos, int width, int height) {
        this.next = next;

        this.xpos = xpos;
        this.ypos = ypos;

        this.width = width;
        this.height = height;
    }

    @Override
    public void mouseClick(int x, int y) {
        if (between(x, xpos, ypos + width) &&
            between(y, ypos, ypos + height))
        System.out.println(this);
        else {
            next.mouseClick(x, y);
        }
    }

    private boolean between(int start, int value, int end) {
        return start <= value && value < end;
    }

    public String toString() {
        return "[Window: pos=(" + xpos + ", " + ypos + "), " + "dim=" + width + "x" + height + "]";
    }
}