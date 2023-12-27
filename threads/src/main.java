class Main {

    public static void main(String[] args) {

        Thread myThread = new Thread(new Runner("I love you"), "Runner 1");
        myThread.start();
        try { myThread.join(); } catch(InterruptedException e) { e.printStackTrace(); }

        MyThread myThread2 = new MyThread("Runner 2", "I love you too!");
        myThread2.start();

        Counter counter = new Counter(3);
        Thread myThread3 = new Thread(counter, "Not a runner, I'm a counter");
        myThread3.start();

    }

}
