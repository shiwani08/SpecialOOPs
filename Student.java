public class Student {
    String name;
    int roll;
    public Student (String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    @Override
    public String toString () {
        return "Student {" +
        "name:  " + name + " roll no: "+ roll + "}\n";
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj) 
            return true;
        
        if(obj == null || getClass() != obj.getClass())
            return false;
            
        Student stu = (Student) obj;
            return roll == stu.roll;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll);
    }
}