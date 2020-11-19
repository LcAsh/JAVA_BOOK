package BOOK_13;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//服务端程序，用来监听客户端应用程序建立连接的请求，并在连接建立后向客户端发送信息
public class SimpleServer {
    public static void main(String[] args) {
        Thread tNet =  new Thread(new Runnable(){
        public void run() {

            ServerSocket s = null;
            Socket s1;
            String sendString = "Hello Net World!";
            int slength = sendString.length();
            OutputStream slout;
            DataOutputStream dos;

            //通过5432端口建立连接
            try {
                s = new ServerSocket(5433);
            } catch (IOException e) {
                System.out.println("Create ServerScoket Error!");
            }

            //循环运行监听程序，以监视连接请求
            int i = 0;
            while (true) {
                try {
                    System.out.println("Server Star......");
                    //监听端口请求，等待连接
                    s1 = s.accept();
                    //得到与socket相连接的数据流对象
                    slout = s1.getOutputStream();
                    dos = new DataOutputStream(slout);

                    //发送字符串
                    dos.writeUTF(sendString + "i:" + i++);

                    //关闭数据流（但不是关闭socket连接）
                    dos.close();
                    slout.close();
                    s1.close();
                } catch (IOException e) { }
            }
        }
        });
        tNet.start();//服务器监听启动
    }
}



