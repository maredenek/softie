package pl.softie.course4.interfaceexample;

public class Runner {

    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
        ProductPage productPage = new ProductPage();
        searchBoxTest(loginPage);
        searchBoxTest(homePage);
        checkIfCorrectPersonDataIsVisible(productPage);
        checkIfCorrectPersonDataIsVisible(loginPage);
    }

    public static void searchBoxTest(ContainsSearchBox pageUnderTest) {
        pageUnderTest.searchProduct("Test product");
    }

    public static void checkIfCorrectPersonDataIsVisible(ContainsUserInfo pageWithUserInfo) {
        if (pageWithUserInfo.getUserName().equals("Tester") )
            System.out.println("Test passed");
        else
            System.out.println("Test failed");
    }

}
