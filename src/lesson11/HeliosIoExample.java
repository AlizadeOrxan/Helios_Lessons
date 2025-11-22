package lesson11;

import java.io.*;
import java.util.Scanner;

public class HeliosIoExample {
    public static void main(String[] args) throws IOException {

//
//        File folder = new File("Indvidual Ders");
//        File fayl = new File(folder,"individual Ders.txt");
//
//
//        if (!folder.exists()){
//            folder.mkdir();
//            System.out.println("Folder created");
//
//        }else {
//            System.out.println("Folder exists");
//        }
//
//        if (!fayl.exists()){
//            fayl.createNewFile();
//            System.out.println("File created");
//        } else {
//            System.out.println("File already exists");
//        }
//
//        System.out.println(fayl.getAbsolutePath());
//
//
//        System.out.println(fayl.getAbsolutePath());
//        System.out.println(fayl.getName());
//        System.out.println(fayl.canRead());
//        System.out.println(fayl.canWrite());


//
//        String faylAdi = "bayt_nəticə.dat";
//        String mətn = "Bayt axini ile yazilmish metn";
//        // Mətni bayt massivinə çeviririk (hər simvol bir bayt)
//        byte[] baytlar = mətn.getBytes();
//
//        // 1. Fayla Yazmaq (FileOutputStream)
//        System.out.println("--- 1. Fayla Bayt Yazmaq ---");
//        // try-with-resources: Yazma axınını avtomatik bağlayır
//        try (FileOutputStream fos = new FileOutputStream(faylAdi)) {
//            fos.write(baytlar); // Bütün bayt massivini fayla yazır
//            System.out.println("Məlumat '" + faylAdi + "' faylına yazıldı.");
//        } catch (IOException e) {
//            System.err.println("Yazma xətası: " + e.getMessage());
//        }
//
//
//        // 2. Fayldan Oxumaq (FileInputStream)
//        System.out.println("\n--- 2. Fayldan Bayt Oxumaq ---");
//        // try-with-resources: Oxuma axınını avtomatik bağlayır
//        try (FileInputStream fis = new FileInputStream(faylAdi)) {
//            int bayt;
//            System.out.print("Oxunan Baytlar: ");
//            // Faylın sonuna çatana qədər bir bayt-bir bayt oxuyur (int olaraq qayıdır)
//            while ((bayt = fis.read()) != -1) {
//                // Oxunan baytı simvola çevirib çap edirik
//                System.out.print ( bayt + " \n");
//            }
//            System.out.println(); // Yeni sətrə keçir
//        } catch (IOException e) {
//            System.err.println("Oxuma xətası: " + e.getMessage());
//        }


        String faylAdi = "/Users/orkhanalizade/Downloads/Helios/Indvidual Ders/individual Ders.txt";
//
//        FileWriter fw = new FileWriter(faylAdi);
//        fw.write("Salam biz FileWriter kechirik");
//        fw.write("\n Hemchinin FileReader kechirik");
//        fw.close();
//
//
//        System.out.println("\n--- 2. FileReader ilə Oxumaq ---");
//        try (FileReader reader = new FileReader(faylAdi)) {
//            int simvol;
//            System.out.print("Faylın Məzmunu: ");
//            // Faylın sonuna çatana qədər bir simvol-bir simvol oxuyur
//            while ((simvol = reader.read()) != -1) {
//                // Oxunan int dəyərini simvola çevirib çap edirik
//                System.out.print((char) simvol);
//            }
//            System.out.println();
//        } catch (IOException e) {
//            System.err.println("Oxuma xətası: " + e.getMessage());
//        }

//
//        BufferedWriter writer = new BufferedWriter(new FileWriter(faylAdi));
//
//        writer.write("Hello World");
//        writer.newLine();
//        writer.write("I'm learning Java PL ");
//        writer.append("\nBu yeni setirdir").append("\nBu daha yeni elave edilmishdir").append("\nsdjhagsd ");
//
//        writer.close();
//
//
//        System.out.println("\n--- 2. BufferedReader ilə Oxumaq (Sətir-sətir) ---");
//        // FileReader-i BufferedReader-ə bükürük
//        try (BufferedReader br = new BufferedReader(new FileReader(faylAdi))) {
//            String sətir;
//            System.out.println("Oxunan Məzmun:");
//            // readLine() metodu faylın sonuna çatana qədər null qaytarır
//            while ((sətir = br.readLine()) != null) {
//                System.out.println("-> " + sətir);
//            }
//        } catch (IOException e) {
//            System.err.println("Oxuma xətası: " + e.getMessage());
//        }
//
//
//        String faylAdi1 = "user_input_notes.txt";
//
//        // Scanner obyektini klaviatura (System.in) üçün yaradırıq
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("--- 1. İstifadəçidən Məlumatın Qəbulu (Scanner) ---");
//        System.out.println("Zəhmət olmasa bir neçə qeyd daxil edin (Bitirmək üçün 'son' yazın):");
//
//        // try-with-resources: Fayla buferlə yazma axınını yaradırıq
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(faylAdi))) {
//            String qeyd;
//            int sətirSayğacı = 1;
//
//            // İstifadəçi 'END' daxil edənə qədər oxuma dövrü
//            while (!(qeyd = scanner.nextLine()).equalsIgnoreCase("son")) {
//                // Sətir nömrəsini əlavə edib fayla yazırıq
//                bw.write(sətirSayğacı + ". Qeyd: " + qeyd);
//                bw.newLine(); // Faylda yeni sətrə keçir
//                sətirSayğacı++;
//            }
//
//            System.out.println("\nQeydlər uğurla '" + faylAdi + "' faylına yazıldı.");
//
//        } catch (IOException e) {
//            System.err.println("Fayla yazma zamanı xəta: " + e.getMessage());
//        } finally {
//            // Scanner obyektini bağlamaq mütləqdir
//            scanner.close();
//        }
//
//        System.out.println("\n--- 2. BufferedReader ilə Oxumaq (Sətir-sətir) ---");
//        // FileReader-i BufferedReader-ə bükürük
//        try (BufferedReader br = new BufferedReader(new FileReader(faylAdi))) {
//            String sətir;
//            System.out.println("Oxunan Məzmun:");
//            // readLine() metodu faylın sonuna çatana qədər null qaytarır
//            while ((sətir = br.readLine()) != null) {
//                System.out.println("-> " + sətir);
//            }
//        } catch (IOException e) {
//            System.err.println("Oxuma xətası: " + e.getMessage());
//        }

//        //Tek fayl yaratmaq
//        String pathDesktop = "/Users/orkhanalizade/Desktop/";
//        File fayl = new File(pathDesktop,"yenifayl.txt");
//
//        if (!fayl.exists()) {
//            fayl.createNewFile();
//            System.out.println("Fayl created ");
//        }else {
//            System.out.println("Fayl exists");
//        }
//
////        fayl.delete();
//    }

//        //Tek Folder yaratmaq
//        File file = new File("/Users/orkhanalizade/Desktop/YeniFayl");
//        if (!file.exists()) {
//            file.mkdir();
//            System.out.println("Folder created");
//        }else {
//            System.out.println("Folder exists");
//        }
//
//        file.delete();
    }
}
