import java.util.Scanner;
public class asm1 {
    public static void main(String[] args) {
      // khai báo biến
      Scanner sc = new Scanner(System.in);
      String inputNext = "";
      int bestGame = 1;
      int totalPlay= 0;
      int totalGuess=0;
      int Guess= 0;
      int savePoint = 101; 
    //Vòng lặp Thực hiện chọn Yes/ No  
      do{totalPlay++; // tăng số lần chơi
         System.out.println("Chào mừng đến trò chơi luckNumber");
         System.out.println("Số may mắn của bạn từ 0 đến 100.");
         double random = Math.random()*100;   
         int luckNumber = (int) random; // Tạo ra số luckNumber
         System.out.println("Số may mắn là: "+luckNumber);
         int answer = 0; 
         Guess= 0; // reset số lần chơi sao khi hoàn thành
         do{// Vòng lặp khi chọn số luckNumber
            Guess++;// tăng số lần đoán
            totalGuess++;// tăng tổng số lần đoán
            System.out.print("Mời bạn đoán số: ");
            answer = sc.nextInt();
            if(answer>luckNumber){
               System.out.println("Số của bạn lớn hơn số luckyNumber");
            }
            if(answer<luckNumber){
               System.out.println("Số của bạn nhỏ hơn số luckyNumber");
            }
            if(answer==luckNumber){
               System.out.println("Bạn đã đoán đúng");
               System.out.println("bạn đã đoán đúng sau "+ Guess+" lần đoán.");
            }
         }while(answer!=luckNumber);
         // để gán gt trị cho best game
         if(savePoint>Guess){
         savePoint=Guess;
         bestGame = totalPlay;
        }
         System.out.println("Bạn có muốn chơi tiếp không(Y/N):");
         inputNext = sc.next();
      }while(inputNext.equals("Y")||inputNext.equals("yes")||inputNext.equals("YES")||
             inputNext.equals("y")||inputNext.equals("Yes"));
      // in ra bảng kết quả
      double effective = ((double)totalGuess)/((double)totalPlay);
      System.out.println("-------------------------------------");
      System.out.println("Tổng kết Game");
      System.out.println("Số lần chơi: "+totalPlay);
      System.out.println("Tổng Số lần bạn đoán là: " +totalGuess);
      System.out.println("Đoán/chơi: "+ effective);
      System.out.println("Game tốt nhất là só:" +bestGame);
      System.out.println("-------------------------------------");
    }
}
