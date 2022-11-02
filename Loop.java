class Loop
{

public static void main(String[] args)
{

    Loop cl = new Loop();
    cl.dosa(8);
    cl.tenali(1024);
    cl.appa();
   


}


public void appa()
{
    int amount = 0;
    int day = 1;
    while(day<=10)
    {
        amount = amount + day;  
        day = day+ 1;
        //System.out.println("app gave daily amount = "+amount);
    }
    System.out.println("total amount = "+amount);
}


public void dosa(int dosa)
{
    int count =3;
    while(count>=1)
    {
        dosa = dosa + dosa/2;
        count = count -1;

    }
    System.out.println("Total dosa eating = "+dosa);
}
public void tenali(int beats)
{
    int security = 0;
    while(beats >1)
    {
        beats = beats/2;
        security = security +1;

             System.out.println("total beats = "+beats);   

    }
    System.out.println("Total security = "+security);

}



}

