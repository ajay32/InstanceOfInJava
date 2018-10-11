package com.ajay.instanceofinjava.InstanceOf;

// main use in data inversion principle ... when we send different class objects through interface
// to do different tasks according to requirement...

//1 useof instance off

// parent could be interface or another class

 class BlackCoffee implements CoffeeType {

    @Override
    public void coffeeMaking() {
        System.out.println("Black Coffee making");
    }

    public void blackBlack(){
        System.out.println("I am black");
    }
}

class ColdCoffee implements CoffeeType {

    @Override
    public void coffeeMaking() {
        System.out.print("Cold coffee making");
    }

    public void ColdCOld(){
        System.out.print("I am cold cold");
    }
}


class WhatYouWant {

     CoffeeType cp;

     WhatYouWant(CoffeeType coffeeMaker) {

         cp = coffeeMaker;

         if(cp instanceof BlackCoffee) { // 2 usage

             cp.coffeeMaking(); //1 to use interface method for particular class work

             ((BlackCoffee) cp).blackBlack(); //2 use that class personal method ...

             // *************** if above statement look confusing use Downcasting **********

             BlackCoffee bb = (BlackCoffee) cp;
             bb.blackBlack();
             bb.coffeeMaking();


         }else if(cp instanceof ColdCoffee){
             cp.coffeeMaking();
             ((ColdCoffee) cp).ColdCOld();
         }
     }
}

public class Example2 {
    public static void main(String args[]) {

        CoffeeType blackCoffee= new BlackCoffee();
        CoffeeType coldCoffee = new ColdCoffee();
        WhatYouWant whatYouWant= new WhatYouWant(blackCoffee);
    }
}
