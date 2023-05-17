package day41_data_types_usage_for_methods;

import day41_data_types_usage_methods.AnimalKingdom;
import day41_data_types_usage_methods.Birds;

public class HunterBirds extends Birds {
    public void  move(){
        System.out.println("they fly");
    }
    public  void nutrition(){
        System.out.println("eats meat");
    }
    public  void claw(){
        System.out.println("clawed");
    }
    public  void beak(){
        System.out.println("pointed beak");
    }
    public static void main(String[] args) {
        HunterBirds hunterEagle = new HunterBirds();


        //data type is HunterBirds
        hunterEagle.move();  //they fly
        hunterEagle.nutrition();  //eats meat
        hunterEagle.claw();  //clawed
        hunterEagle.beak();  //pointed beak
        hunterEagle.wing();  // they are winged
        hunterEagle.respiration();  // they breathe with lungs
        hunterEagle.beak();  // pointed beak
        hunterEagle.multiply();  // they multiply with eggs
        hunterEagle.life(); // they live and die


        System.out.println("=================================");

        Birds birdEagle = new HunterBirds();
        //data type is Birds
        birdEagle.move();  //they fly
        birdEagle.nutrition();  //eats meat
//        birdEagle.claw();  // cte
        birdEagle.beak();  //pointed beak
        birdEagle.wing();  // they are winged
        birdEagle.respiration();  // they breathe with lungs // if it over-read we do not check next class.
        birdEagle.beak();  // pointed beak
        birdEagle.multiply();  // they multiply with eggs
        birdEagle.life(); // they live and die


        AnimalKingdom animalEagle = new HunterBirds();




    }
}
