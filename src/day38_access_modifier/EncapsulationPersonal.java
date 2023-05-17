package day38_access_modifier;

public class EncapsulationPersonal {


    private int personelSumIncome = 0;
    private int sellerSoldProductInCome = 0;

    private boolean holiday = true;

    public int getPersonelSumIncome(){
        return personelSumIncome;




    }

    public void setPersonelSumIncome(int personelSumIncome) {
        this.personelSumIncome = personelSumIncome;
    }

    public void setSellerSoldProductInCome(int sellerSoldProductInCome) {
        this.sellerSoldProductInCome = sellerSoldProductInCome;
    }

    public int getSellerSoldProductInCome() {
        return sellerSoldProductInCome;
    }

    public boolean isHoliday() {
        return holiday;
    }
}
