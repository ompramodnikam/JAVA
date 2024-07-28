/*
    getClass()
    hashCode()
    equals()
    clone()
    finalize()
*/

class Marvellous
{}

// class ObjectDemo extends Object
class ObjectDemo
{
    public static void main(String Arg[])
    {
        Marvellous obj = new Marvellous();
        System.out.println(obj.getClass().getName());
    }
}