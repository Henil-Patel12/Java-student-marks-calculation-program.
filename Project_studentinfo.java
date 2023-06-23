import java.io.*;


class Project_studentinfo
{
	public static void main(String args[])throws IOException
	{

		int rollnumber,maths,science,english,total,percentage;

		System.out.println("MARKSHEET");

		String s; 
		String name,result,grade="";
		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("STUDENT's NAME : ");
		name = ob.readLine();
 
		System.out.println("STUDENT's ROLL-NUMBER : ");
		s = ob.readLine();
		rollnumber = Integer.parseInt(s);

		System.out.println("ENTER MATHS' MARK : ");
		s = ob.readLine();
		maths = Integer.parseInt(s);

		System.out.println("ENTER SCIENCE' MARK : ");
		s = ob.readLine();
		science= Integer.parseInt(s);

		System.out.println("ENTER ENGLISH' MARK : ");
		s = ob.readLine();
		english = Integer.parseInt(s);

		total = maths+science+english;

		percentage = total*100/300;

		System.out.println("TOTAL MARKS : "+total);

		System.out.println("PERCENTAGE  : "+percentage);

		if(maths>=33 && science>=33 && english>=33)
		{
			result="pass";
			if(percentage>=90)
			{
				grade="A+";
			}
			else if(percentage>=80)
			{
				grade="A";
			}
			else if(percentage>=60)
			{
			grade="B";
			}
			else if(percentage>=40)
			{
				grade="C";
			}
		}
		else
		{
			result="fail";
			grade="Nil";
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");

		System.out.println("   *  *  *  *MARKSHEET  *  *  *  *   ");
		System.out.println("NAME : "+name);
		System.out.println("ROLLNUMBER : "+rollnumber);
		System.out.println("ENTER MATHS' MARK : "+maths);
		System.out.println("ENTER SCIENCE' MARK : "+science);
		System.out.println("ENTER ENGLISH' MARK : "+english);
		System.out.println("TOTAL : "+total);
		System.out.println("PERCENTAGE : "+percentage);
		System.out.println("RESULT: "+result);
		System.out.println("GRADE: "+grade);

		System.out.println("    *  *  *  END  *  *  *    ");
	}
}









