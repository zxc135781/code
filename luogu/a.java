import java.io.BufferedInputStream;
import java.util.Scanner;

public class  a{
    static int count , first ;//key出现次数和第一次出现的位置
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedInputStream(System.in));

        String key = scan.next().toLowerCase();//获取第一行的单次输入并把它转为小写
        scan.nextLine();
        String str = scan.nextLine().toLowerCase();//获取第二行的文章输入
        String[] strPer = str.split(" ");//把文章切割用空格切分开,每个单词存入strPer数组中

        for (int i = 0; i < strPer.length; i++) {
            if(key.equals(strPer[i]))//如果匹配,count++
                count++;
        }

        if (count == 0) {//如果没有匹配的值,输出-1
            System.out.println(-1);
        } else {
            if (key.equals(str.substring(0, key.length()))) {//如果文章第一个单词就和key相等
                first = 0;
            } else
                first = str.indexOf(" " + key + " ") + 1;//前后添加空格是为了保证该单词都是单独出现的,不是其他单词所包含的.
            //字符串的indexOf(String)方法会返回String第一次出现的位置
            System.out.println(count + " " + first);
        }

    }
}