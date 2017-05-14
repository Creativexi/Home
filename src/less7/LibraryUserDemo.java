package less7;

import java.util.ArrayList;

public class LibraryUserDemo {
    public static void main(String[] args) {

        LibraryUser user1 = new LibraryUser();
        LibraryUser user2 = new LibraryUser();
        ArrayList<Object> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        user1.userset();
        user2.userset();
        System.out.println("Читатели библиотеки:");
        userout((LibraryUser) list.get(0));
        userout((LibraryUser) list.get(1));
        user1.takeBook();
        user2.returnBook();
    }

    private static void userout(LibraryUser user) {
        System.out.println(user.getFullname() + " " + user.getFaculty() + " " + user.getTicketNum() + " " + user.getBirthDate() + " " + user.getTel());
    }
}