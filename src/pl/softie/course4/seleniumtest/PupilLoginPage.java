package pl.softie.course4.seleniumtest;

public class PupilLoginPage extends LoginPage {

    @Override
    public void clickBack() {
        System.out.println("Clicking back on pupil page");
    }

    @Override
    public void fillForm(String someData) {
        System.out.println("Filling form on pupil page");
    }

    @Override
    public void sendForm() {
        System.out.println("Sending form from pupil page");
    }

    @Override
    public void doSomethingElse() {

    }
}
