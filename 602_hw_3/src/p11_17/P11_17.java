package p11_17;

public class P11_17
{
	public static void main(String[] args)
	{

	}
}

/*

Given the following code, find the compile error.

A. m(new GraduateStudent()) causes an error
B. m(new Student()) causes an error
C. m(new Person()) causes an error
D. m(new Object()) causes an error

*/

//class Test
//{
//	public static void main(String[] args)
//	{
//		m(new GraduateStudent());
//		m(new Student());
//		m(new Person());
//		m(new Object());
//	}
//
//	public static void m(Student x)
//	{
//		System.out.println(x.toString());
//	}
//}
//
//class GraduateStudent extends Student
//{
//}
//
//class Student extends Person
//{
//	@Override
//	public String toString()
//	{
//		return "Student";
//	}
//}
//
//class Person extends Object
//{
//	@Override
//	public String toString()
//	{
//		return "Person";
//	}
//}
