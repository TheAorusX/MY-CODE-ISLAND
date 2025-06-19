class prog7{
    /**Wap to accept the cp and sp of a scinyific calculator.Find out wheather the shopkeeper makes a profit or loss*/
    public static void main(int cp, int sp){
        if(cp>sp && sp<cp){
            System.out.println("The shopkeeper makes a loss");
        }
        else{
            System.out.println("The shopkeeper makes a profit");
        }
    }
}