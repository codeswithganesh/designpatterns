final class Singleton
{
    public static Singleton object;
    public String value;
    
    private Singleton(String value)
    {
        this.value=value;
    }
    
    public static Singleton getInstance(String value)
    {
        if(object==null)  object = new Singleton(value);
        
        return object;
    }
}
class Main {
    public static void main(String[] args) {
        Singleton obj1=Singleton.getInstance("Sunil");
        System.out.println(obj1.value);
        Singleton obj2=Singleton.getInstance("Ganesh");
        System.out.println(obj2.value);
    }
}
