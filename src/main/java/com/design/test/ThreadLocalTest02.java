package com.design.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalTest02 {
    static ExecutorService executorService = Executors.newFixedThreadPool(10);
    public static void main(String[] args) {
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                User user = new User();
                user.setName("曾与");
                ThreadLocalHolder.threadLocal.set(user);
                new Service1().process();
            }
        });
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                User user = new User();
                user.setName("大傻逼");
                ThreadLocalHolder.threadLocal.set(user);
                new Service1().process();
            }
        });

    }

}
class Service1{
    public void process(){
        User user = ThreadLocalHolder.threadLocal.get();
        System.out.println("Service1获取:"+user.getName());
        new Service2().process();
    }
}
class Service2{
    public void process(){
        User user = ThreadLocalHolder.threadLocal.get();
        System.out.println("Service2获取:"+user.getName());
    }
}

class ThreadLocalHolder{
    public static ThreadLocal<User> threadLocal = new ThreadLocal();
}

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
class User{
    String name;
}
