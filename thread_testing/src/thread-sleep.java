class ThreadSleep {
    public static void main(String args[]) throws InterruptedException {
        long start = System.currentTimeMillis();

        Thread.sleep(3000);

        System.out.println("Thread slept for " + (System.currentTimeMillis() - start));
    }
}
