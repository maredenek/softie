package pl.softie.course4.seleniumtest;

public class TeacherLoginPage extends LoginPage {
    @Override
    public void clickBack() {
        System.out.println("Clicking back on teacher page");
    }

    @Override
    public void fillForm(String someData) {
        System.out.println("Filling form on teacher page");
    }

    @Override
    public void sendForm() {
        System.out.println("Sending form from teacher page");
    }
}
