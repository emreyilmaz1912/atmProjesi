import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Emre Bankasına Hoşgeldiniz!");
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3, balance = 2000, select;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanızı Giriniz :");
            password = input.nextLine();

            if (userName.equals("emreyilmaz") && password.equals("10Kasım1938")) {
                System.out.println("Merhaba, Emre Bankasına Hoşgeldiniz! :");
                do {
                    System.out.println("1 - Para yatırma\n" +
                            "2 - Para Çekme\n" +
                            "3 - Bakiye Sorgulama\n" +
                            "4 - Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Yatırılacak para miktarı :");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println("Yeni bakiyeniz : " + balance);
                            continue;
                        case 2:
                            System.out.print("Çekmek istediğiniz para miktarını giriniz : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                                System.out.println("İşlem sonrası bakiyeniz : " + balance);
                            }
                            continue;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            continue;

                    }
                    break;
                } while ( select != 4 ); {
                    System.out.println("Tekrar Görüşmek Üzere.");

                }
                break;

            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                }
            else {
                System.out.println("Kalan hakkınız : " + right);
            }
        }

    }
}
}
