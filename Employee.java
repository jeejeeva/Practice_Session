public class Employee extends Office 
{


public static void main (String[] args)
{

    Employee details = new Employee();
    details.name();
    details.dob();
    details.location();

    Office own = new Employee();
    own.location();
    // own.status();    this method not accessable for office object.
}
public void name ()
{
    System.out.println("Balu");
}
public void dob()
{
    System.out.println("12/02/1998");
}
public void location()
{
    System.out.println("Namakkal");
}
public void status()
{
    System.out.println("unmarried");
}

}
