import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by artemsolonin on 25.05.2017.
 */
@XmlRootElement
public class Person {
    private String name;
    private String surname;
    private int age;
    public Person() {
    }
    public Person(int age,String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {

        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", surname=" + surname + ", age=" + age + '}';
    }

}
