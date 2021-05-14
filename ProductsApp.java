package ecomerce;


class Products
{
	private int productId;
	String productName;
	int price;
	
	//products constructor
	Products()
	{
	System.out.println("Welcome we have a lot of Products in our store");	
	}
	
	// function that sets the products Details
	void setProductDetails(int productId,String productName,int price)
	{
		this.productId=productId;
		this.productName=productName;
		this.price=price;
	}
	
	// function that display the products Details
	void displayProductDetails()
	{
		System.out.println("------Product ID:"+productId+"-----");
		System.out.println("Product Name:\t"+productName);
		System.out.println("Product price\t"+price);
		System.out.println("-----------------------------------");
	}
}

//Mobile IS-A product class. (class that inherits the properties of Products class)

class Mobile extends Products
{
	//Mobile Constructor
	Mobile()
	{
		System.out.println("Mobile Phones");
	}
}
	//Tablet IS-A product
class Tablets extends Products
{
	//Mobile constructor
	Tablets()
	{
		System.out.println("Tablets Brands");
	}
}


public class Main {

	public static void main(String[] args) {
		
		//Tablet  Object
		
		Tablets tablet=new Tablets();
						
		//Set and display Products Details
		tablet.setProductDetails(100,"TA & T",30000);
		tablet.displayProductDetails();
						
		tablet.setProductDetails(101,"Lenovo Tablets",40000);
		tablet.displayProductDetails();
		
		//Mobile Object
		Mobile mobile=new Mobile();
		
		//Set and display Mobile details
		mobile.setProductDetails(001,"Nokia 6", 400000);
		mobile.displayProductDetails();
		
		
	}

}
