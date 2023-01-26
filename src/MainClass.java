import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MainClass {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

//        Thread t1 = new Thread(new MyTask());
//        t1.start();


        ExecutorService executorService = Executors.newFixedThreadPool(10) ;
        Future<String> future =  executorService.submit(new MyTask());


        List<Callable<String>> list = new ArrayList<>();


        List<Future<String>> fs = executorService.invokeAll(list);
        list.add(new MyTask());
        list.add(new MyTask());

        for (Future<String> f : fs){

            System.out.println(f.get());
        }


//        executorService.submit(new Runnable() { // anonymous class
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(4000L);
//                    System.out.println("from my task");
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        });
        System.out.println("from main");
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.NANOSECONDS);

//        executorService.invokeAll();
//        executorService.invokeAny();


        // TODO: 1/23/2023

//        یک ارایه بزرگ با یک ترد پول و تقیسم ان

    }




}
