public class Muhasebe {
    public static void main(String[] args) {
        int totalday = 30;
        int maas = 10000;
        int prim = totalday-25;
        if (totalday > 25 ) {

            maas+= 1000*prim;
            System.out.println(maas);

        }
        else System.out.println(maas);
    }
}