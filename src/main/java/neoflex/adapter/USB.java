package neoflex.adapter;

public class USB implements USBInterface{

    @Override
    public void set() {
        System.out.println("usb подключен");
    }
}
