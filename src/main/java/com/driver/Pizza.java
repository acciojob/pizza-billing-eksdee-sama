package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private Boolean hasExtraCheese;
    private Boolean hasExtraToppings;
    private Boolean hasTakeaway;
    private Boolean hasPaperBag;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.price = isVeg ? 300 : 400;
        this.hasExtraCheese = false;
        this.hasExtraToppings = false;
        this.hasTakeaway = false;
        this.hasPaperBag = false;
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!hasExtraCheese){
            this.price += 80;
            this.hasExtraCheese = true;
            this.bill += "Extra Cheese Added: 80\n";
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!hasExtraToppings){
            this.price += isVeg ? 70 : 120;
            this.hasExtraToppings = true;
            this.bill += "Extra Toppings Added: " + (isVeg ? "70" : "120") + "\n";
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!hasTakeaway){
            this.price += 0;
            this.hasTakeaway = true;
            this.bill += "Takeaway Added\n";
        }
    }
    public void addPaperBag(){
        if(!hasPaperBag){
            this.price += 20;
            this.hasPaperBag = true;
            this.bill += "Paperbag Added: 20\n";
        }
    }


    public String getBill(){
        // your code goes here
        this.bill = "Base Price Of The Pizza: " + this.getPrice() + "\n";
        if(this.hasExtraCheese) this.bill += "Extra Cheese Added: 80\n";
        if(this.hasExtraToppings) this.bill += "Extra Toppings Added: " + (isVeg ? "70" : "120") + "\n";
        if(this.hasTakeaway) this.bill += "Takeaway Added\n";
        if(this.hasPaperBag) this.bill += "Paperbag Added: 20\n";
        this.bill += "Total Price: " + this.getPrice() + "\n";
        return this.bill;    }
}
