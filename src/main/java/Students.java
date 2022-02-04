public class Students {
    private int id1;
    private String name1;
    private String lastName1;
    private int age1;

    public Students() {

    }

    public Students(int id1, String name1, String lastName1, int age1) {
        this.id1 = id1;
        this.name1 = name1;
        this.lastName1 = lastName1;
        this.age1 = age1;
    }


    @Override
    public String toString() {
        return "Students{" +
                "id1=" + id1 +
                ", name1='" + name1 + '\'' +
                ", lastName1='" + lastName1 + '\'' +
                ", age1=" + age1 +
                '}';
    }


    public int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public int getAge1() {
        return age1;
    }

    public void setAge1(int age1) {
        this.age1 = age1;
    }
}


