public class Normal extends Customer{

    public Normal(){
    }

    @Override
    public String toString() {
        return String.format("%s %s", super.toString(), "");
    }
}
