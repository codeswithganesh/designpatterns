
interface Screen
{
     public void ScreenDetails();
}
interface Processor
{
    public void ProcessorDetails();
}

interface Camera
{
    
    public void CameraDetails();
}

class iphonescreen implements Screen
{
    public void ScreenDetails()
    {
        System.out.println("This is iphoneScreen");
    }
}
class iphoneprocessor implements Processor
{
     public void ProcessorDetails()
     {
         System.out.println("This is iphoneProcessor");
     }
}

class iphonecamera implements Camera
{
    public void CameraDetails()
    {
        System.out.println("This is iphoneCamera");
    }
}


class Samsungscreen implements Screen
{
    public void ScreenDetails()
    {
        System.out.println("This is SamsungScreen");
    }
}
class Samsungprocessor implements Processor
{
     public void ProcessorDetails()
     {
         System.out.println("This is SamsungProcessor");
     }
}

class Samsungcamera implements Camera
{
    public void CameraDetails()
    {
        System.out.println("This is SamsungCamera");
    }
}

interface PhoneFactory
{
    public Screen createScreen();
    public Processor createPorcessor();
    public Camera createCamera();
}
class AppleFactory implements PhoneFactory
{
    public Screen createScreen()
    {
        return new iphonescreen();
    }
    public Processor createPorcessor()
    {
        return new iphoneprocessor();
    }
    public Camera createCamera()
    {
        return new iphonecamera();
    }
}

class SamsungFactory implements PhoneFactory
{
    public Screen createScreen()
    {
        return new Samsungscreen();
    }
    public Processor createPorcessor()
    {
        return new Samsungprocessor();
    }
    public Camera createCamera()
    {
        return new Samsungcamera();
    }
}



class Main {
    public static void main(String[] args) {
        PhoneFactory factory=new SamsungFactory();
        Screen s= factory.createScreen();
        Processor p =factory.createPorcessor();
        Camera c=factory.createCamera();
        s.ScreenDetails();
        p.ProcessorDetails();
        c.CameraDetails();
    }
}
