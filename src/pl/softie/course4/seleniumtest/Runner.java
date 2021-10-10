package pl.softie.course4.seleniumtest;

public class Runner {

    public static void main(String[] args) {
        testScenario(new TeacherLoginPage());
        testScenario(new PupilLoginPage());
    }

    public static void testScenario(LoginPage loginPage) {
        loginPage.fillForm("");
        loginPage.sendForm();
        loginPage.clickBack();
    }

}
