package pl.softie.course4.interfaceexample;

public class LoginPage implements ContainsSearchBox, ContainsUserInfo {

    public void logIn(String userName, String password) {
        System.out.println("Logging...");
    }

    @Override
    public void searchProduct(String lookUpName) {
        System.out.println("Searching for '" + lookUpName + "' on Login page");
    }

    @Override
    public String getUserName() {
        return "Tester";
    }
}
