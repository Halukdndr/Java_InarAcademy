package chapters.chapter_11.exercises.E02;

import chapters.chapter_10.exercises.MyDate;

public class Exercise_02 {
    public static void main(String[] args) {
        Person person = new Person("Serhat","Away",6541245,"sg@mail.com");
        Student student = new Student("etga","ızmır",45441,"ebo@mail",Student.SENIOR);
        Employee employee = new Employee("sener","guneslı",754952,"sen@mail","erep",5421,new MyDate());
        Faculty faculty = new Faculty("mesut","ısparta",4122578,"mso@mail","ths",457,new MyDate(),"5","josi");
        Staff staff = new Staff("ert","corum",4785516,"ert@mail","srt",45545,new MyDate(),"cleaner");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
