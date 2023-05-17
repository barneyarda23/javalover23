package day38_access_modifier;

public class Seller {
    public static void main(String[] args) {

        EncapsulationPersonal pers01 = new EncapsulationPersonal();


        //getters
        System.out.println(pers01.getPersonelSumIncome());//0
        System.out.println(pers01.getSellerSoldProductInCome());//0
        System.out.println(pers01.isHoliday());//true

        //setters

        pers01.setPersonelSumIncome(10);
        System.out.println(pers01.getPersonelSumIncome());//10

        pers01.setSellerSoldProductInCome(3);

        pers01.setSellerSoldProductInCome(20);
        System.out.println(pers01.getSellerSoldProductInCome());//20

        EncapsulationPersonal pers02 = new EncapsulationPersonal();
        System.out.println(pers02.getPersonelSumIncome());//0
        System.out.println(pers02.getSellerSoldProductInCome());//0
        System.out.println(pers02.isHoliday());//true




    }
}
