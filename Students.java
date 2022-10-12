class Students
{
    int tamil, english, maths;
Students (int tamil, int english, int maths)
{
    this.tamil = tamil;
    this.english = english;
    this.maths = maths;
}
public static void main(String[] args)
{

    Students mark = new Students (80, 65, 70);
    mark.student_mark ();
}
void student_mark ()
{
    System.out.println("Tamil = "+ tamil);
    System.out.println("English = "+english);
    System.out.println("Maths = "+ maths);
}

}
