package Interface;

abstract class Shape implements Action {
    protected int x, y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Shape() {
    }

    public void moveTo(int x1, int y1){
        erase();
        x=x1;
        y=y1;
        draw();
    }
}
