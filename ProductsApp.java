package ecomerce;

class Products
{
	int productId;
	String productName;
	int price;
	
	Products()
	{
	System.out.println("Products object created");	
	}
	
	void setProductDetails(int productId,String productName,int price)
	{
		this.productId=productId;
		this.productName=productName;
		this.price=price;
	}
	
	void displayProductDetails()
	{
		System.out.println("------Product ID:"+productId+"-----");
		System.out.println("Product Name:\t"+productName);
		System.out.println("Product price\t"+price);
	}
}

public class ProductsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Products product=new Products();
		
		product.setProductDetails(100,"Dell Computer",30000);
		product.displayProductDetails();
		
		product.setProductDetails(101,"Hp Computer",40000);
		product.displayProductDetails();
		
		

	}

}
