package tamilNadu.mohai;
/*   first compile package in terminal comments 
    1. javac -d . Area.java
    2. java tamilNadu.mohai.Area
    
     compile this program.

*/

public class Area
{
    public String name ;
    public int age;
    public String dob ;
    public String qualification ;

Area(String name, int age, String dob, String qualification)
{
    this.name = name;
    this.age = age;
    this.dob = dob;
    this.qualification = qualification;
}

public static void main(String []args)
{

    Area area = new Area("venkiy", 21, "26/12/1999", "Deplamo");
    area.mettu_street();


}
public void mettu_street()
{
    System.out.println("name of person = "+name);
    System.out.println("Age = "+age);
    System.out.println("Date of Birth = "+dob);
    System.out.println("Qualification = "+qualification);
}

}
