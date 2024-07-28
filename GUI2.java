import java.awt.*;

class MarvellousFrame
{
    public MarvellousFrame(String title)
    {
        Frame fobj = new Frame(title);
        fobj.setSize(600,600);
        fobj.setVisible(true);
    }
}

class GUI2
{
    public static void main(String A[])
    {
        MarvellousFrame mobj = new MarvellousFrame("Marvellous");
    }
}