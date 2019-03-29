import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
        /*System.out.print("输入年份：");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if((year%4 ==0 && year%100 != 0) || (year%400 ==0)){
            System.out.println(year + "年是闰年");
        }
        else{
            System.out.println(year + "年不是闰年");
        }*/
//        char t = 65;
//        System.out.println(t);
        //准备两个数字，让用户猜
        String lottery = "" + (int)(Math.random()*10) + (int)(Math.random()*10);
        //用户输入
        System.out.print("请输入猜测的数字：");
        Scanner input = new Scanner(System.in);
        String guess = input.nextLine();
        //切分系统随机准备的数字
        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);
        char guess1 = guess.charAt(0);
        char guess2 = guess.charAt(1);
        //比较用户和彩票
        if(guess.equals(lottery)){
            System.out.println("恭喜你，精准猜中");
        }
        else if(guess1==lotteryDigit1&&guess2==lotteryDigit1){
            System.out.println("恭喜你，中小奖了，顺序不一样");
        }
        else if(guess1 ==lotteryDigit1||guess1==lotteryDigit2||guess2==lotteryDigit2
                ||guess2==lotteryDigit1){
            System.out.println("恭喜你，只猜中了一个");
        }
        else{
            System.out.println("很抱歉，你没有猜中");
        }


    }
}