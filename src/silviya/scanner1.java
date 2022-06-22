package silviya;

import java.util.Scanner;

public class scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter name:");
String name=s.nextLine();
System.out.println("rollno");
int rollno=s.nextInt();
System.out.println("college");
String college=s.next();

System.out.println("place");
String place=s.next();
System.out.println(name);
System.out.println(rollno);
System.out.println(college);
System.out.println(place);
s.close();

	}

}
