package chapters.chapter_13.examples;

import chapters.chapter_09.examples.Date;
import org.jetbrains.annotations.NotNull;

public abstract class  GeometricObject {

    private  String color;
    private boolean isFilled;
    private Date date;

    protected GeometricObject(){
        this("white",false);
    }
    protected GeometricObject(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
        date = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString(){
        return "isFilled: " + this.isFilled() + "\n" + "color: " + this.getColor() + "\n" + "area: " + getArea() + "\n" + "perimeter: " + getPerimeter();
    }
    public abstract double getArea();
    public abstract double getPerimeter();


}
