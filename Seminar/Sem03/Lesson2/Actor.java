package OOP.Seminar.Sem03.Lesson2;

public abstract class Actor implements ActorBehaviour{
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    abstract String getName();
}
