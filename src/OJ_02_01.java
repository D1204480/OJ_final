import java.io.*;

public class OJ_02_01 {
    public static void main(String[] args) throws IOException {
        //製作讀取使用者輸入
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        int[] numArray = new int[10];   //10個整數大小的陣列
        int[] countArray = new int[10];   //用於計算次數
        int max=0, findNum=0;
        boolean isCorrect = true;


        //使用者輸入轉為int, 放入陣列
        for (int i=0; i<10; i++) {
            String str = buf.readLine();
            int num = Integer.parseInt(str);
            numArray[i] = num;
        }



        for (int i=0; i < numArray.length; i++) {
            if (numArray[i] < 0 || numArray[i] > 10) {   //每個輸入應為0~9的數字
                isCorrect = false;
            }
        }

        for (int i=0; i < numArray.length; i++) {
            if (numArray.length > 10) {   //輸入大於10個整數, "Out of range"
                isCorrect = false;
            }
        }



        while (isCorrect == true) {
            //以countArray當作計數器,index當作0~9數字, value值當作次數
            for (int i = 0; i < numArray.length; i++) {
                int num = numArray[i];
                countArray[num] = countArray[num] + 1;
            }

            //找出次數最大的數字
            for (int k = 0; k < countArray.length; k++) {
                if (countArray[k] > max) {
                    max = countArray[k];
                }
            }

            //找出最大次數的index, 即為出現最多的數字
            for (int j = 0; j < countArray.length; j++) {
                if (countArray[j] == max) {
                    findNum = j;
                }
            }


            System.out.print(findNum + "," + max);
            break;
        }


        if (isCorrect == false) {
            System.out.print("Out of range");
        }



    }
}