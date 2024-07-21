/*
Объектно-ориентированное программирование (лекции)
Урок 6. SOLID
https://gb.ru/lessons/414494

 */
package OOP.Lesson.Les06;

public class Ex002_2OCP {
    public static void main(String[] args) {

        /*
         * Записии о предоставляемых скидках
         * для клиента того или иного статуса.
         * Для изменения скидок или расширения списка,
         * достаточно изменить размер скидки, либо
         * добавить клиента с новым статусом.
         * 
         * /// Добавить самостоятельно новое поле клиента
         */
        System.out.println(new BaseClient().getDiscount(100));
        System.out.println(new SilverPartner().getDiscount(100));
        System.out.println(new GoldPartner().getDiscount(100));
        System.out.println(new VIPPartner().getDiscount(100));
    }
}

/*
 * Гибкий способ предоставления скидок клиентам
 * в зависимости от их статуса, где
 * каждый следующий по статусу клиент получает
 * скидки клиета предыдущего статуса и
 * к полученным скидкам получает дополнительную,
 * соответствующую его статусу
 * Метод допускает неограниченное число расширений
 * без переписывания всего кода.
 * 
 * /// реализовать промо-код
 * /// прописать систему бонусов
 */
class BaseClient {
    public double getDiscount(double price) {
        return price * 0.95;
    }
}

class SilverPartner extends BaseClient {
    @Override
    public double getDiscount(double price) {
        return super.getDiscount(price) * 0.9;
    }
}

class GoldPartner extends SilverPartner {
    @Override
    public double getDiscount(double price) {
        return super.getDiscount(price) * 0.9;
    }
}

class VIPPartner extends GoldPartner {
    @Override
    public double getDiscount(double price) {
        return super.getDiscount(price) * 0.9;
    }
}
