package pl.softie.course4.interfaceexample;

public class ProductPage implements ContainsUserInfo {

    @Override
    public String getUserName() {
        return "Tester";
    }
}
