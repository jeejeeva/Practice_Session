class Student
{
    int tamil, english, maths;

Student (int tamil, int english, int maths)
{
    this.tamil = tamil;
    this.english = english;
    this.maths = maths;
}
public static void main(String[] args)
{
    Student mark = new Student(74, 60, 70);
    mark.student_mark();


}
void student_mark()
{
    System.out.println("Tamil = "+ tamil);
    System.out.println("English = "+english);
    System.out.println("Maths = "+maths);




}
}
