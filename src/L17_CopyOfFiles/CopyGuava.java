package L17_CopyOfFiles;

import java.io.File;
import java.io.IOException;

public class CopyGuava implements CopyUtil{
    @Override
    public void copy(String from, String To) {
        File copied = new File(To);
        File original = new File(from);
        try {
            com.google.common.io.Files.copy(original, copied);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
