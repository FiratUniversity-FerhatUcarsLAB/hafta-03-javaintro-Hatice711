public class HesapOzeti {
    public static void main(String[] args) {
        System.out.println("==== Hesap Ozeti ====");
        System.out.println("Ürün  Miktar  Fiyat  Toplam");
        System.out.println("-------------------------------");

        System.out.println("Elma   3   10.0   "+(3 * 10.0));
        System.out.println("Ekmek  2    5.0   "+(2 *  5.0));
        System.out.println("Süt    1   15.0   "+(1 * 15.0));

        double toplam = (3*10.0) + (2*5.0) + (1*15.0);
        System.out.println("-------------------------------");
        System.out.println("GENEL TOPLAM:"+toplam);
        }
    }
