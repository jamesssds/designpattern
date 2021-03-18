package com.design.pattern.creational.factorymethod;

public abstract class VideoFactory {

    public abstract Video getVideo();


//    //通过反射获取对象
//    public Video getVideo(Class c){
//        Video video = null;
//        try {
//            video = (Video)Class.forName(c.getName()).newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return video;
//    }


//    public Video getVideo(String type){
//        if("java".equalsIgnoreCase(type)){
//            return new JavaVideo();
//        }else if ("python".equalsIgnoreCase(type)){
//            return new PythonVideo();
//        }
//        return null;
//    }
}
