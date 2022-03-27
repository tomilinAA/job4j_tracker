package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {

        Error error = new Error();
        error.printInfo();
        Error error1 = new Error(true, 5, "Hello");
        error1.printInfo();
        Error error2 = new Error(false, 12, "What's up?");
        error2.printInfo();
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }
}
