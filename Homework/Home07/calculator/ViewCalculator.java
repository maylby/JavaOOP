/*
Объектно-ориентированное программирование (семинары)
Урок 7. ООП Дизайн и Solid ч.2
https://gb.ru/lessons/414502/homework

Аттестационная работа

 */
package OOP.Homework.Home07.calculator;

import java.util.Scanner;

public class ViewCalculator {

    private ICalculationMaker calculationMaker;

    public ViewCalculator(ICalculationMaker calculationMaker) {
        this.calculationMaker = calculationMaker;
    }

    public void run() {
        while (true) {
            int firstArg = promptInt("1-й аргумент: ");
            Calculable calculator = calculationMaker.create(firstArg);
            while (true) {
                String act = prompt("Действие (*, +, /, =) : ");
                if (act.equals("*")) {
                    int arg = promptInt("2-й аргумент: ");
                    calculator.mult(arg);
                    continue;
                }
                if (act.equals("+")) {
                    
                    int arg = promptInt("2-й аргумент: ");
                    calculator.sum(arg);
                    continue;
                }
                if (act.equals("/")) {
                    int arg = promptInt("2-й аргумент: ");
                    if (arg == 0) {
                        // throw new RuntimeException("Деление на ноль!");

                        /*
                         * Обработка ошибки "Деление на ноль"
                         * Замена строки "throw"
                         */
                        Scanner sc = new Scanner(System.in); 
                        System.err.printf("Делить на ноль нельзя!\nВедите другой аргумент: ");
                    
                        int x = sc.nextInt();
                        while (x == 0) {
                            System.err.printf("Делить на ноль нельзя!\nВедите другой аргумент: ");
                            x = sc.nextInt();
                        }
                        calculator.div(x);
                        continue;
                    }
                    calculator.div(arg);
                    continue;
                }

                if (act.equals("=")) {
                    int result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    break;
                }
            }    
                String act = prompt("Продолжить? (да: Y / нет: N) ");
                if (act.equals("Y")) {
                    continue; // (?) не возвращает к дальнейшей работе
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
    // in.close(); // Как закрыть сканер?
    //             // Надо ли это делать в данном случае?
    //             // Если нет, то почему?          
}



