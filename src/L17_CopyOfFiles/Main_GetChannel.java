package L17_CopyOfFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;


// FileOutStream  на запись. FileInputStream - на чтение
public class Main_GetChannel {
    public static void main(String[] args) {
        try {
// Запись в файл:
            FileChannel fc = new FileOutputStream("data.txt").getChannel(); //зяли канал, по которому будут вписываться данные в файд
            fc.write(ByteBuffer.wrap("Some Text".getBytes())); //создание буфера, подготовка буфера (wrap). в этот буфер кладут байты и отправляем буфер по каналу
            fc.close();
// Добавление в конец файла:
            fc = new RandomAccessFile("data.txt", "rw").getChannel(); //открываем файд на чтение и запись. Достаем от туда канал.
            fc.position(fc.size()); // Становимся на позицию перехода в конец файла (fc.size()-означает конец файла)
            fc.write(ByteBuffer.wrap("More text".getBytes())); //дописали немного теста в файл
            fc.close();
// Чтение файла:
            fc = new FileInputStream("data.txt").getChannel(); //открываем этот же файл только уже как inputstream то есть на чтение
            ByteBuffer buff = ByteBuffer.allocate(1024); //чтение тоже происходит в буфере. Подготавляется буфер размера BSIZE - 1024 стандартный размер буфера
            fc.read(buff);//канал считай этот буфер
            buff.flip(); // буфер подготовь себя к тому, что с тебя будут считывать байты
            while (buff.hasRemaining()) //пока есть байты, которые мы можем считывать мы из печатаем на консоль. buff.get - метод, который достает байты по одному и преобразуем его в символ char и печатаем на консоль
                System.out.print((char) buff.get());
             }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

