import java.util.Scanner;
public class sanjiaoxing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);

System.out.print("�������кţ�");
int num = input.nextInt();
for(int i=1;i<=num;i++){
	for(int j=1;j<=i;j++){
		System.out.print("*");
	}
	System.out.println();
}
	}

}
