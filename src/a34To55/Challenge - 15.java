package a34To55;

class StudentToString {

    String name;
    int age;
    String rollNumber;
    String house;


    public StudentToString(String name, int age, String rollnumber, String house) {
        this.name = name;
        this.age = age;
        this.rollNumber= rollnumber;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Student Detail:{name:" + name
                 + ", age:" + age
                 +", rollNumber:" + rollNumber
                 +", house:" + house + "}";
    }


    public static void main(String[] args) {
        StudentToString stu = new StudentToString("Sriyam",
                30, "001", "shivaji");
        System.out.println(stu);
    }
}
