package lesson1.loops;

public class Examples {
    public static void main(String[] args) {


        String name = "Azerbaycan";

        int count = 0 ;
        for (int i= 0 ; i < name.length() ; i++) {
            System.out.print(name.charAt(i));
            if (name.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println("\n A herfinin sayi " + count);


    }
}
