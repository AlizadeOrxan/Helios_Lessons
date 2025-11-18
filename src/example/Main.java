package example;


import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){


//        Scanner input = new Scanner(System.in);
//
//        try {
//            BufferedWriter bf = new BufferedWriter(new FileWriter("multi.txt",true));
//
//            System.out.println("Metnleri daxil edin \n");
//
//            while (true) {
//                String name = input.nextLine();
//                if (name.equalsIgnoreCase("exit")){
//                    break;
//                }
//                bf.write(name);
//                bf.newLine();
//            }as
//            bf.close();
//            System.out.println("Metn daxil edildi");
//
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        input.close();

// Fayla yazmaq uchun append olaraq true verilir
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true))) {
//            writer.write("Salam, Java!");
//            writer.newLine(); // Yeni sətir əlavə edir
//            writer.write("Bu məlumat fayla yazıldı.");
//            System.out.println("Məlumatlar fayla yazıldı.");
//        } catch (IOException e) {
//            System.out.println("Xəta: " + e.getMessage());
//        }
/// ///////////////////////////////////////////////////////////////
//
//        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
//            String line;
//            System.out.println("Faylın məzmunu:");
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println("Xəta: " + e.getMessage());
//        }
/// ////////////////////////////////////////

//        try (FileOutputStream fos = new FileOutputStream("multi.txt")) {
////
//            String name = "Murad";
//            byte[] arr = name.getBytes();
//            fos.write(arr);
//
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//
//        try (FileInputStream fis = new FileInputStream("multi.txt")) {
//
//            int line ;
//            while ((line = fis.read())!= -1 ){
//                System.out.print(line + "\t");
//            }
//
//        }catch (IOException e){
//            e.printStackTrace();
//        }



    }
}
