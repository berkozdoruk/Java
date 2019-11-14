
import java.util.Comparator;

public class GeometricObjectComparator implements Comparator<GeometricObject> {

    
    @Override
    public int compare(GeometricObject o1, GeometricObject o2) {
        double area1 = o1.getArea();
        double area2 = o2.getArea();
        int res;
        
        /*
        if (area1 < area2) {
            return -1;
        } else if (area1 == area2) {
            return 0;
        } else {
            return 1;
        }
        */
        res = (int) (o1.getArea() - o2.getArea());
        return res;

    }

    /*@Override
    public int compare(Object o1, Object o2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
}
