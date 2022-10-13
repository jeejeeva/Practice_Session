class Malls 
{
    String shop_name ;
    String brand;
    int price;


Malls ()     //Default Constructor
{
    System.out.println("Default Constructor (no parameter passing)");
}
Malls (String brand, int price) // two parameterized constructor.
{
    this.brand = brand;
    this.price = price;
}

Malls (String shop_name, String brand, int price )   // Parameterized Constructor.
{
    this.shop_name = shop_name;
    this.brand = brand;
    this.price = price;
}

public static void main (String[] args)
{
    Malls phoenix = new Malls();  // Default arguments

    Malls forum = new Malls("infinity universe ", "hp laptops", 25000);    // parameterized arguments
    forum.mall_details();

    Malls forum1 = new Malls("hp laptops ", 25000);
    forum1.two_parameter();
    


}
void mall_details()
{
    System.out.println("Three parameter constructor");
    System.out.println("Shop name = "+shop_name);
    System.out.println("Brand name is = "+brand);
    System.out.println("Laptop price = "+price);
}
void two_parameter()
{
    System.out.println("Two parameter Constructor");
    System.out.println("Brand name = "+brand);
    System.out.println("Laptop price = "+price);
}

}
