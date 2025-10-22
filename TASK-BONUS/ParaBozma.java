public class ParaBozma {
    public static void main(String[] args) {
        int para = 278 ;
        int [] banknotlar = {100,50,20,5,2,1};

       System.out.println("Toplam: " + para + "TL");

       for(int b : banknotlar) {
           int adet = para / b;
           para %= b;
           System.out.println(adet + " x " + b + " TL ");
       }
    }
}
