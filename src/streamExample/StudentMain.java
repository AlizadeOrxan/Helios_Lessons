package streamExample;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentMain {
    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Aysel", "Computer Science", 91),
                new Student("Kamran", "Math", 88),
                new Student("Lala", "Computer Science", 77),
                new Student("Orxan", "Math", 95),
                new Student("Xeyale", "Math", 95),
                new Student("Nurlan", "Physics", 84),
                new Student("Nurlan", "Physics", 84)

        );
//
//        List<String> collect = students.stream() /// adlara gore siyahiya yigiriq
//                .map(Student::getName)
//                .toList();
//        System.out.println(collect);
//
//
//        Map<String, Integer> nameToGrade = students.stream()
//                .collect(Collectors.toMap(
//                        Student::getName,
//                        Student::getGrade
//                ));
//        System.out.println(nameToGrade);
//
//        System.out.println("_______________");
//
//
//        students.stream() ///  Bu stream bize , qiymetlerine gore grouplashdiraca
//                .collect(Collectors.groupingBy(Student::getGrade))
//                .forEach((k,v) -> System.out.println(k + ": " + v));
//
//
//        students.stream() ///  Her ixtisasda olan telebeleri chapa verecek
//                .collect(Collectors.groupingBy(Student::getMajor))
//                .forEach((k,v) -> System.out.println(k + ": " + v));
//
//
//        students.stream() ///  Her ixtisasda neche telebe varsa onlari chapa verecek
//                .collect(Collectors.groupingBy(Student::getMajor,Collectors.counting()))
//                .forEach((k,v) -> System.out.println(k + ": " + v));

//
//
//        students.stream()
//                .collect(Collectors.groupingBy(Student::getMajor))
//                .forEach((k,v) -> System.out.println(k + " " + v));
//
//        System.out.println("_______________________________________________");
//
//        students.stream()
//                .collect(Collectors.groupingBy(Student::getGrade))
//                .forEach((k,v) -> System.out.println(k + " " + v));
//
//
//        students.stream()
//                .collect(Collectors.groupingBy(Student::getMajor, Collectors.counting()))
//                .forEach((k,v) -> System.out.println(k + " " + v));
//
//
//        System.out.println("_______________________");
//
//        Map<String, Long> collect = students.stream()
//                .collect(Collectors.groupingBy(Student::getName, Collectors.counting()));
//        collect.forEach((k,v) -> System.out.println(k + " " + v));







    }
}
