class RunnableImplement implements Runnable {

    @Override
    public void run() {

        String threadName = Thread.currentThread().getName();

        System.out.println("\tName = " + threadName);

        try {
            Thread.sleep(1000);
            doStuff(threadName);
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println();
        }
    }
    
    private void doStuff(String threadName) throws InterruptedException {
       Thread.sleep(4000);

       if (threadName != "java is the best!") { 
           throw new InterruptedException("java is NOT the best?!!");
       } else {
           System.out.println("\n\tOfcourse java is the best!"); 
        }
    }

}
