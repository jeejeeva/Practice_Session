package india.delhi;
import india.delhi.TrafficRulesDelhi;

public class CommonManInDelhi implements TrafficRulesDelhi
{
public static void main (String[] args)
{
    
    CommonManInDelhi delhi = new CommonManInDelhi();
    delhi.dontGoByDieselVehicle();
    delhi.goByBicycle();
    
    System.out.println("Delhi Traffic Commissioner = "+CommonManInDelhi.trafficCommissioner);
}
public void dontGoByDieselVehicle()
{
    System.out.println("why dont go diesel vehicle");
}
public void goByBicycle()
{
    System.out.println("Cycle way is health purpose");
}
public void unimplement ()
{
    // System.out.println(super.trafficCommissinore);
}

}
