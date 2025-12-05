package streamExample;

public class Student {
    private String name;
    private String major;     // ixtisas
    private int grade;        // bal

    public Student(String name, String major, int grade) {
        this.name = name;
        this.major = major;
        this.grade = grade;
    }

    public String getName() { return name; }
    public String getMajor() { return major; }
    public int getGrade() { return grade; }


    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", grade=" + grade +
                '}';
    }
}
