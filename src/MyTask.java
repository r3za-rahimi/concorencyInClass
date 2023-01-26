import java.util.concurrent.Callable;

public class MyTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        return ";skjhfkjsd";
    }
//    @Override
//    public void run() {
//
//        try {
//            Thread.sleep(4000L);
//            System.out.println("from my task");
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//
//    }



}
