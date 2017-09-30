import java.util.Scanner;
//日历
public class Date_9_20 {
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入年份");
		int year = in.nextInt();
		System.out.println("请输入月份");
		int month = in.nextInt();
		int sum = 0;//总天数
		//判断1900年1月1日到输入年份的输入月份的1号一共有几天
		for(int i = 1900;i<year;i++){
			if((i%4==0&&i%100!=0) ||i%400 ==0){
				sum+=366;
			}else{
				sum+=365;
			}
		}
		int mon_num = 0;
		for(int i=1;i<month;i++){
			if(i==2){
				if((year%4==0&&year%100!=0) ||year%400 ==0){
		
					sum+=29;
				}else{
			
					sum+=28;
				}
			}else if(i ==4 ||i==6||i==9||i==11){
	
				sum+=30;
			}else{
	
				sum+=31;
			}
			
		}
		sum+=1;//加上最后一个月的1号那天
		int weekday = sum%7;
		//System.out.println(sum%7); //总数与7取模，的出来的数就是这一天是星期几
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		for(int i = 0;i<weekday;i++){
			System.out.print("\t");
		}
		if(month==2){
			if((year%4==0&&year%100!=0) ||year%400 ==0){
				mon_num = 29;
		
			}else{
				mon_num = 28;
	
			}
		}else if(month ==4 ||month==6||month==9||month==11){
			mon_num = 30;

		}else{
			mon_num = 31;
	
		}
		for(int i = 1;i<=mon_num;i++){
			if(sum%7==6){
				System.out.println(i);
			}else{
				System.out.print(i+"\t");
			}
			sum++;
		}
	}
}
