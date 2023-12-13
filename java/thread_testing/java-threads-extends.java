class ThreadExtends extends Thread {
    public ThreadExtends(String name) {
        super(name);
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        System.out.println("Name = " + name);

        try {
            Thread.sleep(1000);
            doStuff(name);
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println();
        }
    }

    private void doStuff(String name) throws InterruptedException {
        Thread.sleep(4000);

        if (name != "java is the best!") { 
            throw new InterruptedException("java is NOT the best?!!");
        } else {
            System.out.println("\n\tOfcourse java is the best!"); 
        }
    }
}
