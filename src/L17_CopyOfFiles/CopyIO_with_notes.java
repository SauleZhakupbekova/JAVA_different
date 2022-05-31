package L17_CopyOfFiles;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyIO_with_notes {
    public static void main(String[] args) {

        try {
            //new FileInputStream("erste.jpg") place from where we will read file
            // We have full path and relative. In JAVA we use relative (starts from folder).
            // "erste.jpg" means that way is relative.
            // The path is written with two \\ instead of \ because \\ means that after \ we have String (text like commentary)
            // BufferedInputStream means container which is filled in by 1000 bytes and bytes drive in container from desktop to destination root folder in JAVA
            //ALtEnter - import

            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\zhaku\\OneDrive\\Рабочий стол\\me.jpg")); //full path but normally we should use short path because nobody knows structure of client's comp. Short path is path starting from root folder (folder where is file saved in JAVA). Now we use full path because our picture is not in root folder of JAVA yet. It is on out desktop.
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Bee_photo.jpg")); //this photo will be saved in root folder of our project in JAVA

            // from here starts code which drives bytes from to:

            int c = 0;
            while (true) {
                c = bis.read(); //bis - place from where we read file.
                if (c != -1) // method read return -1 when there are no bytes
                    bos.write(c); //bos - place where we write file.
                else
                    break;
            }
            bis.close(); // close that place from where we read
            bos.flush(); // flush - means wait last container which is in way
            bos.close(); // close place where we wrote file
        } catch (java.io.IOException e) {
            System.out.println(e.toString());
        }
    }
}



