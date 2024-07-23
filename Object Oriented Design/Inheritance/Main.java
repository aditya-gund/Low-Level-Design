public class Main {
    public static void main(String[] args) {
        //Basic Mobile object
        Mobile samasungGuru = new Mobile("samsung", "Guru");
        samasungGuru.powerOn();
        samasungGuru.doCalling("7520304050");
        // Smartphone object
        smartPhone samsungGalaxy = new smartPhone("samsung", "Galaxy");
        samsungGalaxy.powerOn();
        samsungGalaxy.cameraOn();
        samsungGalaxy.doCalling("9020304050");
    }
}
