package L17_CopyOfFiles;

import java.io.File;
import java.io.IOException;

//JAVA с помощью класса файл сама определит надо ли создавать файл или папку.
//Укажим папку JAVAScript111, которой нет
public class Main_File_CreateNew {
    public static void main(String[] args) {
        File startDir = new File("C:\\Users\\zhaku\\OneDrive\\Рабочий стол\\JAVAScript111");
        if(!startDir.exists()){ //если не существует папка ( folder or directory)
           try {
                startDir.createNewFile(); //создать новый файл, но он не создался
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}