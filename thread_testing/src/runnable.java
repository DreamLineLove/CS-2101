class Runner implements Runnable {

    private String message;

    Runner(String message) {
        this.message = message;
    }

    public void run() {
        String name = Thread.currentThread().getName();

        System.out.println("Name: " + name + "\nMessage: \"" + message + "\"");
    }

}
