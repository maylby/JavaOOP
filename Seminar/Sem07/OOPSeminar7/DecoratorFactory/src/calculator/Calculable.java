package OOP.Seminar.Sem07.OOPSeminar7.DecoratorFactory.src.calculator;

public interface Calculable {
    Calculable sum(int arg);
    Calculable multi(int arg);
    int getResult();
}

