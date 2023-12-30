public class Main {

    public static void main(String[] args) {
        // Пример использования метода
        Employee[] employees = {
                new Employee("Иванов"),
                new Employee("Петров"),
                new Employee("Сидоров")
                // Добавьте других сотрудников при необходимости
        };

        String targetLastName = "Петров";
        Employee foundEmployee = EmployeeArraySearch.findEmployeeByLastName(employees, targetLastName);

        if (foundEmployee != null) {
            System.out.println("Сотрудник с фамилией " + targetLastName + " найден: " + foundEmployee);
        } else {
            System.out.println("Сотрудник с фамилией " + targetLastName + " не найден.");
        }
    }
}


