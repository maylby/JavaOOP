// 00:26:30

// Избавление от проблемы с помощью обобщений
// Общая структура прежняя

// формат Контент

package OOP.Lesson.Les04.Ex004.V2;

public abstract class Content {
    public String name;

    public Content(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
