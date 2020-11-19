package BOOK_13;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
//客户端
public class SimpleClient {
    public static void main(String[] args) throws IOException {
        Thread tCent = new Thread(new Runnable() {
            @Override
            public void run() {
                int c;
                Socket s1 = null;
                InputStream s1In = null;
                DataInputStream dis;

                //在端口5432打开连接
                try {
                    s1=new Socket("127.0.0.1",5433);
                } catch (IOException e) {
                    e.printStackTrace();
                }


                //获取Socket端口的输入句柄，并从中读取数据
                try {
                    s1In=s1.getInputStream();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                dis=new DataInputStream(s1In);

                String st= null;
                try {
                    st = new String(dis.readUTF());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(st);

                //操作结束，关闭数据流及Socket连接
                try {
                    dis.close();
                    s1In.close();
                    s1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        tCent.start();
    }
}
