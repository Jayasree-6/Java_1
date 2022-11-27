
public class TV {
	String name;
	String type;
	int price;
	TV(String n,String t,int p)
	{
		this.name=n;
		this.type=t;
		this.price=p;
	}
	public static void main(String[] args)
	{
		TV t1 = new TV("sony","lcd",48000);
		TV t2 = new TV("mi","led",50000);
		TV t3 = new TV("oneplus","led",46000);
		System.out.println("name:"+t1.name+"\n"+"type:"+t1.type+"\n"+"price:"+t1.price+"\n");
		System.out.println("name:"+t2.name+"\n"+"type:"+t2.type+"\n"+"price:"+t2.price+"\n");
		System.out.println("name:"+t3.name+"\n"+"type:"+t3.type+"\n"+"price:"+t3.price+"\n");
		
	}

}
