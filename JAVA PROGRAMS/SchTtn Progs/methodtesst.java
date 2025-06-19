class methodtesst{
    /**A shopkeeper buys scintific calculator in bulk of Rs. 15 eachand sells them for Rs. 40 each.
       Calculate the profit on each calculator, and as a percentage of the cp*/
       public static void main(double cp, double sp){
        double profit= sp-cp;
        double profit_perc= (profit/cp)*100;
        System.out.println("Profit is "+profit+" and profit percentage is "+profit_perc);
    }
}