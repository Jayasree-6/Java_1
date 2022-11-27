class Mobile
{
String name;
String color;
int price;
Mobile(String n,String c,int p)
{
this.name=n;
this.color=c;
this.price=p;
}
public static void main(String[]args)
{
Mobile m1=new Mobile("moto","white",7000);
System.out.println("name:"+m1.name+"\n"+"color:"+m1.color+"\n"+"price:"+m1.price);
Mobile m2=new Mobile("redmi","red",9000);
System.out.println("name:"+m2.name+"\n"+"color:"+m2.color+"\n"+"price:"+m2.price);
}
}

