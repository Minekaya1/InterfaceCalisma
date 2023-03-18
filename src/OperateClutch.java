public class OperateClutch implements ITelephone {
    private boolean clutchIsIn;

    public OperateClutch(boolean inOrOut){
        this.clutchIsIn=inOrOut;
    }

    @Override
    public void powerOn() {
        if (clutchIsIn) {
            System.out.println(" time is not long ");
        }else {
            System.out.println(" time is long ");
        }

    }

    @Override
    public void dial(int phoneNumber) {

    }

    @Override
    public void answer() {
        System.out.println("gereken sure ");

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        return false;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
