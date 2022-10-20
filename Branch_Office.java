public class Branch_Office extends Main_Office
{
public Branch_Office ()
{
    //this(name);
    System.out.println("Branch Office constructor");

}
public Branch_Office(String name)
{
this();
   System.out.println("Employe name = venkiy");
}

public static void main (String[] args)
{

    Branch_Office branch = new Branch_Office();
    Branch_Office office = new Branch_Office("kokku");
    branch.salary();
    branch.main();

}

public void salary()
{
     int wages = 20000;
    System.out.println("Branch Office employer salary = "+wages);

}
public void main()
{
    System.out.println("Main Branch Office Manager salary = "+super.salary);
}


}
