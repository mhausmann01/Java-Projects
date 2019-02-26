public abstract class GeometricObject2 {

private String color = "White";
private boolean filled;
private java.util.Date dateCreated;
double width;
double height;

protected GeometricObject2() {
dateCreated = new java.util.Date();

}

protected GeometricObject2(String color, boolean filled){
dateCreated = new java.util.Date();
this.color = color;
this.filled = filled;

}

public GeometricObject2(double width, double height){
this.width = width;
this.height = height;
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

public java.util.Date getDateCreated() {
return dateCreated;

}

@Override
public String toString() {
return "Created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;

}

public abstract double getArea();

public abstract double getPerimeter();


}

class ComparableGeometricObject extends GeometricObject2 implements Comparable<ComparableGeometricObject> {

public ComparableGeometricObject(double width, double height) {
super(width, height);
}

@Override
public int compareTo(ComparableGeometricObject o) {
if (getArea() > o.getArea())
return 1;

else if (getArea() < o.getArea())
return -1;

else
return 0; 
}

public double getArea() {
double area;

area = super.width * super.height;

return area;

}

public double getPerimeter() {
double perimeter;

perimeter = super.width + super.width + super.height + super.height;

return perimeter;

}

}