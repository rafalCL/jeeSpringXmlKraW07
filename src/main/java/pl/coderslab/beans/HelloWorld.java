package pl.coderslab.beans;

public class HelloWorld {
    private String message;

    public HelloWorld() {
        this.message = "default message";
    }

    public HelloWorld(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
