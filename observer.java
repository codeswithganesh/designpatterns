import java.util.*;
interface Observer
{
    public void notify(String str);
}

class Subscriber implements Observer
{
    private String name;
    public Subscriber(String name)
    {
        this.name=name;
    }
    public void notify(String str)
    {
        System.out.println(name+" received notufication for "+str);
    }
}

class Emailservice implements Observer
{
    public void notify(String name)
    {
        System.out.println("Sending Email for "+name);
    }
}

class YChannel
{
    ArrayList<Observer> s=new ArrayList<>();
    private String latestVideo;
    public void subscribe(Observer o)
    {
        s.add(o);
    }
    
    public void unsubscribe(Observer o)
    {
         s.remove(o);
    }
    
    
    public void notifyall()
    {
        System.out.println("Notifying all user.....");
        for(Observer o: s)
        {
            o.notify(latestVideo);
        }
    }
    
    public void upload(String name)
    {
        this.latestVideo=name;
        notifyall();
    }
}

class Main {
    public static void main(String[] args) {
        Observer raju=new Subscriber("raju");
        Observer sunil=new Subscriber("Sunil");
        Observer email=new Emailservice();
        YChannel yt=new YChannel();
        
        yt.subscribe(raju);
        yt.subscribe(sunil);
        yt.subscribe(email);
        
        yt.upload("First Upload");
        
    }
}
