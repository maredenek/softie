package pl.softie.course4.interfaceexample;

public class HomePage implements ContainsSearchBox {

    public void followOnFacebook(String email) {
        System.out.println("Followed");
    }

    @Override
    public void searchProduct(String lookUpName) {
        System.out.println("Searching for '" + lookUpName + "' on Home page");
    }
}
