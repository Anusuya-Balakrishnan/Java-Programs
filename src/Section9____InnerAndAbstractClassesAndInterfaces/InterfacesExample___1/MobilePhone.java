package Section9____InnerAndAbstractClassesAndInterfaces.InterfacesExample___1;

public class MobilePhone implements Itelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("mobile phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now Ringing " + phoneNumber + " on mobile phone");
        } else {
            System.out.println("mobile phone is switched off");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("mobilephone is Ringing");
        } else {
            isRinging = false;
            System.out.println("Mobile phone is switched off or number differences");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
