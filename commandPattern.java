import java.util.*;
interface command
{
    public void execute();
}

class clockin implements command
{
    private void clockinprocessor()
    {
        System.out.println("This is clokcin command");
    }
    public void execute()
    {
        clockinprocessor();
    }
}

class clockout implements command
{
    private void clockoutprocessor()
    {
        System.out.println("This is clock out command");
    }
    public void execute()
    {
        clockoutprocessor();
    }
}


class Attachment implements command
{
    private void attachmentprocessor()
    {
        System.out.println("This is Attachment out command");
    }
    public void execute()
    {
        attachmentprocessor();
    }
}

class offlinesync
{
    ArrayList<command> list=new ArrayList<>();
    public void add(command c)
    {
        list.add(c);
    }
    public void sync()
    {
        for(command c: list)
        {
            c.execute();
        }
    }
}

class Main {
    public static void main(String[] args) {
       
        command in=new clockin();
        command out=new clockout();
        command a=new Attachment();
        offlinesync s=new offlinesync();
        s.add(in);
        s.add(out);
        s.add(a);
        
        s.sync();
    }
}
