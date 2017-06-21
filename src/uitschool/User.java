package uitschool;
public class User {
    private String login;
    private int password;

    void createQuery(){
        int var = 13;
        class Query{

           public void printToLog(){
                System.out.println("user: " + login + " pass: "+ password + " finalVar " + var);
            }
        }
        Query q1 = new Query();
       q1.printToLog();
    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public class Querry{

    }

    public static void main(String[] args) {
        User user1 = new User();
        user1.createQuery();

    }
}
