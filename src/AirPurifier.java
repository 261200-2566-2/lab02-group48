/*
    ข้อ1. give a complete description of AirPurifier class
        -what should be instance variables?
        1.model หน้าที่ บอกชื่อรุ่นของ AirPurifier
        2.serialNo หน้าที่ บอกตัวเลขบน AirPurifier
        3.power หน้าที่ บอกว่าเครื่อง กำลังเปิดหรือปิดอยู่ ณ เวลานั้น
        4.AQI หน้าที่ บอกดัชนีอากาศ ณ เวลานั้นๆ
        -what should be instance methods?
        1.getModel เป็นการดึงข้อมูล model ในConstructors ออกมา
        2.getSerialNo เป็นการดึงข้อมูล serialNo ในConstructors ออกมา
        3.setSpeed เป็นการเซ็ตค่า AQI ลงไป
        4.turnOn บอกว่า ณ ขณะนั้นเครื่องกำลังเปิดอยู่
        5.turnOff บอกว่า ณ ขณะนั้นเครื่องกำลังปิดอยู่
        -what should be class variables?
        1.modelCount
        -what should be class methods?
        1.mostPopularModel
    ข้อ 2.for each method proposed above, how do you plan to implement it?
        -what's needed as inputs?
        1.setSpeed รับ input จาก class lab02 เข้ามา
        -what's to be returned?
        1.getModel เป็นการ return this.model
        2.getSerialNo เป็นการ return this.serialNo
*/
public class AirPurifier {
    String model;
    String serialNo;
    boolean power;
    double AQI;

    AirPurifier(String model, String serialNo) {
        this.model = model;
        this.serialNo = serialNo;
    }

    static int modelCount;
    static String mostPopularModel;
    public String getModel(){
        return this.model;
    }
    public String getSerialNo(){
        return this.serialNo;
    }
    public void setSpeed(double SVIPSpeed){
        if(SVIPSpeed >=0  && SVIPSpeed <=50){
            AQI = SVIPSpeed;
            System.out.println("The AQI "+ AQI+ " is at a good level.");
        }else{
            AQI = SVIPSpeed;
            System.out.println("The AQI "+ AQI + ", bad weather.");
        }
    }
    public void turnOn() {
        System.out.println("AirPurifier is On");
        power = true;
    }
    public void turnOff() {
        System.out.println("AirPurifier is Off");
        power = false;
    }
}
