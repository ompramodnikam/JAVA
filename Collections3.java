// Stack

import java.util.*;

class Collections3
{
    public static void main(String Arg[])
    {
        Stack <Float> sobj = new Stack<Float>();

        sobj.push(10.5f);
        sobj.push(20.5f);
        sobj.push(30.5f);
        sobj.push(40.5f);

        float fret = sobj.pop();
        System.out.println(fret);

        fret = sobj.pop();
        System.out.println(fret);
    }
}