package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandle {

	public static void main(String[] args) throws IOException {
		File f =new File("C:\\Java1\\resume.txt");
         if(f.exists());
         f.delete();
         System.out.println(f.createNewFile());
	}

}
