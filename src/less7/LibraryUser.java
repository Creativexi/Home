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
    int getTel() {return tel;}
    private Scanner sc = new Scanner(System.in);
    public void setFullName() {this.fullName = sc.nextLine();}
    public void setFaculty() {this.faculty = sc.nextLine();}
    public void setTicketNum() {
        this.ticketNum = sc.nextInt();
    }
    public void setBirthDate() {this.birthDate = sc.nextInt();}
    public void setTel() {this.tel = sc.nextInt();}
    void takeBook() {
        System.out.println(getFullname() + " взял книгу");
    }
    void returnBook() {
        System.out.println(getFullname() + " вернул книгу");
    }
}

