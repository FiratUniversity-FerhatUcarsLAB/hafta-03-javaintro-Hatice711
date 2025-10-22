public class SaatDonusturme {
    public static void main(String[] args) {
        int saniye = 3665 ;

        int saat= saniye / 3600 ;
        saniye %= 3600 ;

       int dakika = saniye / 60 ;
       int kalanSaniye = saniye % 60 ;

       System.out.printf("%d:%02d:%02d%n",saat, dakika,kalanSaniye);
    }
}
