public class Error {
    public static void main(String[] args) {
        HesapMakinesi hesapla = new HesapMakinesi();
        try {
            System.out.println("Bölme işlemi sonucu: " + hesapla.divide(20,0));
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Bölme işlemi sırasında hata oluştu.");
            throw new ArithmeticException("Sıfıra bölme işlem hatası");
        }
    }
}
