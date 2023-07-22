package neoflex;

import neoflex.adapter.Computer;
import neoflex.adapter.MemoryCard;
import neoflex.adapter.USB;
import neoflex.adapter.USBAdapter;
import neoflex.factory.CoffeeType;
import neoflex.factory.Factory;
import neoflex.proxy.DatabaseReaderImpl;
import neoflex.proxy.DatabaseReaderProxy;
import neoflex.singleton.MyLogger;

public class Main {
    public static void main(String[] args) {

        /*MyLogger myLogger = MyLogger.getInstance();
        MyLogger myLogger1 = MyLogger.getInstance();
        System.out.println(myLogger1);
        System.out.println(myLogger);

        MyLogger.info(String.class, "additional information");*/

       /* Factory factory = new Factory();
        factory.start(CoffeeType.ESPRESSO);*/

        /*Computer computer = new Computer();
        USB usb = new USB();
        computer.connect(usb);

        MemoryCard memoryCard = new MemoryCard();
        USBAdapter usbAdapter = new USBAdapter(memoryCard);
        Computer computer1 = new Computer();
        computer1.connect(usbAdapter);*/

        /*DatabaseReaderImpl databaseReader = new DatabaseReaderImpl();
        DatabaseReaderProxy databaseReaderProxy = new DatabaseReaderProxy(databaseReader);
        databaseReaderProxy.getURL("Students");
        databaseReaderProxy.getURL("Students");*/
    }
}
