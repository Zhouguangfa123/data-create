package com.data.create.file;

import javax.print.DocFlavor;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

/**
 * @author zhougf
 * @desc
 * @date 2023/01/13 15:51
 */
public class FileTest {
    public static void main(String[] args) throws Exception {
        String downUrl = "http://lippi-space-zjk.oss-cn-zhangjiakou.aliyuncs.com/yundisk0/iAEHAqRmaWxlA6h5dW5kaXNrMATOIT59fgXNFKcGzUFCB85jwBQuCM0CZg.file?Expires=1673598624&OSSAccessKeyId=LTAIjmWpzHta71rc&Signature=Wx8QrCkhFEhGrxnMTruPiHVNBHg%3D";

        URL urlfile = new URL(downUrl);
        HttpURLConnection  httpUrl = (HttpURLConnection) urlfile.openConnection();
        httpUrl.setRequestProperty("User-Agent", "Mozilla/4.76");
        httpUrl.connect();
        BufferedInputStream bis = new BufferedInputStream(httpUrl.getInputStream());
        System.out.println(bis);
    }


}
