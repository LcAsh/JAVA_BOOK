package BOOK_11;

import java.io.File;
import java.io.IOException;

public class File_demo1 {
    public static void main(String[] args) throws IOException {
        //需求：将D:/WorkSpace/test/1.txt封装成File对象
        //方式一：根据字符串形式的路径获取File对象
        File file1 = new File("D:/WorkSpace/test/1.txt");
        System.out.println("file1:"+file1);


        //方式二：根据字符串形式的父目录以及子目录创建File对象
        File file2 = new File("D:/WorkSpace/test/","1.txt");
        System.out.println("file2:"+file2);

        //方式三：根据父目录对象，以及字符串形式的子目录来获取File对象
        File file3=new File("D:/WorkSpace/");
        File file4=new File(file3,"test");
        File file5=new File(file4,"1.txt");
        System.out.println("file5:"+file5);

        System.out.println("--------------------------------");

        //需求：在D:/WorkSpace/test创建2.txt
        //如果不存在，就创建，返回true
        //如果不存在，就不创建，返回false
        File file6 = new File("D:/WorkSpace/test/2.txt");
        boolean flag1 = file6.createNewFile();
        System.out.println("flag1:"+flag1);

        //需求2：在D:/WorkSpace/test下创建a文件夹
        File file7 = new File("D:/WorkSpace/test/a");
        boolean flag2 = file7.mkdir();//只能创建单级目录（即一次只能创建一个新的目录）
        System.out.println("flag2"+flag2);

        //需求：在D:/WorkSpace/test创建c/d/f文件夹
        File file8 = new File("D:/WorkSpace/test/c/d/f");
        boolean flag3 = file8.mkdirs();//可创建单级目录，也可以创建多级目录（最常用的方法）
        System.out.println("flag3"+flag3);

        System.out.println("--------------------------------");
        System.out.println("测试判断功能");


        File file9 = new File("D:/WorkSpace/test/a");//file9即为“”中的路径的对象
                //每次测试都要boolean，比较繁琐，一般不用
        /*boolean flag4 = file9.isDirectory();
        System.out.println("测试file9是否是文件夹："+flag4);*/

        System.out.println("测试file9是否是文件夹："+file9.isDirectory());
        System.out.println("测试file9是否是文件:"+file9.isFile());
        System.out.println("测试file9是否存在："+file9.exists());

    }
}
