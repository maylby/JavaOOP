package OOP.Seminar.Sem04.Task2;

public class Product<T> {
    private T name;
    private Double coast;
    
    public Product(T name, Double coast) {
        this.name = name;
        this.coast = coast;
    }
    
    public T getName() {
        return name;
    }
    
    public Double getCoast() {
        return coast;
    }
    
    @Override
    public String toString() {
        return String.format("Товар %s", name);
    }
}
    
