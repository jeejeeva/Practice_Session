public class TamilNadu extends SouthIndia
{
public static String capital = "Chennai";

public static void main(String[] args)
{
    SouthIndia si = new TamilNadu();
    System.out.println(India.capital);
    System.out.println(TamilNadu.capital);

    si.speakLanguage();
    si.eat();
    si.dress();
    si.caltivate();
    si.livingStyle();
}
public void speakLanguage()
{
    System.out.println("our choise");
}
public void eat()
{
    System.out.println("Natural and higienic food");
}
public void dress()
{
    System.out.println("what you like take and wear cloth");
}
public void caltivate()
{
    System.out.println("Rice and Sugar cane caltivation");

}
public void livingStyle()
{
    System.out.println("Above average development");
}
}

