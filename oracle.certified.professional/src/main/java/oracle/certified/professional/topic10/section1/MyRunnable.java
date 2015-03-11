package oracle.certified.professional.topic10.section1;

/**
 * Sample implementation of {@code Runnable} interface.
 * 
 * @author mpanek
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Running from: " + getClass().getSimpleName() + " | " + Thread.currentThread());
    }

}
