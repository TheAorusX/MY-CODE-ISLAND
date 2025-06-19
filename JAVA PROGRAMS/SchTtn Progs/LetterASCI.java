class LetterASCI
{
    public static void main()
    {
        for(char ch='A';ch<='Z';ch++)
        {
            System.out.println(ch+"         "+(int)ch+"     "+(char)(ch+32)+"         "+((int)ch+32));
        }
    }
}