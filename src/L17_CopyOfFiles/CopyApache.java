package L17_CopyOfFiles;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CopyApache implements CopyUtil {
    @Override
    public void copy(String from, String To) {
        File fromFile = new File(from);
        File toFile = new File(To);
        try {
            FileUtils.copyFile(fromFile, toFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}