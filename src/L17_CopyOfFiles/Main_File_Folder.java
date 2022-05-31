package L17_CopyOfFiles;

import java.io.File;
import java.io.FileFilter;

// цель - вытянуть из папки JAVAScript все файлы с определенным фильтром
public class Main_File_Folder {
    public static void main(String[] args) {
        File startDir = new File("C:\\Users\\zhaku\\OneDrive\\Рабочий стол\\JAVAScript");
        File[] files = startDir.listFiles(new FileFilter() { //будет генерироваться тело класса, который реализует интерфейс FileFilter
            @Override
            public boolean accept(File pathname) {//через метод accept будет будет определеться подходит ли нам файл или нет
                //файл нам подходит, если он картинка
                if (pathname.isDirectory()){//если это папка
                    return true;
                }
                if(pathname.getName().endsWith(".png")||
                        pathname.getName().endsWith(".jpg")||
                        pathname.getName().endsWith(".swg")){
                    return true;
                }
                return false;
            }
        });
        for(File f:files){//цикл for, который будет проходится по всем файлам
            System.out.println(f.getAbsolutePath()); //печатать на консоль полный их путь getAbsolutePath. Удалять не будем.
        }

    }

}