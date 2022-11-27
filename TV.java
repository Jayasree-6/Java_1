class TV
{
String name;
String type;
int price;
public static void main(String[] args){
 TV t1=new TV();
 t1.name="sony";
 t1.type="led";
 t1.price=45000;
System.out.println("location of tv:"+t1);
System.out.println("name of tv:"+t1.name);
System.out.println("type of tv:"+t1.type);
System.out.println("price of tv:"+t1.price);
 TV t2=new TV();
 t2.name="android";
 t2.type="led";
 t2.price=50000;
System.out.println("location of tv:"+t2);
System.out.println("name of tv:"+t2.name);
System.out.println("type of tv:"+t2.type);
System.out.println("price of tv:"+t2.price);
}
}
