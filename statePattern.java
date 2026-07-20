interface ATMState
{
    void insertCard(ATM atm);
    void enterPin(ATM atm);
    void withDraw(ATM atm);
    void ejectCard(ATM atm);
}
class ATM
{
    private ATMState current;
    public ATM()
    {
        current=new NoCardState();
    }
    public void setState(ATMState state)
    {
        current=state;
    }
    public void insertCard()
    {
        current.insertCard(this);
    }
    public void enterPin()
    {
        current.enterPin(this);
    }
    
    public void withDraw()
    {
        current.withDraw(this);
    }
    
    public void ejectCard()
    {
        current.ejectCard(this);
    }
}

class NoCardState implements ATMState
{
    public void insertCard(ATM atm)
    {
        System.out.println("Card Inserted.......");
        atm.setState(new CardInsertState());
    }
    public void enterPin(ATM atm)
    {
        System.out.println("please insert the card first");
    }
    public void withDraw(ATM atm){
        System.out.println("please insert the card first");
    }
    public void ejectCard(ATM atm){
        System.out.println("please insert the card first");
    }
    
}
class CardInsertState implements ATMState
{
    public void insertCard(ATM atm)
    {
        System.out.println("Card Already inserted");
    }
    public void enterPin(ATM atm)
    {
        System.out.println("PIN Verified");
        atm.setState(new PinVerifedState());
    }
    public void withDraw(ATM atm){
        System.out.println("Please enter the pin first .....");
    }
    public void ejectCard(ATM atm){
        System.out.println("Please enter the pin first .....");
    }
    
}
class PinVerifedState implements ATMState
{
     public void insertCard(ATM atm)
    {
        System.out.println("Card Already inserted");
    }
    public void enterPin(ATM atm)
    {
        System.out.println("pin already verified .....");
        
    }
    public void withDraw(ATM atm){
        System.out.println("Cash Dispensed");
        atm.setState(new NoCardState());
    }
    public void ejectCard(ATM atm){
        System.out.println("Card Ejected");
        atm.setState(new NoCardState());
    }
}

class Main {
    public static void main(String[] args) {
       
        ATM atm=new ATM();
        atm.withDraw();
        atm.insertCard();
        atm.insertCard();
        atm.enterPin();
        atm.withDraw();
        atm.enterPin();
        atm.withDraw();
        atm.withDraw();
        atm.ejectCard();
    }
}
