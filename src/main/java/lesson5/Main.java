package lesson5;

public class Main {

    public static void main(String[] args) {
        Employee[] arrayEmployee = new Employee[5];

        arrayEmployee[0] = new Employee("Петров", "Пётр", "Петрович", "44", "Инженер", "89289004041", "email1", "50000");
        arrayEmployee[1] = new Employee("Иванов", "Иван", "Ивановоич", "34", "Техник", "89289004042", "email2", "50000");
        arrayEmployee[2] = new Employee("Сергеев", "Сергей", "Сергевич", "64", "Охранник", "89289004043", "email3", "50000");
        arrayEmployee[3] = new Employee("Фёдоров", "Фёдр", "Фёдорович", "24", "Программист", "89289004044", "email4", "50000");
        arrayEmployee[4] = new Employee("Николаев", "Пётр", "Николаевич", "54", "Дворник", "89289004045", "email5", "50000");

        int a = 1;
        System.out.println("Список сотрудников");
        for (Employee employee : arrayEmployee) {
            if (Integer.parseInt(employee.getAge()) > 40) {
                System.out.println("Сотрудник " + a + ":" + System.lineSeparator());
                employee.getInfoEmployee(employee);
                System.out.println();
                a++;
            }
        }
    }
}
