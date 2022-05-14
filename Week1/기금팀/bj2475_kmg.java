import java.util.Scanner;

public class bj2475_kmg {
    public static void main(String[] args) {        //기곰: 고생하셨습니다 :>
        Scanner sc = new Scanner(System.in); // 성재 : 키보드로 입력을 받는 System.in의 경우에는 문제가 없지만, Scanner(file)으로 파일을 읽어들이는 경우에는 Scanner를 사용한 뒤에 .close()로 스캐너를 닫아주지 않으면 읽어들였던 파일이 손상되는 문제가 발생할 수 있습니다. 따라서 스캐너로 입력을 받고 난 뒤 더이상 사용할 필요가 없을 때에는 .close()로 스캐너를 닫아주는 것이 좋을 것 같습니다.

        int sum = 0;

        for(int i=0; i<5; i++) {
            int input = sc.nextInt();
            sum += input*input;
        }

        System.out.println(sum%10);
    }
}
