public class FirstClass {
    public static void main(String [] args) {

        String name = args[0], surname = args[1];
        System.out.println("name: " + name);
        System.out.println("surname: " + surname);
        System.out.println((name.equals(surname) ? "equal" : "not equal"));
    }
}
