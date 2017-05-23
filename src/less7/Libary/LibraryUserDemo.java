package less7.Libary;

public class LibraryUserDemo {
    public static void main(String[] args) {
        Book math = new Book("Математика");
        LibraryUser user1 = new LibraryUser();
        LibraryUser user2 = new LibraryUser();
        LibraryUser users[] = new LibraryUser[2];
        users[0] = user1;
        users[1] = user2;
        userSet1(user1);
        userSet2(user2);

        System.out.println("Читатели библиотеки:");
        for (LibraryUser user : users) {
            userOut(user);
        }
        user1.takeBook(math);
        user1.returnBook(math);
        user1.returnBook(1);
    }

    private static void userOut(LibraryUser user) {
        System.out.println("Имя: " + user.getFullname() + ". Факультет: " + user.getFaculty() + ". Номер билета: " + user.getTicketNum() + ". Дата рождения: " + user.getBirthDate() + ". Телефон: " + user.getTel());
    }

    private static void userSet1(LibraryUser user) {
        user.setFullName("Владимир");
        user.setFaculty("экономический");
        user.setTicketNum(3);
        user.setBirthDate(1992);
        user.setTel(067);
    }

    private static void userSet2(LibraryUser user) {
        user.setFullName("Михаил");
        user.setFaculty("технический");
        user.setTicketNum(2);
        user.setBirthDate(1993);
        user.setTel(067);
    }
}