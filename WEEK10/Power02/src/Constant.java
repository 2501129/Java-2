public interface Constant {
    String path = ".\\\\data\\\\";
    String fileName = "customer.dat";

    int basic = 1660;
    float[] table = {184.1f, 223.8f, 278.3f, 353.6f, 466.4f, 643.9f};
    int[] limits = {100, 100, 100, 100, 100,  Integer.MAX_VALUE};
    float rate = 7.0f / 100;

    default void error(String message) {
        System.err.println("ERROR : " + message);
        System.exit(-1);
    }
}
