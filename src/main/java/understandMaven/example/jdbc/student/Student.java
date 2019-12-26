package understandMaven.example.jdbc.student;

public class Student {

    private int id;
    private String name;
    private int score;
    private String address;
    private String date;

    public Student() {
    }

    public Student( String name, int score, String address, String date) {
        this.name = name;
        this.score = score;
        this.address = address;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score='" + score + '\'' +
                ", address='" + address + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
