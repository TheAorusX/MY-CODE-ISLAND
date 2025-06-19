class prog3
{
   /**Wap to accept three sides of a triangle and print the greatest side*/
   public static void main(int s1, int s2, int s3)
   {
     int greatest;
     if(s1>s2 && s1>s3){
           greatest=s1;
     }
     else if(s2>s1 && s2>s3){
           greatest=s2;
     }
     else{//if s3>s1 && s3>s2
          greatest=s3;
     }
     System.out.println(" The sides of the triangle  are "+s1+", "+s2+", "+s3+", and the greatest side is "+greatest);
     System.out.println("Credits-𝓐𝔂𝓪𝓪𝓷 𝓚𝓪𝔃𝓲");
    }
}
