import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int cost = 1500;
        int right = 3;

        while (right != 0) {
            System.out.print("Kullanıcı adınız: ");
            String username = in.nextLine();

            System.out.print("Şifreniz: ");
            String password = in.nextLine();

            switch (username) {
                case "patika":
                    switch (password) {
                        case "java123":
                            System.out.println("Patika bankaya hoşgeldiniz.\n");
                            right = 0;
                            boolean h = true;
                            while (h) {
                                System.out.print("1. Para yatırma\n2. Para çekme\n3. Bakiye sorgulama\n4. Çıkış yap\n\nSeçiminiz: ");
                                int select = in.nextInt();
                                System.out.println();
                                switch (select) {
                                    case 1:
                                        System.out.print("Ne kadar para yatırmak istiyorsunuz: ");
                                        int amountGive = in.nextInt();
                                        cost += amountGive;
                                        h = false;
                                        System.out.println();
                                        System.out.print("Başka işlem yapmak ister misiniz ?(E/H): ");
                                        String x = in.next();
                                        System.out.println();
                                        switch (x) {
                                            case "E":
                                                h = true;
                                                break;
                                            case "H":
                                                h = false;
                                                break;
                                        }
                                        break;
                                    case 2:
                                        System.out.print("Ne kadar para çekmek istiyorsunuz: ");
                                        int amountTake = in.nextInt();
                                        System.out.println();
                                        if (amountTake > cost) {
                                            System.out.println("Bakiye yetersiz !");
                                        } else {
                                            cost -= amountTake;
                                        }
                                        h = false;
                                        System.out.println();
                                        System.out.print("Başka işlem yapmak ister misiniz ?(E/H): ");
                                        String q = in.next();
                                        System.out.println();
                                        switch (q) {
                                            case "E":
                                                h = true;
                                                break;
                                            case "H":
                                                h = false;
                                                break;
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Bakiyeniz: " + cost);
                                        h = false;
                                        System.out.println();
                                        System.out.print("Başka işlem yapmak ister misiniz ?(E/H): ");
                                        String z = in.next();
                                        System.out.println();
                                        switch (z) {
                                            case "E":
                                                h = true;
                                                break;
                                            case "H":
                                                h = false;
                                                break;
                                        }
                                        break;
                                    case 4:
                                        System.out.println("Çıkılıyor...");
                                        h = false;
                                }
                            }
                            System.out.println("Tekrar görüşmek üzere.");
                            break;
                        default:
                            right--;
                            switch (right) {
                                case 0:
                                    System.out.println("Hesabınız bloke oldu. Lütfen banka ile iletişime geçiniz.");
                                    break;
                                default:
                                    System.out.println("Yanlış kullanıcı adı veya şifre. Tekrar deneyiniz.\nKalan hakkınız: " + right);
                                    break;
                            }
                            break;
                    }
                    break;
                default:
                    right--;
                    switch (right) {
                        case 0:
                            System.out.println("Hesabınız bloke oldu. Lütfen banka ile iletişime geçiniz.");
                            break;
                        default:
                            System.out.println("Yanlış kullanıcı adı veya şifre. Tekrar deneyiniz.\nKalan hakkınız: " + right);
                            break;
                    }
                    break;
            }
        }
    }
}
