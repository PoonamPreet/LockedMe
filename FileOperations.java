import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Poornima
 *
 */
class CreateFolders 
{
	public String path;
	public File newfile;
	public String value;
	public void CreateFolderr() {
	//public String path;
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
	 newfile=file;
	try {
	if(!file.exists()) {
	//creating a folder using mkdir() method
	boolean bool=file.mkdirs();
	
	if(bool) {
		System.out.println("Folder is created Successfully");
		value="true";
	}
	else
	{
		System.out.println("Folder creation failed");
		value="False";
	}
	}else
	{
		System.out.println("Folder already exists");
		value="False";
	}
	}
	
	catch(Exception ex)
	{
		System.out.println("Folder cant be created");
	}
}
}
public class FileOperations extends CreateFolders{
/**s
 * 
 */
	
	public void existsadd() 
	{
		//System.out.println("Path is"+cf.path);
		String filename;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Directory path");
		String folderpath=sc.next();
		System.out.println("Enter File name");
		filename=sc.next();
		
		//File f1=new File(folderpath);
		filename=folderpath+File.separator+filename;
		File f=new File(filename);
		
		
		try {
			if(f.createNewFile()) {
				System.out.println("File " +f +" Created");
			}else
			{
				System.out.println("File exists");
			}
	}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		

public void add() 
{
	CreateFolders cf=new CreateFolders();
	cf.CreateFolderr();
	//System.out.println("Path is"+cf.path);
	String filename;
			if(cf.value.equals("true")) {
		   Scanner sc=new Scanner(System.in);
	System.out.println("Enter File name");
	filename=sc.next();
	
	File f1=new File(cf.path);
	filename=f1+File.separator+filename;
	File f=new File(filename);
	
	
	try {
		if(f.createNewFile()) {
			System.out.println("File " +f +" Created");
		}else
		{
			System.out.println("Error occured");
		}
}
	 catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	else 
	{
		System.out.println("File cant be created");
	}
}
public void delete() 
{
	//CreateFolders cf=new CreateFolders();
	//cf.CreateFolderr();
	
	//System.out.println("Path is"+cf.path);
	String filename;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Folder Path");
	File f1=new File(sc.next());
	System.out.println("Enter File name with extension if available");
	filename=sc.next();
	filename=f1+File.separator+filename;
	File f=new File(filename);
	if(f.exists()==true) {
			
		if(f.delete()) {
			System.out.println("File " +f +" Deleted Succesfully");
		}
	}else if(f.exists()==false)
		{
			System.out.println("File not exists");
		}
		else
		{
			System.out.println("Deletion failed");
		}

}			public void search() 
			{
				//CreateFolders cf=new CreateFolders();
				//cf.CreateFolderr();
				
				//System.out.println("Path is"+cf.path);
	

				String search;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter directory ");
				File f1=new File(sc.next());
				System.out.println("Enter File name with extension");
				search=sc.next();
				search=f1+File.separator+search;
				File f=new File(search);
						try {
					if(f.exists()==true) {
						System.out.println("File " +f +" Exists");
					}else
					{
						System.out.println("Doesnt exists");
					}
			}
				 catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	
}	
public void sort() 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the directory to be sorted");
	String paths=sc.next();
   File folder=new File(paths);
   folder.getAbsolutePath();
    //System.out.println(folder.toString());
    String[] files=folder.list();
     //System.out.println("In Sort");
	System.out.println("**********************************");

	for(int i=0;i<files.length;i++) {
	
		
		System.out.println(files[i].toUpperCase());//Sorting normally
		}
	System.out.println("*******************");
	
}

}
