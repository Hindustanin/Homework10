//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");

        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = middleName + ' ' + firstName + ' ' + lastName;
        System.out.println(fullName);

        // Задача 2
        System.out.println();
        System.out.println("Задача 2");

        String small = fullName;
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + small.toUpperCase());

        // Задача 3
        System.out.println();
        System.out.println("Задача 3");

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё" , "е");
        System.out.println("Данные Ф.И.О. сотрудника - " + fullName);
    }
}