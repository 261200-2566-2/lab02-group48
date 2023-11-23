public class lab02 {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------");

        System.out.println("ณ ห้องเรียน 516");
        AirPurifier f1 = new AirPurifier("Huawei Air lnw800", "650610800");
        System.out.println("Model :"+f1.getModel());
        System.out.println("No    :"+f1.getSerialNo());
        f1.setSpeed(25.00);
        f1.turnOff();

        System.out.println("------------------------------------------------------------------------");
        System.out.println("ณ ห้องเรียน RB5209");
        AirPurifier f2 = new AirPurifier("Huawei Air lnw808", "650610808");
        System.out.println("Model :"+f2.getModel());
        System.out.println("No    :"+f2.getSerialNo());
        f2.setSpeed(70.0);
        f2.turnOn();
        System.out.println("------------------------------------------------------------------------");
    }
}
