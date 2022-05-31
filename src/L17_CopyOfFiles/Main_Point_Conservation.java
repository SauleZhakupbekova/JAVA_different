package L17_CopyOfFiles;


public class Main_Point_Conservation {
    public static void main(String[] args) {
        try {
            // Сериализация
            java.io.ObjectOutputStream ois = new java.io.ObjectOutputStream(new
                    java.io.FileOutputStream("state.bin"));//сначала мы создаем файл, куда будет записываться обьект JAVA - state.bin. BIN - это расширение файлов с JAVA обьектами с возможностью их восстановить
            ois.writeDouble(3.14159265D);//доступны как методы примитивного типа (Double, INT etc)
            ois.writeObject("The value of PI"); // также доступны методы Object
            ois.writeObject(new Point_Serialization(10, 253)); //запись объекта класса Point
            ois.flush();//дождись последний буфер
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
