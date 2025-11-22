package korit_9_gov_java.src.main.java.com.korit.study.ch30;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private double salary;
    // constructor, getters

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public EmployeeDTO toDto() {
        return new EmployeeDTO(String.format("Mr./Ms. %s", name), String.format("$%f", salary));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class EmployeeDTO {
    private String displayName;
    private String salaryInfo;

    public EmployeeDTO(String displayName, String salaryInfo) {
        this.displayName = displayName;
        this.salaryInfo = salaryInfo;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "displayName='" + displayName + '\'' +
                ", salaryInfo='" + salaryInfo + '\'' +
                '}';
    }

    // constructor, getters
}

public class StreamEx {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList(
                "user1@gmail.com",
                "admin@company.co.kr",
                "support@naver.com",
                "info@daum.net"
        );

        List<String> domains = emails.stream()
                .map(email -> email.substring(email.indexOf("@") + 1))
                .toList();

        System.out.println(domains);

        Set<String> domains2 = emails.stream()
                .map(email -> email.substring(email.indexOf(".") + 1))
                .collect(Collectors.toSet());

        System.out.println(domains2);

        List<String> domains3 = emails.stream()
                .map(email -> email.substring(email.indexOf("@") + 1, email.indexOf(".")))
                .toList();

        System.out.println(domains3);

        List<Employee> employees = Arrays.asList(
                new Employee("Kim", 50000),
                new Employee("Lee", 60000)
        );

        List<EmployeeDTO> employeeDTOs = employees.stream()
                .map(Employee::toDto)
                .toList();

        System.out.println(employees);
        System.out.println(employeeDTOs);


        List<String> filePaths = Arrays.asList(
                "/home/user/documents/report.pdf",
                "/var/log/system.log",
                "C:\\Users\\Admin\\Desktop\\image.jpg",
                "/downloads/music.mp3"
        );

        List<String> fileNames = filePaths.stream()
                .map(filePath -> {
                    String replaceStr = filePath.replaceAll("\\\\", "/");
                    return replaceStr.substring(replaceStr.lastIndexOf("/") + 1);
                })
                .toList();

        System.out.println(fileNames);

        class Item {
            String name;
            int stock;
            boolean onSale;
            int price;

            public Item(String name, int stock, boolean onSale, int price) {
                this.name = name;
                this.stock = stock;
                this.onSale = onSale;
                this.price = price;
            }

            @Override
            public String toString() {
                return "Item{" +
                        "name='" + name + '\'' +
                        ", stock=" + stock +
                        ", onSale=" + onSale +
                        ", price=" + price +
                        '}';
            }
        }

        List<Item> items = Arrays.asList(
                new Item("노트북", 5, true, 1000000),
                new Item("마우스", 0, true, 30000),
                new Item("키보드", 10, false, 50000),
                new Item("헤드셋", 3, true, 80000),
                new Item("웹캠", 0, false, 60000)
        );

        // 재고가 1개 이상, 할인 중
        List<Item> filteringItems = items.stream()
                .filter(item -> item.stock > 0 && item.onSale)
                .toList();

        System.out.println(filteringItems);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 7, 5, 8);

        List<Integer> filteringNumbers = numbers.stream()
                .filter(num -> numbers.stream().filter(num2 -> num2 == num).count() == 1)
                .toList();
        System.out.println(filteringNumbers);

        List<Integer> filteringNumbers2 = new ArrayList<>();
        for (Integer num : numbers) {
            int count = 0;
            for (Integer num2 : numbers) {
                if (num2 == num) {
                    count++;
                }
            }
            if (count == 1) {
                filteringNumbers2.add(num);
            }
        }
        System.out.println(filteringNumbers2);

        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2024, 1, 1),  // 월요일
                LocalDate.of(2024, 1, 6),  // 토요일
                LocalDate.of(2024, 1, 7),  // 일요일
                LocalDate.of(2024, 1, 10), // 수요일
                LocalDate.of(2024, 1, 13), // 토요일
                LocalDate.of(2024, 1, 14)  // 일요일
        );

        System.out.println(LocalDate.of(2024, 1, 6).getDayOfWeek());

        List<LocalDate> filteringDates = dates.stream()
                .filter(localDate ->
                        localDate.getDayOfWeek().name().equals("SATURDAY")
                                || localDate.getDayOfWeek().name().equals("SUNDAY"))
                .toList();

        System.out.println(filteringDates);
    }
}
