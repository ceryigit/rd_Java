public class Muhasebe {
    public static void main(String[] args) {
        int totalday = 26;
        int maas = 10000;
        int prim = totalday-25;
        int sonuc = (totalday > 25 ) ? maas+= 1000*prim : maas;
        System.out.println(sonuc);

    }
}