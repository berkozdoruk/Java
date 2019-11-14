
public abstract class GeometricObject {

    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    //construct a default geometric object
    protected GeometricObject() {
        dateCreated = new java.util.Date();
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

    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color
                + " and filled: " + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    /*these abstract methods cannot be implemented in the GeometricObject
     * class because their implementation is dependent on the specific type 
     of geometric object. Such methods are referred to as abstract methods
     so, GeometricObject class become an abstract class. */
}
