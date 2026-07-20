interface RoutePlan
{
    public void route();
}
class Carplan implements RoutePlan
{
    public void route()
    {
        System.out.println("this is car stragtegy");
    }
}

class Bikeplan implements RoutePlan
{
    public void route()
    {
        System.out.println("this is bike stragtegy");
    }
}
class Walkplan implements RoutePlan
{
    public void route()
    {
        System.out.println("this is Walk stragtegy");
    }
}

class GoogleMaps
{
    private RoutePlan rp;
    GoogleMaps(RoutePlan rp)
    {
        this.rp=rp;
    }
    public void navigate()
    {
        rp.route();
    }
}

class Main {
    public static void main(String[] args) {
        RoutePlan rp=new Carplan();
        GoogleMaps gp=new GoogleMaps(rp);
        gp.navigate();
    }
}
