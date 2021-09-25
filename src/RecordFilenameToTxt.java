import java.io.File;
import java.util.Scanner;

import myutils.*;

public class RecordFilenameToTxt {

	public static void main(String[] args) {
		String path = "";
	    System.out.println("please input folder name £¨etc. in windows there is a folder D:\\a\\zimu, then you need input   D:\\\\a\\\\zimu)");
	    path = new Scanner(System.in).nextLine();

		String l_FolderName = path;
		String l_strDestinationFile = new File(l_FolderName).getName() + ".txt";
		try {
			ReadFilename.ReadFilenameInFolder(l_FolderName, l_strDestinationFile);
		} catch(Exception e) {
			System.out.println("maybe filename format error, please input again!");
		}
		
	}

}
