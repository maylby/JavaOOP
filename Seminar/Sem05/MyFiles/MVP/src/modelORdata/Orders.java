package modelORdata;

import java.util.ArrayList;

public class Orders {
    private ArrayList<Shwarma> arrayList;

    public Orders() {
        arrayList = new ArrayList<>();
    }
    public void add(Shwarma shwarma){
        System.out.println("добавили в orders " + shwarma);
        arrayList.add(shwarma);

    }

    public void getArrayList() {

        System.out.println(arrayList);
    }

    @Override
    public String toString() {
        return "Orders{" +
                "arrayList=" + arrayList +
                '}';
    }
}
