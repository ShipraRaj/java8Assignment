import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ListStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.
                                asList(4, 7, 32, 42, 11, 22, 33, 99);
        List<Integer> evenNumbers = numbers.stream().
                                    filter(o -> o % 2 == 0).
                                    collect(Collectors.toList());
        System.out.println(evenNumbers);
List<Employee> emplist = new ArrayList<Employee>();
emplist.add(new Employee("Shipra", "Raj", 900001, "Jharkhand"));
emplist.add(new Employee("Vivek", "Agnihotri", 800002, "Bihar"));
emplist.add(new Employee("Devanshi", "Gupta", 700003, "UP"));
emplist.add(new Employee("Hrpreet", "Kaur", 600004, "Delhi"));
emplist.add(new Employee("Shruti", "Gautam", 500005, "Kolkata"));


//unique firstname of employees salary<5000 and place=Delhi
emplist.stream()
.filter(e -> e.getSalary() < 5000 && e.getCity()=="Delhi")
.map(Employee::getfirstName)
.forEach(System.out::println);
    }

}

