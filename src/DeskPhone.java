public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;


    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("no action taken, desk phone does not have a power button");

    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("now ringing " + phoneNumber + "on deskphone");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("answering the desk phone");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber ) {
            isRinging = true;
            System.out.println("Melody ring");
        } else {
            isRinging=false;
            System.out.println("mobile phone not on or number");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
