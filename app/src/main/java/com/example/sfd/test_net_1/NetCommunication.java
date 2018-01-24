package com.example.sfd.test_net_1;

import android.util.Log;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.Socket;
import java.net.UnknownHostException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by SFD on 2018/1/10.
 */

public class NetCommunication {

//    public void sendRequestWithOkHttp(){
//        new Thread(new Runnable(){
//            @Override
//            public void run() {
//                try{
//                    OkHttpClient client = new OkHttpClient();
//                    Request request = new Request.Builder()
//                            .url("http://10.0.2.2/get_data.xml")
//                            .build();
////                    .url("http//:www.baidu.com")
//                    Response response = client.newCall(request).execute();
//                    String responseData = response.body().string();
//                    paresXMLwithPull(responseData);
//                }catch (Exception e){
//                    e.printStackTrace();
//                }
//            }
//        }).start();
//    }
//
//    public void paresXMLwithPull(String xmlData){
//        try {
//            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
//            XmlPullParser xmlPullParser = factory.newPullParser();
//            xmlPullParser.setInput(new StringReader(xmlData));
//            int eventType = xmlPullParser.getEventType();
//            String id = "";
//            String name = "";
//            String version = "";
//            while (eventType != XmlPullParser.END_DOCUMENT){
//                String nodeName = xmlPullParser.getName();
//                switch (eventType){
//                    case XmlPullParser.START_TAG:
//                        if("id".equals(nodeName)){
//                            id = xmlPullParser.nextText();
//                        }else if("name".equals(nodeName)){
//                            name = xmlPullParser.nextText();
//                        }else if("version".equals(nodeName)){
//                            version = xmlPullParser.nextText();
//                        }
//                        break;
//                    case XmlPullParser.END_TAG:
//                        if("app".equals(nodeName)){
//                            Log.d("NetComm", "id is" + id);
//                            Log.d("NetComm", "name is" + name);
//                            Log.d("NetComm", "version is" + version);
//                        }
//                        break;
//                    default:
//                        break;
//                }
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//
//    public void connectServerWithTCPSocket(){
//
//        Socket socket;
//
//        try{
//            socket = new Socket("120.27.132.188", 8989);
//            InputStream inputStream = new FileInputStream("e://a.txt");
//            OutputStream outputStream = socket.getOutputStream();
//            byte buffer[] = new byte[4*1024];
//            int temp = 0;
//            while ((temp = inputStream.read(buffer)) !=-1){
//                outputStream.write(buffer, 0, temp);
//            }
//            outputStream.flush();
//        }catch (UnknownHostException e){
//            e.printStackTrace();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
}
