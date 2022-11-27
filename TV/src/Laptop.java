
public class Laptop {
	String brand;
	String name;
	String processor;
	int price;
	Laptop(String brand,String name,String processor,int price)
	{
		this.brand=brand;
		this.name=name;
		this.processor=processor;
		this.price=price;
	}
	void Laptop_details()
	{
		System.out.println("brand is:"+this.brand);
		System.out.println("name is:"+this.name);
		System.out.println("processor is:"+this.processor);
		System.out.println("price is:"+this.price);
	}
	public static void main(String[] args)
	{
		Laptop l1=new Laptop("dell","inspiron","i3",78665);
		Laptop l2=new Laptop("hp","pavilion","i7",62990);
		Laptop l3=new Laptop("apple","mac-book","i7",110000);
		System.out.println("brand:"+l1.brand+"\n"+"name:"+l1.name+"\n"+"processor:"+l1.processor+"\n"+"price:"+l1.price);
		System.out.println();
		System.out.println("brand:"+l2.brand+"\n"+"name:"+l2.name+"\n"+"processor:"+l2.processor+"\n"+"price:"+l2.price);
		System.out.println();
		System.out.println("brand:"+l3.brand+"\n"+"name:"+l3.name+"\n"+"processor:"+l3.processor+"\n"+"price:"+l3.price);
	}

}
