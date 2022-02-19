package com.yangmao.thread;

public class Client {
    public static void main(String[] args) {
        DownloadThread dt1 = new DownloadThread("http://pic39.nipic.com/20140321/18063302_210604412116_2.jpg", "1.jpg");
        DownloadThread dt2 = new DownloadThread("http://pic68.nipic.com/file/20150601/8164280_104301508000_2.jpg", "2.jpg");
        DownloadThread dt3 = new DownloadThread("http://pic16.nipic.com/20111006/6239936_092702973000_2.jpg", "3.jpg");

        new Thread(dt1).start();
        new Thread(dt2).start();
        new Thread(dt3).start();
    }
}
