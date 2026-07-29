import java.util.Objects;

public class Student3 {
    public int rollNo;
    public String Name;

    @Override
    public String toString() {
        return "StudentCustomConcept{" +
                "rollNo=" + rollNo +
                ", Name='" + Name + '\'' +
                '}';
    }

    public Student3(String name, int rollNo) {
        Name = name;
        this.rollNo = rollNo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student3 student3 = (Student3) o;
        return rollNo == student3.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }
}
