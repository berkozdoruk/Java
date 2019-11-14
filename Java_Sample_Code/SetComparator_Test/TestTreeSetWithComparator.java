
import java.util.Set;
import java.util.TreeSet;


public class TestTreeSetWithComparator {

    public static void main(String[] args) {
        // TODO code application logic here
        //create a tree set for geometric objects using a comparator
        
        Set<GeometricObject> set = new TreeSet<GeometricObject>(new GeometricObjectComparator());
        
        /*Two Circle objects of the same radius are added to the set in the tree set,
        but only one is stored because these two circles are equal and set 
        does not allow duplicates
        */
        
        set.add(new Rectangle(4, 5));
        set.add(new Circle(40));
        set.add(new Circle(40));
        set.add(new Rectangle(4, 1));

        //display geometric objects in the tree set
        //the geometric objects are sorted using the compare method in the
        //comparator interface.
        System.out.println("A sorted set of geometric objects");
        for (GeometricObject element : set) {
            System.out.println("area = " + element.getArea());
        }
    }

}
