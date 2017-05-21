package uitschool;

public class StudentDemo {
    public static void main(String[] args) {
        Student vova = new Student();
        Aspirant aspvova = new Aspirant();
        vova.setAge(15);
        vova.setFullname("Вова");
        aspvova.setDiplom("History");
        aspvova.setFullname("Aspirant Vova");
        System.out.println(aspvova.getFullname() + " writing  " + aspvova.getDiplom());
    }
}
