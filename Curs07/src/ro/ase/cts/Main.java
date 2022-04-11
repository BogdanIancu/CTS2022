package ro.ase.cts;

import ro.ase.cts.composite.AbstractEmployee;
import ro.ase.cts.composite.CallCenterManager;
import ro.ase.cts.composite.CallCenterOperator;
import ro.ase.cts.facade.CarFacade;
import ro.ase.cts.proxy.WebAddress;
import ro.ase.cts.proxy.WebSite;
import ro.ase.cts.proxy.WebSiteProxy;

public class Main {

    public static void main(String[] args) {
        CarFacade car = new CarFacade();
        car.pressAlarmButton();
        car.accelerate();

        WebAddress webAddress = new WebSite();
        webAddress.navigate("http://google.com");

        webAddress = new WebSiteProxy(new WebSite());
        webAddress.navigate("http://utorrent.com");

        AbstractEmployee operator1 = new CallCenterOperator();
        AbstractEmployee operator2 = new CallCenterOperator();
        AbstractEmployee manager = new CallCenterManager();
        manager.addEmployee(operator1);
        manager.addEmployee(operator2);

        AbstractEmployee ceo = new CallCenterManager();
        ceo.addEmployee(manager);

        System.out.println(operator1.getSalary());
        System.out.println(ceo.getSalary());
    }
}
