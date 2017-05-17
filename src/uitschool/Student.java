package uitschool ;

public class Student {
    String fullname;
    int age;
     void setFullname(String fullname) {
        this.fullname = fullname;
    }
    void setAge(int age) {
        this.age = age;
    }
    String getFullname() {
        return fullname;
    }
    int getAge() {
        return age;
    }
}

class Aspirant extends Student {
    String diplom;
    void setDiplom(String diplom) {
        this.diplom = diplom;
    }
    String getDiplom() {
        return diplom;
    }
}
