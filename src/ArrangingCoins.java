import java.util.*;

class Solution
{
    public void arrange(int n)
    {
        int solution=0,sum=0,i=0;
        while(sum<=n)
        {
            i++;
            sum+=i;
        }
        if(sum>i)
        {
            System.out.println(i-1);
        }
        else
        {
            System.out.println(i);
        }
    }
}

class ArrangingCoins
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Solution solution =new Solution();
        solution.arrange(n);
    }
}
