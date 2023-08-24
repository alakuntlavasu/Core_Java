package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandle {

	public static void main(String[] args) throws FileNotFoundException{
		File f =new File("E:\\Resumes\\vasu"); 
		FileInputStream fis=new FileInputStream(f);
		System.out.println(fis);
//		if(f.exists());
//         f.delete();
         System.out.println(f);
	}

}
