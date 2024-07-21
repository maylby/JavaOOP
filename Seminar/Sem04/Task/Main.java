package OOP.Seminar.Sem04.Task;

/*
 Задача:
 Напишите обобщенный класс VetClinic, который представляет собой 
 ветеринарную клинику для различных видов животных. 
 Класс должен иметь методы для записи на прием, обработки пациентов и выдачи отчетов.
 Продемонстрируйте использование этого класса для работы с пациентами, 
 собаками, кошками и другими животными.
 */
public class Main {
    public static void main(String[] args) {
        VetClinic<Cat> vetClinicC = new VetClinic<>();
        VetClinic<Dog> vetClinicD = new VetClinic<>();

        Dog dog1 = new Dog("Bobik");
        Dog dog2 = new Dog("Sharik");

        Cat cat1 = new Cat("Murka");
        Cat cat2 = new Cat("Barsik");

        vetClinicC.add(cat1);
        vetClinicC.help(cat1);
        vetClinicC.add(cat2);
        vetClinicC.help(cat2);
        
        vetClinicD.add(dog1);
        vetClinicD.help(dog1);
        vetClinicD.add(dog2);
        vetClinicD.help(dog2);
    }
}
