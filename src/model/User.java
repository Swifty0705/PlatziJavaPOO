package model;

public class User {
    static int id=0;
    private String name;
    private String email;
    private String address;
    private int age;
    private String gender;

    private String phone;


    public User(String name, String email) {
        this.name = name;
        this.email = email;
        id++;
        System.out.println(id);
    }

    public String getName() {
        return "Name: "+name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return "Age: "+age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return "Gender: "+gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return "Address: "+address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return "Phone: "+phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return "Email: "+email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
