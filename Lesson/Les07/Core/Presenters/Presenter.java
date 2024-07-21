/*
Объектно-ориентированное программирование (лекции)
Урок 7. Есть ли жизнь без Java?
https://gb.ru/lessons/414495

 */
package OOP.Lesson.Les07.Core.Presenters;

import OOP.Lesson.Les05.Ex003.Core.Infrastructure.Generator;
import OOP.Lesson.Les05.Ex003.Core.Models.Model;
import OOP.Lesson.Les05.Ex003.Core.Views.View;
import OOP.Lesson.Les05.Ex003.Mathematics.Exceptions.UnacceptableValueException;
import OOP.Lesson.Les05.Ex003.Mathematics.Shapes.Circle;
import OOP.Lesson.Les05.Ex003.Mathematics.Shapes.Rectangle;
import OOP.Lesson.Les05.Ex003.Mathematics.Shapes.Shape;

public class Presenter {
    Model model;
    View view;

    public Presenter(View view, Model model) {
        this.model = model;
        this.view = view;
    }

    public void append() throws UnacceptableValueException {
        view.set("1 - Circle, 2 - Rectangle");
        String response = view.get();
        Shape figure;

        switch (response) {
            case "1":
                figure = Circle.create(Generator.number(), "Circle_" + Generator.number());
                break;
            default:
                figure = Rectangle.create(
                    Generator.number(),
                    Generator.number(),
                    "Rectangle_" + Generator.number());
                break;
        }

        model.append(figure);
        view.set("ok");

    }

    public void show() {
        view.set(model.show());
    }

    public void showArea()
        {
            view.set(String.format("all Area %s", model.area()));
        }
}

