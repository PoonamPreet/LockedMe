
import java.io.File;
import java.util.Scanner;
/**
 * @author Poornima
 *
 */


public class VirtualKeyRpository {

	
	static int choice=0;
	public static void main(String[] args) {
		FileOperations fo=new FileOperations();
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("1.CreateFolder");
		System.out.println("2.Add Files to the existing folder");
		System.out.println("3.Add Files to the new folder");
		System.out.println("4.Delete Files");
		System.out.println("5.Search Files");
		System.out.println("7. Sort");
		System.out.println("6.Exit");
		System.out.println("Enter your choice");
				choice=sc.nextInt();
			if(choice>=1)
			{
				if(choice==1)
			fo.CreateFolderr();
				if(choice==2)
			fo.existsadd();
				if(choice==3)
			fo.add();
				if(choice==4)
			fo.delete();
				if(choice==5)
					fo.search();
				if(choice==6)
				{
					System.out.println("Thank you for using Virtual Key repository.Visit again!");
					System.exit(0);
					
				}
				if(choice==7)
					fo.sort();
				
			}
		}
		while(true);
		
	}

}
