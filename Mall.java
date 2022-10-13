class Mall 
{
    String shop_name ;
    String brand;
    int price;


Mall ()     //Default Constructor
{
    System.out.println("Default Constructor (no parameter passing)");
}

Mall (String shop_name, String brand, int price )   // Parameterized Constructor.
{
    this.shop_name = shop_name;
    this.brand = brand;
    this.price = price;
}

public static void main (String[] args)
{
    Mall phoenix = new Mall();  // Default arguments

    Mall forum = new Mall("infinity universe ", "hp laptops", 25000);    // parameterized arguments
    forum.mall_details();
    


}
void mall_details()
{
    System.out.println("Shop name = "+shop_name);
    System.out.println("Brand name is = "+brand);
    System.out.println("Laptop price = "+price);
}

}
