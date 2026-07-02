package JavaCollection;

public class Student {
    public int age;
    public String name;
    public int nos;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", nos=" + nos +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNos(int nos) {
        this.nos = nos;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getNos() {
        return nos;
    }

    public Student(int age, String name, int nos) {
        this.age = age;
        this.name = name;
        this.nos = nos;
    }
}