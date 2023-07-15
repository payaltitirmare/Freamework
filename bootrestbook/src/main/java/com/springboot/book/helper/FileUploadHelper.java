package com.springboot.book.helper;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {

	public final String upload_dir="D:\\Spring Project\\bootrestbook\\src\\main\\resources\\static\\image";
	
	public boolean uploadFile(MultipartFile multipartfile)
	{
		boolean f = false;
       try {
    	   Files.copy(multipartfile.getInputStream(), Paths.get(upload_dir+File.separator+multipartfile.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
       f=true;
       } 
       catch(Exception e)
       {
    	   e.printStackTrace();
       }
		
		return f;   
	}
	
		
		
	
	
	
}
