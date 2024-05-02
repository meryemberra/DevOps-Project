package com.example.projectt2.util;

import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileUploadUtil {
    public static void saveFile(String uploadDir, String fileName, MultipartFile file) throws IOException {
        Path uploadPath = Paths.get(System.getProperty("user.dir"), uploadDir);

        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }

        try {
            String cleanedFileName = StringUtils.cleanPath(fileName);
            Files.copy(file.getInputStream(), uploadPath.resolve(cleanedFileName), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            throw new IOException("Could not save file: " + fileName, ex);
        }
    }
}
