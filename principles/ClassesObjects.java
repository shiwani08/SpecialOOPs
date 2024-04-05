public class ClassesObjects {
    public static void main(String[] args) {
        person p1 = new person();
        person p2 = new person();
        person p3 = new person();
        person p4 = new person();

        p1.setName("Shiwani");
        p1.setAge(21);
        System.out.println("p1 -> name: " + p1.getName() + " ,age: " + p1.getAge());

        p2.setName("Emma");
        p2.setAge(34);
        System.out.println("p2 -> name: " + p2.getName() + " ,age: " + p2.getAge());

        p3.setName("Rupert");
        p3.setAge(38);
        System.out.println("p3 -> name: " + p3.getName() + " ,age: " + p3.getAge());

        p4.setName("Daniel");
        p4.setAge(37);
        System.out.println("p4 -> name: " + p4.getName() + " ,age: " + p4.getAge());
    }
}


