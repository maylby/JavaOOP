package OOP.Seminar.Sem04.Task;

import java.util.ArrayList;

public class VetClinic<T> {
    private T client;
    // private T age;
    private ArrayList<T> clients = new ArrayList<>();

    public VetClinic(T client) {
        this.client = client;
    }

    /*
     * Дубль выше написанного метода
     * для разных (?) животных (собаки/кошки) можно не заполнять
     * На каждое животное создаётся отдельный метод (VetClinic)???
     */
    public VetClinic() {

    }

    public void add(T client) {
        clients.add(client);
    }

    public T getClient() {
        return client;
    }

    public void setClient(T client) {
        this.client = client;
    }


    @Override
    public String toString() {
        return "Клиент{" + client + '}';
    }

    public void help(T client) {
        for (T t : clients) {
            if (t.equals(client)) {
                System.out.printf("%s принят\n", client);
            }
        }
    }
}
