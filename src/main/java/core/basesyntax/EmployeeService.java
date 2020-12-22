package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    Comparator<Employee> comparator = (employee1, employee2) -> {
        if (employee1.getAge() != employee2.getAge()) {
            return Integer.compare(employee1.getAge(), employee2.getAge());
        }
        return employee1.getName().compareTo(employee2.getName());
    };

    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        if (employees == null || employees.size() == 0) {
            return new TreeSet<>();
        }
        Set<Employee> employeeSet = new TreeSet<>(comparator);
        employeeSet.addAll(employees);
        return employeeSet;
    }
}
