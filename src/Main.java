import java.util.Scanner;
import Entity.ProgramingLanguage;
import sevice.ProgrammingLanguageManager;
import Repository.ProgrammingLanguagerepository;
import sevice.ProgrammingLanguageService;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProgrammingLanguageService programmingLanguageService=new ProgrammingLanguageManager(new ProgrammingLanguagerepository());


        while (true) {
            System.out.println(" --Programlama Dilleri Yönetimi-- ");
            System.out.println("1- Yeni Programlama Dili Ekle");
            System.out.println("2- Programlama Dili Sil");
            System.out.println("3- Programlama Dili Güncelle");
            System.out.println("4- Tüm Dilleri Listele");
            System.out.println("5- Çıkış");
            System.out.println("Seçiminiz: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Programlama dili giriniz:");
                    String name = sc.nextLine();
                    programmingLanguageService.add(new ProgramingLanguage(0, name));
                    System.out.println("Programlama dili eklendi.");
                    break;
                case 2:
                    System.out.println("Silmek istediğiniz dilin idsini giriniz(ID'ler 1'den başlamaktadır):");
                    int deleteId = sc.nextInt();
                    programmingLanguageService.delete(deleteId);
                    System.out.println(deleteId+" id'li dil silindi");
                    break;
                case 3:
                    System.out.println("Güncellemek istediğiniz dilin id'sini giriniz:");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Yeni dil ismini giriniz:");
                    String newName = sc.nextLine();

                    ProgramingLanguage updatedLanguage = new ProgramingLanguage(updateId, newName);
                    programmingLanguageService.update(updatedLanguage);
                    System.out.println("Dil güncellendi.");
                    break;
                case 4:
                    System.out.println("--Programlama Dilleri Listesi--");
                    for(ProgramingLanguage language : programmingLanguageService.getAll()) {
                        System.out.println(language);
                    }
                    break;
                case 5:
                    System.out.println("Çıkış Yapılıyor.");
                    sc.close();
                    return;
                default:
                    System.out.println("Geçersiz Seçim Yapıldı!");
            }

        }
    }
}