package L17_CopyOfFiles;

import java.io.Serializable;
import java.util.Objects;
//Сериализация - это временно законсервировать JAVA обьект во внутрь файла с возможностью в последующем этот обьект восстановить как JAVA обьект. Обьект - это не число, не символ. Это обьект
public class Point_Serialization implements Serializable { //интерфейс, при котором определяется подлежат ли данные обьекты JAVA консервации
    private int x;
    private int y;

    public Point_Serialization() {
    }

    public Point_Serialization(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point_Serialization that = (Point_Serialization) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point_Serialization{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
