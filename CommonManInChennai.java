package tamilNadu.chennai;
import tamilNadu.chennai.TrafficRules;
public class CommonManInChennai implements TrafficRules
{
public static void main(String[] args)
{
    CommonManInChennai che = new CommonManInChennai();
    System.out.println("Chennai Traffic Commissioner = "+trafficCommissioner);
    che.goByDieselVehicle();
    che.goByCycle();
}
public void goByDieselVehicle()
{
    System.out.println("Swift car");
}
public void goByCycle()
{
    System.out.println("Government Hero Cycle");
}
}
