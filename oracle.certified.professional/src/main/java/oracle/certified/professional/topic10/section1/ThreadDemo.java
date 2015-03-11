package oracle.certified.professional.topic10.section1;

/**
 * Demonstrates creating and using the Thread class and the Runnable interface.
 *
 * @author mpanek
 */
public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        final Runnable task = new MyRunnable();

        Thread t1 = new MyThread(); // Note that MyThread's run method will be invoked here!
        Thread t2 = new Thread(task); // Note that MyRunnable's run method will be invoked here!
        Thread t3 = new MyThread(task); // Note that MyThread's run method will be invoked here!

        t1.start(); // Running from: MyThread | Thread[Thread-0,5,main]
        t1.join(); // Waits for this thread to complete. Might throw InterruptedException!

        t2.start(); // Running from: MyRunnable | Thread[Thread-1,5,main]
        t2.join(); // Waits for this thread to complete. Might throw InterruptedException!

        t3.start(); // Running from: MyThread | Thread[Thread-2,5,main]
        t3.join(); // Waits for this thread to complete. Might throw InterruptedException!

        // ---------------------------------------------------------------------------------------------------------------------------------
        // Once a thread has been started, it can never be started again.
        // ---------------------------------------------------------------------------------------------------------------------------------
        // t3.start(); // <-- Throws java.lang.IllegalThreadStateException

        // ---------------------------------------------------------------------------------------------------------------------------------
        // There's nothing special about the run() method as far as Java is concerned.
        // Like main(), it just happens to be the name (and signature) of the method
        // that the new thread knows to invoke. So if you see code that calls the run() method on
        // a Runnable (or even on a Thread instance), that's perfectly legal. But it doesn't mean the
        // run() method will run in a separate thread! Calling a run() method directly just means
        // you're invoking a method from whatever thread is currently executing, and the run()
        // method goes onto the current call stack rather than at the beginning of a new call stack.
        // The following code does not start a new thread of execution:
        // ---------------------------------------------------------------------------------------------------------------------------------
        task.run(); // Legal, but does not start a new thread --> Running from: MyRunnable | Thread[main,5,main]
        t1.run(); // Legal, but does not start a new thread --> Running from: MyThread | Thread[main,5,main]

    }

}
