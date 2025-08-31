package Mini_Project;

import java.util.Objects;

public class User {
    private String name;
    private int age;
    private String birthday;

    public User(String name, int age, String berthday) {
        this.name = name;
        this.age = age;
        this.birthday = berthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof User user)) return false;
        return age == user.age && birthday == user.birthday && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, birthday);
    }

    @Override
    public String toString() {
        return "회원정보 : 이름 -"+name+"\t나이 : "+age+"\t생년월일 : "+ birthday;
    }
}

