package neoflex.adapter;

public class Computer {

    public void connect(USBInterface usb){
        usb.set();
        System.out.println("Подключено к компьютеру");
    }
}
