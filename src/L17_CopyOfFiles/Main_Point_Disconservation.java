package L17_CopyOfFiles;

public class Main_Point_Disconservation {
    public static void main(String[] args) {
        try {
            // Десериализация
            java.io.ObjectInputStream ois = new java.io.ObjectInputStream(new
                    java.io.FileInputStream("state.bin")); //мы подсоединяемся к файлу in через ObjectInputStream
            System.out.println("Double: " + ois.readDouble());//считываем обьекты сначало примитивные обекты, затем универсальные обьекты. Главное соблюдать последовательность какие обьекты за кем мы клали при записи - сначала double, затем String, и в конце - Point.
            System.out.println("String: " + ois.readObject().toString());//мы считываем обьект и с помощь. toString преобразовывем его в текст
            System.out.println("Point: " + (Point_Serialization) ois.readObject());//считываем обьект и преобразовываем типа point
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
