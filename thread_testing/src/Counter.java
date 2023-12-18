class Counter implements Runnable {

    private int count;

    Counter(int count) {
        this.count = count;
    }

    public void run() {
        System.out.println("\nName: " + Thread.currentThread().getName());

        for (int i = 0; i < count; i++) {
            System.out.println("\tcount " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) { 
                e.printStackTrace(); 
            }
        }
    }

}
