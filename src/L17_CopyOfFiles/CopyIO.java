package L17_CopyOfFiles;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyIO implements CopyUtil{
    @Override
    public void copy(String from, String To) {
        try {

            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("From"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("To"));

            int c = 0;
            while (true) {
                c = bis.read(); //bis - place from where we read file.
                if (c != -1) // method read return -1 when there are no bytes
                    bos.write(c); //bos - place where we write file.
                else
                    break;
            }
            bis.close();
            bos.flush();
            bos.close();
        } catch (java.io.IOException e) {
            System.out.println(e.toString());
        }
    }
}
