public class Branch extends Office 
{

public static void main (String[] args)
{

    Branch emp = new Branch();
    emp.name();
    emp.location();
    emp.dob();

    emp.name("pokka");
    emp.location("coimbatore");
    emp.dob("12/02/1998");
}
public String name (String empname)
{
    System.out.println("Employee Name = "+ empname);
    return empname;
}
public void name ()
{
    System.out.println("jeeva");
}
public String dob(String empDob)
{
    System.out.println("employee DOB = "+empDob);
    return empDob;
}
public void dob ()
{
    System.out.println("14/02/1998");   
}
public String location(String empLocation)
{
    System.out.println("Employee name = "+empLocation);
    return empLocation;
}
public void location ()
{
    System.out.println("Namakkal");
}
}
