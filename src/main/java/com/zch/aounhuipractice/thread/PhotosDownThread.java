package com.zch.aounhuipractice.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

//开启多线程，同时下载图片
public class PhotosDownThread extends Thread{
    private String url;
    private String name;
    PhotosDownThread(String url, String name){
        this.url = url;
        this.name = name;
    }
    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downLoader(url, name);
        System.out.println("下载文件"+name);
    }
    public static void main(String args[]){
        //创建三个线程对象
        PhotosDownThread thread1 = new PhotosDownThread("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2058117193,530888075&fm=26&gp=0.jpg","photo1.jpg");
        PhotosDownThread thread2 = new PhotosDownThread("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2058117193,530888075&fm=26&gp=0.jpg","photo2.jpg");
        PhotosDownThread thread3 = new PhotosDownThread("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2058117193,530888075&fm=26&gp=0.jpg","photo3.jpg");
        //三个线程
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
class WebDownloader{
    public void downLoader(String url, String name){
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
