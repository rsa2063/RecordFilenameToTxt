package myutils;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFilename {

	public static void ReadFilenameInFolder(String a_strFolderName, String a_strResult) {
		PrintWriter a_osResult = null;
		try (DirectoryStream<Path> entries = Files.newDirectoryStream(Paths.get(a_strFolderName))) {
			a_osResult = new PrintWriter(new FileOutputStream(a_strResult, true));
	    	for (Path f : entries) {
//	    		if(f.toFile().isFile() && !f.toFile().getName().startsWith((".") 
//	    				&& !f.toFile().getName().toLowerCase().endsWith("png")) {
////	    			a_osResult = new PrintWriter(a_strResult);
//	    			a_osResult.append(f.toFile().getName());
//	    			a_osResult.append("\r\n\r\n");
//
//	    			a_osResult.flush();
////	    			a_osResult.close();
//	    		}
//	    		else if(f.toFile().isDirectory()) {
//	    			ReadFilenameInFolder(f.toFile().getAbsolutePath(), a_strResult);
//	    		}
	    		
	    		//2
	    		if(!f.toFile().getName().toLowerCase().endsWith("png") && !f.toFile().getName().startsWith(".") 
	    				&& !f.toFile().getName().toLowerCase().endsWith("jpg") && !f.toFile().getName().toLowerCase().endsWith("jpeg")) {
	    			a_osResult.append(f.toFile().getName());
	    			a_osResult.append("\r\n");

	    			a_osResult.flush();
	    		}
	    		if(f.toFile().isDirectory()) {
	    			ReadFilenameInFolder(f.toFile().getAbsolutePath(), a_strResult);
	    		}
	    		
	    		//3
//	    		if(f.toFile().isFile() && f.toFile().getName().toLowerCase().endsWith("rar") 
//	    				&& !f.toFile().getName().toLowerCase().endsWith("zip") && !f.toFile().getName().toLowerCase().endsWith("7z")) {
//	    			a_osResult.append(f.toFile().getName());
//	    			a_osResult.append("\r\n");
//
//	    			a_osResult.flush();
//	    		} else if(f.toFile().isDirectory()) {
//	    			ReadFilenameInFolder(f.toFile().getAbsolutePath(), a_strResult);
//	    		}
	    	}
	    } catch (Exception e) {
	    		e.getMessage();
	    } finally {
	    	if(a_osResult != null) {
	    		a_osResult.close();
	    	}
	    }
	}
}
