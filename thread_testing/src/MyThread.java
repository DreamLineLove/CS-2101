class MyThread extends Thread {

    private String message;

    MyThread(String name, String message) {
        super(name);
        this.message = message;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        System.out.println("Name: " + name + "\nMessage: \"" + message + "\"");
    }

}
