import java.io.File;
import java.util.Scanner;

//Creating folder
public class CreateFolder {
	public   CreateFolder(String path) 
	{
		
		//Fetching path to create folder
		System.out.println("Enter the path where You want to Create a folder ");
		Scanner sc=new Scanner(System.in);
		 path=sc.next();
		path=path+File.separator;
		System.out.println("Path is "+path );
		//Fetching folder name
		System.out.println("Enter the folder name");
		path=path+sc.next();
		//Instantiate file class
		File file=new File(path);
		//creating a folder using mkdir() method
		boolean bool=file.mkdirs();
		if(bool) {
			System.out.println("Folder is created Successfully");
		}
		else
		{
			System.out.println("Folder creation failed");
		}
	}
	
public static void main(String args[])
{
	
	}
	
}
