import java.util.Scanner;
public class DongulerOdevTersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi;
        System.out.print("Sayı Giriniz:");
        sayi = input.nextInt();

        for(int i=sayi; i>=1;i--){
            for (int k=sayi-i; k>=1; k--){
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
