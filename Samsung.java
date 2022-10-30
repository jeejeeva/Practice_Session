public class Samsung extends FactoryDemo
{
public static int price = 500;


public static void main(String[] args)
{

    Samsung sam = new Samsung();
    sam.browse();
    System.out.println(sam.price);
    sam.unimplement();
    System.out.println(sam.isOriginalPice);
}
public void unimplement ()
{
    
}
public int call(int second)
{
    System.out.println("i am speaking 1hrs some one here");
     return second;
}
public void sendMessage()
{
    System.out.println("your plan experied soon");
}

public void verifyFingerPrint()
{
    System.out.println("This phone have finger print");
}
public void receiveCall()
{
    System.out.println("All time receive my phone calls");
}
public void providePattern()
{
    System.out.println("This phone have pattern lock");
}
}
