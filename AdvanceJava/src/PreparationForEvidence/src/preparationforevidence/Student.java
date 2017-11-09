
package preparationforevidence;


public class Student {
    private String name;
    private String Email;
    private int age;
    private String gender;
    private String round;
    private String hobby;
    private String note;

    public Student() {
    }

    public Student(String name, String Email, int age, String gender, String round, String hobby, String note) {
        this.name = name;
        this.Email = Email;
        this.age = age;
        this.gender = gender;
        this.round = round;
        this.hobby = hobby;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return Email;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getRound() {
        return round;
    }

    public String getHobby() {
        return hobby;
    }

    public String getNote() {
        return note;
    }
    
    
}
