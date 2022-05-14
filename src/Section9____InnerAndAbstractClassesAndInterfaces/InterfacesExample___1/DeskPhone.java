package Section9____InnerAndAbstractClassesAndInterfaces.InterfacesExample___1;

public class DeskPhone implements Itelephone {

    private int myNumber;
    private boolean isRinging;
    public DeskPhone(int myNumber)
    {
        this.myNumber=myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action wil taken, desk phone does not have power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now Ringing " + phoneNumber + " on deskphone");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the desk phone");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            System.out.println("Ring Ring");
            isRinging = true;
        } else {
            isRinging = false;
        }
        return isRinging;

    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
