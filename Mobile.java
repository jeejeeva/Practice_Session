package mobile_shop.showroom;
import mobile_shop.store.Telephone;
public class Mobile extends Telephone
{
    public int price = 15000;
    public String name = "Mobile";

public void sms()
{
    System.out.println("Message facility");

}
public static void main (String[] args)
{
    Mobile samsung = new Mobile ();
    Telephone bsnl = new Telephone();

    samsung.sms();
    samsung.call();

    
    System.out.println(samsung.price);
    System.out.println(samsung.name);

    System.out.println(bsnl.price);
    System.out.println(bsnl.name);


}
}

