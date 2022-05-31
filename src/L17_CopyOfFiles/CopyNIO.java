package L17_CopyOfFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyNIO implements CopyUtil{
    @Override
    public void copy(String from, String To) {
        Path fromPath = Paths.get(from);
        Path toPath = Paths.get(To);
        try {
            Files.copy(fromPath, toPath, StandardCopyOption.REPLACE_EXISTING); // если такой файл уже существует, то обновить его
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
