package OOP.Seminar.Sem07.OOPSeminar7.DecoratorFactory.src.calculator;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}
