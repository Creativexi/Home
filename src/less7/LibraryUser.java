package less7;

import java.util.Scanner;

class LibraryUser {
    private String fullName;
    private int ticketNum;
    private String faculty;
    private int birthDate;
    private int tel;

    LibraryUser() {
    }

    String getFullname() {
        return fullName;
    }
    String getFaculty() {
        return faculty;
    }
    int getTicketNum() {
        return ticketNum;
    }
    int getBirthDate() {
        return birthDate;
    }
    int getTel() {
        return tel;
    }

    private Scanner sc = new Scanner(System.in);
    private void setFullName() {this.fullName = sc.nextLine();}
    private void setFaculty() {this.faculty = sc.nextLine();}
    private void setTicketNum() {
        this.ticketNum = sc.nextInt();
    }
    private void setBirthDate() {this.birthDate = sc.nextInt();}
    private void setTel() {this.tel = sc.nextInt();}

    void userset() {
        System.out.println("Ведите ФИО");
        setFullName();
        System.out.println("Введите факультет");
        setFaculty();
        System.out.println("Введите № билета");
        setTicketNum();
        System.out.println("Введите год рождения");
        setBirthDate();
        System.out.println("Введите телефон");
        setTel();
    }

    void takeBook() {
        System.out.println(getFullname() + " взял книгу");
    }

    void returnBook() {
        System.out.println(getFullname() + " вернул книгу");
    }
}

