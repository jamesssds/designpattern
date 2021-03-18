package com.design.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalTest01 {

    static ExecutorService executorService = Executors.newFixedThreadPool(10);
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){

            final int finalI = i;
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    String date = new ThreadLocalTest01().date(finalI);
                    System.out.println(date);
                }
            });
        }
        executorService.shutdown();
    }
    private String date(int seconds){
        Date date = new Date(1000 * seconds);
        SimpleDateFormat simpleDateFormat = ThreadLocalSafe.threadLocal.get();
        return simpleDateFormat.format(date);
    }
}
class ThreadLocalSafe{
    public static ThreadLocal<SimpleDateFormat> threadLocal = new ThreadLocal<SimpleDateFormat>(){
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        }
    };
}




