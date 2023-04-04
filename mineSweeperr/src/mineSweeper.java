import java.util.Random;
import java.util.Scanner;

public class mineSweeper {
    int satir;
    int sutun;
    int[][] area;
    int[][] mineHarita;
    int[][] board;
    int size;
    boolean game = true;
    mineSweeper(int satir,int sutun){
        this.satir=satir;
        this.sutun=sutun;
        this.area = new int[satir][sutun];
        this.size= this.satir*this.sutun;
        this.mineHarita = new int[satir][sutun];
        this.board= new int[satir][sutun];
    }
    Random ran = new Random();
    Scanner scan = new Scanner(System.in);

    public void run(){
        int row, col, counter=0;
        randomNum();
        print(area);
        System.out.println("oyun başladı !");

        while (game){
            print(board);
            System.out.print("satır : ");
            row = scan.nextInt();
            System.out.print("sütun : ");
            col = scan.nextInt();
//kordinat kontrol
            if (row<0 || row >= this.satir){
                System.out.println("GEÇERSİZ KORDİNAT!!");
                continue;
            }
            if (col<0 || row >= this.sutun){
                System.out.println("GEÇERSİZ KORDİNAT!!");
                continue;
            }

            if (area[row][col] != -1){
                checkMine(row,col);
                counter++;
                if (counter==(size-this.size/4)){
                    this.game=false;
                    System.out.println("TEBRİKLER TÜM TARLAYI MAYINLARDAN TEMİZLEDİN!");
                    }
            }else {
                System.out.println("game over");
                game=false;
            }

        }
    }

    public void checkMine(int r , int c){
        if (board[r][c]==0){
            for (int i = r-1 ; i <= r+1 ; i++){
                 for (int j = c-1 ; j <= c+1 ; j++){
                     if ( (i < 0 ) || (j<0) || (i>this.satir-1) || (j > this.sutun-1) ) {

                     }else {
                          if (area[i][j]==-1){
                            board[r][c]++;
            }
        }
    }
}
            if (board[r][c]==0){
                board[r][c]=-2;
            }
    }
    }
   public void print(int[][] arr){
        for (int i = 0;i<arr.length;i++){
            for (int j =0;j<arr[0].length;j++){
                if (arr[i][j]>=0){
                    System.out.print(" ");
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
}

    public void randomNum (){
        int randRow, randCol, count=0;
        while (count!=(this.size/4)){
            randRow = ran.nextInt(this.satir);
            randCol = ran.nextInt(this.sutun);
            if (this.area[randRow][randCol] != -1){
                area[randRow][randCol] = -1;
                count++;
            }
        }
    }




//
}

