
public class EmployeeArraySearch {

    public static Employee findEmployeeByLastName(Employee[] employees, String targetLastName) {
        for (Employee employee : employees) {
            if (employee.getLastName().equals(targetLastName)) {
                return employee;
            }
        }
        // Если сотрудник с указанной фамилией не найден, можно вернуть null или выбросить исключение
        return null;
    }

}

