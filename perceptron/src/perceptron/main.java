package perceptron;
import java.io.*;
import java.util.ArrayList;
public class main{
	
			int [][]truthTable;
			public static int [] x;
			public static int Perceptron(int x[],int w[]){ // 感知器物件		// 步階函數：計算目前權重 w 的情況下，網路的輸出值為 0 或 1
		    int result = w[0]*x[0]+w[1]*x[1]+w[2]*x[2]; // y=w0*x0+x1*w1+x2*w2=-theta+x1*w1+x2*w2
		    if (result >= 0) // 如果結果大於零
		      return 1;      //   就輸出 1
		    else             // 否則
		      return 0;      //   就輸出 0
		  }
			public static double rate = 0.01; // 學習調整速率，也就是 alpha
		    public static int [] w = { -1, 0, 1 }; 
		    public static int loop=1000;
	/*		public static int training (int tt[]) { // 訓練函數 training(truthTable), 其中 truthTable 是目標真值表
			    for (int i=0; i<loop; i++) { // 最多訓練一千輪
			      int eSum = 0;
			      for (var i=0; i<truthTable.length; i++) { // 每輪對於真值表中的每個輸入輸出配對，都訓練一次。
			        int [] x = [ -1, truthTable[i][0], truthTable[i][1] ]; // 輸入： x
			        int yd = truthTable[i][2];       // 期望的輸出 yd
			        int y = this.step(x, w);  // 目前的輸出 y
			        var e = yd - y;                  // 差距 e = 期望的輸出 yd - 目前的輸出 y
			        eSum += e*e;                     // 計算差距總和
			        var dw = [ 0, 0, 0 ];            // 權重調整的幅度 dw
			        dw[0] = rate * x[0] * e; w[0] += dw[0]; // w[0] 的調整幅度為 dw[0]
			        dw[1] = rate * x[1] * e; w[1] += dw[1]; // w[1] 的調整幅度為 dw[1]
			        dw[2] = rate * x[2] * e; w[2] += dw[2]; // w[2] 的調整幅度為 dw[2]/;
			        if (loop % 10 == 0)
			          log("%d:x=(%s,%s,%s) w=(%s,%s,%s) y=%s yd=%s e=%s", loop, 
			               x[0].toFixed(3), x[1].toFixed(3), x[2].toFixed(3), 
			               w[0].toFixed(3), w[1].toFixed(3), w[2].toFixed(3), 
			               y.toFixed(3), yd.toFixed(3), e.toFixed(3));
			      }
			      if (Math.abs(eSum) < 0.0001) return w; // 當訓練結果誤差夠小時，就完成訓練了。
			    }
			    return 0; // 否則，就傳會 null 代表訓練失敗。
			  }	*/
			public static void main(String[] argv) throws IOException {
				FileReader frPer1 =new FileReader("src/basic/perceptron1.txt");
				FileReader frPer2 =new FileReader("src/basic/perceptron2.txt");
				FileReader frPer3 =new FileReader("src/basic/perceptron3.txt");
				FileReader frCc =new FileReader("src/basic/2Ccircle1.txt");
				FileReader frC1 =new FileReader("src/basic/2Circle1.txt");
				FileReader frC2 =new FileReader("src/basic/2Circle2.txt");
				FileReader frClose1 =new FileReader("src/basic/2CloseS.txt");
				FileReader frClose2 =new FileReader("src/basic/2CloseS2.txt");
				FileReader frClose3 =new FileReader("src/basic/2CloseS3.txt");
				FileReader frCring =new FileReader("src/basic/2cring.txt");
				FileReader frHc =new FileReader("src/basic/2Hcircle1.txt");
				FileReader frCs =new FileReader("src/basic/2CS.txt");
				FileReader frRing =new FileReader("src/basic/2ring.txt");
				BufferedReader brPer1 = new BufferedReader(frPer1);
				BufferedReader brPer2 = new BufferedReader(frPer2);
				BufferedReader brPer3 = new BufferedReader(frPer3);
				BufferedReader brCc = new BufferedReader(frCc);
				BufferedReader brC1 = new BufferedReader(frC1);
				BufferedReader brC2 = new BufferedReader(frC2);
				BufferedReader brClose1 = new BufferedReader(frClose1);
				BufferedReader brClose2 = new BufferedReader(frClose2);
				BufferedReader brClose3 = new BufferedReader(frClose3);
				BufferedReader brCring = new BufferedReader(frCring);
				BufferedReader brHc = new BufferedReader(frHc);
				BufferedReader brCs = new BufferedReader(frCs);
				BufferedReader brRing = new BufferedReader(frRing);
				String line,tempstring; 
			     String[] tempArray= new String[3];
			     ArrayList myList = new ArrayList();
			        int i=0;
			        while((line = brPer1.readLine())!=null)
			        {
			           //br.readLine()是指讀取txt檔的每一行資料,把讀到的資料存到line
			           //再將line丟給tempstring去儲存
			           tempstring = line;     
			          //因為我這個test檔的資料格式是-->一行有3個字串，用兩個tab隔開，
			          //tempstring.split("\t") 會依照tab來切割,剛好切三個,所以這邊我的tempArray的大小才會宣告3
			             tempArray = tempstring.split("\t");
			             
			             //這邊就是按照順序,一行一行的儲存到動態陣列裡面
			              for(i=0;i< tempArray.length;i++)
			              {          
			                  myList.add(tempArray[i]);
			              }
			              for(i=0;i< tempArray.length;i++ ) {
			            	  System.out.println(tempArray[i]);
			              }
		// TODO Auto-generated method stub
		}

	/*	function learn(tableName, truthTable) { // 學習主程式：輸入為目標真值表 truthTable 與其名稱 tableName。
		  log("================== 學習 %s 函數 ====================", tableName);
		  var p = new Perceptron();       // 建立感知器物件
		  var w = p.training(truthTable); // 訓練感知器
		  if (w != null)                  // 顯示訓練結果
		    log("學習成功 !");
		  else
		    log("學習失敗 !");
		  log("w=%j", w);
		}

		var andTable = [ [ 0, 0, 0 ], [ 0, 1, 0 ], [ 1, 0, 0 ], [ 1, 1, 1 ] ]; // AND 函數的真值表
		var orTable  = [ [ 0, 0, 0 ], [ 0, 1, 1 ], [ 1, 0, 1 ], [ 1, 1, 1 ] ]; // OR  函數的真值表
		var xorTable = [ [ 0, 0, 0 ], [ 0, 1, 1 ], [ 1, 0, 1 ], [ 1, 1, 0 ] ]; // XOR 函數的真值表

		learn("and", andTable); // 學習 AND 函數
		learn("or",  orTable);  // 學習 OR  函數
		learn("xor", xorTable); // 學習 XOR 函數	*/
	}

}
