
class StringComare
{
    public static void main(String Arg[])
    {
        String s1 = "Hello";
        String s2 = "Demo";
        String s3 = new String("Hello");
        String s4 = "Hello";

        if(s1 == s4)
        {
            System.out.println("s1 and s4 are same");
        }

        if(s1 == s3)
        {
            System.out.println("s1 and s3 are same");
        }

        if(s1.equals(s3))
        {
            System.out.println("s1 and s3 are same using equals method");
        }
    }
}