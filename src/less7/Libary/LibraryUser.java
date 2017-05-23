package less7.Libary;

class LibraryUser {
    private String fullName;
    private int ticketNum;
    private String faculty;
    private int birthDate;
    private int tel;

    public String getFullname() {
        return fullName;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getTicketNum() {
        return ticketNum;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public int getTel() {
        return tel;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setTicketNum(int ticketNum) {
        this.ticketNum = ticketNum;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    void takeBook(int booktaken) {
        System.out.println("количество взятых книг: " + booktaken);
    }

    void takeBook(String bookname) {
        System.out.println("название книг: " + bookname);
    }

    void takeBook(Book book) {
        System.out.println("Читатель " + getFullname() + " взял книгу - " + book.getBookname());
    }

    void returnBook(int booktaken) {
        System.out.println("Количество возвращенных книг: " + booktaken);
    }

    void returnBook(String bookname) {
        System.out.println("Читетель вернул книгу " + bookname);
    }

    void returnBook(Book book) {
        System.out.println("Читатель " + getFullname() + " вернул книгу - " + book.getBookname());
    }
}
//20310