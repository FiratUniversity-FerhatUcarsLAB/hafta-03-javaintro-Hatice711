public class MilKilometreTablosu {
    public  static void main(String[] args) {
        double [] milDegerleri = {1,5,10,20,50};
        System.out.println("Mil\t Kilometre");

        for (double mil : milDegerleri) {
            double km = mil * 1.609;
            System.out.printf("%.0f\t %.3f%n", mil, km);
        }
    }
}
