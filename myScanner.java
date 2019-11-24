import java.util.Scanner;

class myScanner{
    public static void main(final String args[]) {
        
        String name;
        int age;

        final Scanner in = new Scanner(System.in);

        name = in.nextLine();
        age = in.nextInt();
        
        in.close();

        System.out.println("Hello, "+name+" you're "+ age + " years old");
        System.exit(1);
    }
}