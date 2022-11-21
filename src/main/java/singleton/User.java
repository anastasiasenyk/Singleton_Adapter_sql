package singleton;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class User {
    private String name;
    private String email;
    private int age;

    public User(){
    }

    public void save() {
        Connection connection = Connection.getInstance();
        connection.executeQuery("insert into user (email, name, age) values ('helloyou@ucu.edu.ua', 'Yaroslav', 90);");
    }
}
