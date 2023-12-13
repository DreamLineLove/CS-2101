package threadTesting;

class RunnableImplement implements Runnable {

    @Override
    public void run() {
        Thread.sleep(1000);

        String threadName = Thread.currentThread().getName();

        System.out.println("Name = " + threadName);

        try {
            doStuff();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    private void doStuff(String threadName) throws InterruptedException {
       Thread.sleep(4000);

       if (threadName != "java is the best") { 
           throw new InterruptedException("Java is NOT the best?!");
       }
    }

}
