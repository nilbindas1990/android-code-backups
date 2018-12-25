package myapp.test.nilabhra.com.vollyjsontest;

/**
 * Created by nilabhra on 12/25/2018.
 */

public class DataObject {
    String id, name, email, phone;

    public DataObject(String id , String name, String email, String phone){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }

}
