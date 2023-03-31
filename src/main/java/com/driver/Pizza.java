package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg==true){
            price+=300;
        }
        else{
            price+=400;
        }

        bill="Base Price Of The Pizza: "+price+"\n";
    }


    public int getPrice(){

        return this.price;
    }

    boolean addcheese=false;
    public void addExtraCheese(){
        // your code goes here
        if(addcheese==false){
            this.price+=80;
            bill+="Extra Cheese Added: 80\n";
            addcheese=true;
        }
    }

    boolean addtopping=false;
    public void addExtraToppings(){
        // your code goes here
        if(addtopping==false){
            if(isVeg==true){
                this.price+=70;
                bill+="Extra Toppings Added: "+70+"\n";
            }
            else{
                this.price+=120;
                bill+="Extra Toppings Added: "+120+"\n";
            }
            addtopping=true;
        }
    }

    boolean takeawy=false;
    public void addTakeaway(){
        // your code goes here
        if(takeawy==false){
            this.price+=20;
            bill+="Paperbag Added: "+20+"\n";
            takeawy=true;
        }
    }

    public String getBill(){
        // your code goes here

        this.bill = ("Base Price Of The Pizza: " + (isVeg?300:400)+
                (addcheese?("\nExtra Cheese Added: 80"):" ") +
                (addtopping?("\nExtra Toppings Added: "  + (isVeg?70:120)):"") +
                (takeawy?("\nPaperbag Added: 20"):"") +
                "\nTotal Price: "+ this.price + "\n"
        );

        return this.bill;
    }
}