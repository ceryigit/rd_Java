public class Maas {
    int aylikMaas = 10000;
    int day = 23;
    int prim = day-25;
    public void maasHesapla () {
        int  sonuc = (day > 25 ) ? aylikMaas+= 1000*prim : aylikMaas;
        System.out.println(sonuc);

    }
}
