class threads {

    public static void main(String[] args) {
        // Custom class implements runnable interface first, then a new thread
        // calls that runnable
        Thread badRunnable = new Thread(new RunnableImplement(), "bad runnable");
        Thread goodRunnable = new Thread(new RunnableImplement(), "java is the best!");

        System.out.println("Using runnable interface implementation...");
        badRunnable.start();
        goodRunnable.start();

        // Creates custom class that extends the Thread class
        Thread badThread = new ThreadExtends("bad thread");
        Thread goodThread = new ThreadExtends("java is the best!");

        System.out.println("Using thread class extension...");
        badThread.start();
        goodThread.start();
    }

}
