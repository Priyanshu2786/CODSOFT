import java.util.Scanner;
public class task_2
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number of subjects ");
		int n=sc.nextInt(),mark=0;
		System.out.println("enter marks in all subjects ");
		for(int i=0;i<n;i++)
		{
			mark=sc.nextInt()+mark;
		}
		int total_marks=mark;
        double percentage=(total_marks/n);
        System.out.println("total marks="+total_marks);
        System.out.println("percentage="+percentage);
        int k=(int)((percentage+5)/10);
        switch(k) 
        {
        case 10:
        	System.out.println("O");
        	break;
        case 9:
        	System.out.println("A");
        	break;
        case 8:
        	System.out.println("B");
        	break;
        case 7:
        	System.out.println("C");
        	break;
        case 6:
        	System.out.println("D");
        	break;
        case 5:
        	System.out.println("E");
        	break;
        	default:
        		System.out.println("F");
        		break;
        }
	}

}
