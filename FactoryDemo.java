public abstract class FactoryDemo extends SmartPhone
{
    public boolean isOriginalPice = false;
    public static int price = 0;

public abstract void verifyFingerPrint();

public abstract void providePattern();

public void browse ()
{
    System.out.println("Factory Demo Browsing");
}

}

