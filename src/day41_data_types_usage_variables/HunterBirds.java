package day41_data_types_usage_variables;

public class HunterBirds extends Birds {
    String move= "they fly";
    String nutrition= "eats meat";
    String claw= "clawed";
    String beak= "pointed beak";

    public static void main(String[] args) {

        HunterBirds hunterEagle = new HunterBirds();
        System.out.println(hunterEagle.move);//they fly
        System.out.println(hunterEagle.nutrition);//eats meat
        System.out.println(hunterEagle.claw); //clawed
        System.out.println(hunterEagle.beak); // pointed beak

        System.out.println(hunterEagle.wing); //they are winged
        System.out.println(hunterEagle.respiration);//they breathe with lungs
        System.out.println(hunterEagle.multiply);//they multiply with eggs

        System.out.println(hunterEagle.life);//they live and die

        System.out.println("============================");


        Birds birdEagle = new HunterBirds();


        System.out.println(birdEagle.move);//they move
        System.out.println(birdEagle.nutrition);//they are fed
//        System.out.println(birdEagle.claw); //CTE

        System.out.println(birdEagle.beak); // they have  beaks

        System.out.println(birdEagle.wing); //they are winged
        System.out.println(birdEagle.respiration);//they breathe with lungs
        System.out.println(birdEagle.multiply);//they multiply with eggs

        System.out.println(birdEagle.life);//they live and die

        System.out.println("========================");

        AnimalKingdom animalEagle = new HunterBirds();


        System.out.println(animalEagle.move);//they fly
        System.out.println(animalEagle.nutrition);//eats meat
//        System.out.println(animalEagle.claw); //CTE
//        System.out.println(animalEagle.beak); // CTE
//
//        System.out.println(animalEagle.wing); // CTE
        System.out.println(animalEagle.respiration);//they breathe with lungs
        System.out.println(animalEagle.multiply);//they multiply with eggs

        System.out.println(animalEagle.life);//they live and die






    }
}
