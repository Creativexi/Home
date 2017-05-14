package less7;

public class LibraryUserDemo {
    public static void main(String[] args) {

        LibraryUser user1 = new LibraryUser();
        LibraryUser user2 = new LibraryUser();
        LibraryUser users[] = new LibraryUser[2];
        users[0] = user1;
        users[1] = user2;
        userSet(user1);
        userSet(user2);
        System.out.println("Читатели библиотеки:");
        userOut(users[0]);
        userOut(users[1]);
        user1.takeBook();
        user2.returnBook();
    }
    private static void userOut(LibraryUser user) {
        System.out.println(user.getFullname() + " " + user.getFaculty() + " " + user.getTicketNum() + " " + user.getBirthDate() + " " + user.getTel());
    }
    private static void userSet(LibraryUser user) {
        System.out.println("Ведите ФИО");
        user.setFullName();
        System.out.println("Введите факультет");
        user.setFaculty();
        System.out.println("Введите № билета");
        user.setTicketNum();
        System.out.println("Введите год рождения");
        user.setBirthDate();
        System.out.println("Введите телефон");
        user.setTel();
    }
}