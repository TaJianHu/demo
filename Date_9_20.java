import java.util.Scanner;
//����
public class Date_9_20 {
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		System.out.println("���������");
		int year = in.nextInt();
		System.out.println("�������·�");
		int month = in.nextInt();
		int sum = 0;//������
		//�ж�1900��1��1�յ�������ݵ������·ݵ�1��һ���м���
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
		sum+=1;//�������һ���µ�1������
		int weekday = sum%7;
		//System.out.println(sum%7); //������7ȡģ���ĳ�������������һ�������ڼ�
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
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
