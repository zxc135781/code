import java.util.Scanner;

public class P1149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a=new int[2001];
        int b=0,s=0,i=0,j=0;
        int[] c={6,2,5,5,4,5,6,3,7,6};
        b = sc.nextInt();
        a[0] = 6;
        for(i=1;i<=2000;i++)
        {
            j=i;
            while(j>=1)//求每个数所用的火柴棒
            {
                a[i]=a[i]+c[j%10];
                j=j/10;
            }
        }
        for(i=0;i<=1000;i++)
        {
            for(j=0;j<=1000;j++)
                if(a[i]+a[j]+a[i+j]+4==b)s++;//还有加号与等号
        }
        System.out.println(s);
    }
}
