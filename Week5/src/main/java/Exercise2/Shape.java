package Exercise2;
/*
 1.Chuong trinh tren co 3 quan he ke thua is-a
 2.Circle co the ke thua lop Shape ma khong phai lop Rectangle vi lop Rectangle ke thua lop Shape
 3. pi nen de final

 */

public class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return color + ", "+ filled ;
    }
}
