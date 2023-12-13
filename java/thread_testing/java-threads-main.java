class threads {

    public static void main(String[] args) {
        Thread badRunnable = new Thread(new RunnableImplement(), "bad one");
        Thread goodRunnable = new Thread(new RunnableImplement(), "java is the best!");

        System.out.println("Using runnable interface extension...");
        badRunnable.start();
        goodRunnable.start();
    }

}
