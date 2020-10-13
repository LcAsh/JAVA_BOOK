package BOOK_03;

public class SwitchTest {
    //判断输入的第一个命令行参数的首字符是否是数字字母
    public static void main(String[] args) {
        char ch = args[0].charAt(0);
        //命令行输入的第一个字母
        switch (ch){
            //数字
            case '0': case '1': case '2': case '3':
            case '4': case '5': case '6': case '7':
            case '8': case '9':
                System.out.println("The charater is digit "+ ch);
                break;
            //小写字母
            case 'a': case 'b': case 'c': case 'd':
            case 'e': case 'f': case 'g': case 'h':
            case 'i': case 'j': case 'k': case 'l':
            case 'm': case 'n': case 'o': case 'p':
            case 'q': case 'r': case 's': case 't':
            case 'u': case 'v': case 'w': case 'x':
            case 'y': case 'z':
                System.out.println("The char is lowercase letter "+ ch);
                break;
            //大写字母
            case 'A': case 'B': case 'C': case 'D':
            case 'E': case 'F': case 'G': case 'H':
            case 'I': case 'J': case 'K': case 'L':
            case 'M': case 'N': case 'O': case 'P':
            case 'Q': case 'R': case 'S': case 'T':
            case 'U': case 'V': case 'W': case 'X':
            case 'Y': case 'Z':
                System.out.println("The char is uppercase letter " + ch);
                break;
            //都不是
            default:
                System.out.println("The charater "+ ch + "is neither a digit nor a letter ");
        }
    }
}
