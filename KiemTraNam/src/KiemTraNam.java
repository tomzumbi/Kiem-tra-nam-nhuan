import java.util.Scanner;

public class KiemTraNam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nam;
        System.out.println("nhap nam");
        nam = scanner.nextInt();
        if (nam % 4 == 0){
            if (nam % 100 == 0){
                if (nam % 400 == 0){
                    System.out.println(nam + "la nam nhuan");
                }else {
                    System.out.println(nam + "khong phai nam nhuan");
                }
            }else {
                System.out.println(nam + "la nam nhuan");
            }
        }else {
            System.out.println(nam + "khong phai nam nhuan");
        }
        

    }
}
