package StreamAPI;
import java.util.*;
class Products{
	int id;
	String name;
	double price;

public Products(int id,String name,double price) {// parameterized  constructor
	this.id=id;
	this.name=name;
	this.price=price;
	
	
}
//@Override
//public String toString() {
//    return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
//}
}
public class Filterdemo4 {

	public static void main(String[] args) {
		
		List<Products> productList=new ArrayList<Products>();
		
		productList.add(new Products(1,"Hp Laptop",28000));
		productList.add(new Products(2,"Dell Laptop",38000));
		productList.add(new Products(3,"Lenovo Laptop ",25000));
		productList.add(new Products(4,"Apple Laptop",50000));
		productList.add(new Products(4,"mack Laptop ",80000));
		productList.add(new Products(4,"soni Laptop",60000));
				
			
   // i want filter the objects this from collection based on price of the product 
		
		productList.stream().filter(p->p.price>25000).forEach(v->System.out.println(v.price));
		productList.stream().filter(p->p.name.startsWith("A")).forEach(v->System.out.println(v.name));
		
	}

}
