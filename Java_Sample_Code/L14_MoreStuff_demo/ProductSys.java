
package labguide14_q2;

import java.util.ArrayList;

public class ProductSys {

    public static ArrayList<Product> products = new ArrayList<Product>();

    public static boolean addProduct(Product p){
        for(Product i : products){
            if(i.getId()==p.getId())
                return false;
        }   
        products.add(p);
        return true;
    }
    
    
    public static String displayWithCost (){
        double cost;
        String res="";
        for (Product i : products) {
            res+=i.toString();
            cost = i.calculateCost();
            res+="\nCost: "+cost+"$\n";
        }
        return res;
    }
    

    
}
