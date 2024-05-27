public class CompanyA {
    String  ik [] = new String[2];
    String it [] = new String[3];
    String marketing;
    void IkMembers () {
        for (int i=0; i<ik.length; i++) {
            System.out.println("İnsan kaynakları personeli: " + ik[i]);
        }
    }

    void ItMembers() {
        for (int i=0; i<it.length; i++) {
            System.out.println("IT personeli:" + it[i]);
        }

    }

    void MarketingMember(){
        System.out.println("Pazarlama personeli: " + marketing);
    }

}
