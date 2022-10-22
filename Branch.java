package kerala.nkl;
import kerala.kochin.Company;
public class Branch extends Company
{
public Branch()
{
    
    System.out.println("Namakkal branch office");
}
public Branch (int cc)
{
    super(cc);
    System.out.println("Branch employee id no. ="+cc);
}
public static void main(String[] args)
{

    Branch off = new Branch();
    off. salary();
    Branch office = new Branch(1055);
    
}
public void salary ()
{
    int salary = 18000;
    System.out.println("Employee salary = "+salary);
    super.salary();
}
}
