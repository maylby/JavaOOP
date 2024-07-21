package modelORdata;

public class Shwarma {//описывает, не содержит логику
   private int cost;
   private String contains;

    public Shwarma(int cost, String contains) {
        this.cost = cost;
        this.contains = contains;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getContains() {
        return contains;
    }

    public void setContains(String contains) {
        this.contains = contains;
    }

    @Override
    public String toString() {
        return "Shwarma{" +
                "cost=" + cost +
                ", contains='" + contains + '\'' +
                '}';
    }
}
