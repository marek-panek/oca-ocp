package oracle.certified.professional.topic10.section1;

/**
 * Demonstrates implementing a thread by extending a {@code Thread} class.
 *
 * @author mpanek
 *
 */
public class MyThread extends Thread {

    public MyThread() {

    }

    public MyThread(final Runnable target) {
        super(target);
    }

    @Override
    public void run() {
        System.out.println("Running from: " + getClass().getSimpleName() + " | " + Thread.currentThread());
    }

}
