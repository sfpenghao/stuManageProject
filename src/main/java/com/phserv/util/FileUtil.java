package com.phserv.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import org.apache.commons.io.IOUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

public class FileUtil {

	public static String uploadImgFile(MultipartFile file, String parentPath) throws IOException {
		InputStream is = file.getInputStream();
		String oriFileName = file.getOriginalFilename();
		String filename = UUID.randomUUID().toString().replaceAll("-", "");
		String filenameExtension = StringUtils.getFilenameExtension(oriFileName);
		OutputStream os = new FileOutputStream(parentPath+"/"+filename+"."+filenameExtension);
		IOUtils.copy(is, os);
		os.flush();
		os.close();
		is.close();
		return "uploadFile/"+filename+"."+filenameExtension;
	}
}
