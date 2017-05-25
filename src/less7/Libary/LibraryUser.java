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
        System.out.println("Читатель " + getFullname() + " взял книгу - " + book.getBookName());
    }

    void returnBook(int bookTaken) {
        System.out.println("Количество возвращенных книг: " + bookTaken);
    }

    void returnBook(String bookName) {
        System.out.println("Читетель вернул книгу " + bookName);
    }

    void returnBook(Book book) {
        System.out.println("Читатель " + getFullname() + " вернул книгу - " + book.getBookName());
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "fullName='" + fullName + '\'' +
                ", ticketNum=" + ticketNum +
                ", faculty='" + faculty + '\'' +
                ", birthDate=" + birthDate +
                ", tel=" + tel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryUser that = (LibraryUser) o;
        if (ticketNum != that.ticketNum) return false;
        if (birthDate != that.birthDate) return false;
        if (tel != that.tel) return false;
        if (fullName != null ? !fullName.equals(that.fullName) : that.fullName != null) return false;
        return faculty != null ? faculty.equals(that.faculty) : that.faculty == null;
    }

    @Override
    public int hashCode() {
        int result = fullName != null ? fullName.hashCode() : 0;
        result = 31 * result + ticketNum;
        result = 31 * result + (faculty != null ? faculty.hashCode() : 0);
        result = 31 * result + birthDate;
        result = 31 * result + tel;
        return result;
    }
}
