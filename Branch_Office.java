public class Branch_Office extends Main_Office
{
public Branch_Office ()
{
    
    System.out.println("Branch Office constructor");

}
public Branch_Office(int cc)
{
//this(); // this this() keyword for calling from current class default constructor.
super(cc); // this super(name) keyword calling for parent class parameterized constructor.
   System.out.println("Employe name = venkiy");
}

public static void main (String[] args)
{

    //Branch_Office branch = new Branch_Office();
    Branch_Office office = new Branch_Office(213);
    office.salary();
    office.main();

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
