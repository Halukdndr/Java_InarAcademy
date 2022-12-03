package chapters.chapter_13.examples;

import org.jetbrains.annotations.NotNull;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle>{

    public ComparableRectangle() {
    }

    public ComparableRectangle(double height, double width) {
        super(height,width);
    }

    @Override
    public int compareTo(@NotNull ComparableRectangle o) {
        if (getArea() > o.getArea()){
            return (int) (getArea() - o.getArea());
        }else if (getArea() == o.getArea()){
            return 0;
        }else {
            return (int) (getArea() - o.getArea());
        }
    }
    @Override
    public String toString(){
        return super.toString() + " Area: " + getArea();
    }
}