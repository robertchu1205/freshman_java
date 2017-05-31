package perceptron;
import java.io.*;
import java.util.ArrayList;
public class main{
	
			int [][]truthTable;
			public static int [] x;
			public static int Perceptron(int x[],int w[]){ // �P��������		// �B����ơG�p��ثe�v�� w �����p�U�A��������X�Ȭ� 0 �� 1
		    int result = w[0]*x[0]+w[1]*x[1]+w[2]*x[2]; // y=w0*x0+x1*w1+x2*w2=-theta+x1*w1+x2*w2
		    if (result >= 0) // �p�G���G�j��s
		      return 1;      //   �N��X 1
		    else             // �_�h
		      return 0;      //   �N��X 0
		  }
			public static double rate = 0.01; // �ǲ߽վ�t�v�A�]�N�O alpha
		    public static int [] w = { -1, 0, 1 }; 
		    public static int loop=1000;
	/*		public static int training (int tt[]) { // �V�m��� training(truthTable), �䤤 truthTable �O�ؼЯu�Ȫ�
			    for (int i=0; i<loop; i++) { // �̦h�V�m�@�d��
			      int eSum = 0;
			      for (var i=0; i<truthTable.length; i++) { // �C�����u�Ȫ������C�ӿ�J��X�t��A���V�m�@���C
			        int [] x = [ -1, truthTable[i][0], truthTable[i][1] ]; // ��J�G x
			        int yd = truthTable[i][2];       // ���檺��X yd
			        int y = this.step(x, w);  // �ثe����X y
			        var e = yd - y;                  // �t�Z e = ���檺��X yd - �ثe����X y
			        eSum += e*e;                     // �p��t�Z�`�M
			        var dw = [ 0, 0, 0 ];            // �v���վ㪺�T�� dw
			        dw[0] = rate * x[0] * e; w[0] += dw[0]; // w[0] ���վ�T�׬� dw[0]
			        dw[1] = rate * x[1] * e; w[1] += dw[1]; // w[1] ���վ�T�׬� dw[1]
			        dw[2] = rate * x[2] * e; w[2] += dw[2]; // w[2] ���վ�T�׬� dw[2]/;
			        if (loop % 10 == 0)
			          log("%d:x=(%s,%s,%s) w=(%s,%s,%s) y=%s yd=%s e=%s", loop, 
			               x[0].toFixed(3), x[1].toFixed(3), x[2].toFixed(3), 
			               w[0].toFixed(3), w[1].toFixed(3), w[2].toFixed(3), 
			               y.toFixed(3), yd.toFixed(3), e.toFixed(3));
			      }
			      if (Math.abs(eSum) < 0.0001) return w; // ���V�m���G�~�t���p�ɡA�N�����V�m�F�C
			    }
			    return 0; // �_�h�A�N�Ƿ| null �N���V�m���ѡC
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
			           //br.readLine()�O��Ū��txt�ɪ��C�@����,��Ū�쪺��Ʀs��line
			           //�A�Nline�ᵹtempstring�h�x�s
			           tempstring = line;     
			          //�]���ڳo��test�ɪ���Ʈ榡�O-->�@�榳3�Ӧr��A�Ψ��tab�j�}�A
			          //tempstring.split("\t") �|�̷�tab�Ӥ���,��n���T��,�ҥH�o��ڪ�tempArray���j�p�~�|�ŧi3
			             tempArray = tempstring.split("\t");
			             
			             //�o��N�O���Ӷ���,�@��@�檺�x�s��ʺA�}�C�̭�
			              for(i=0;i< tempArray.length;i++)
			              {          
			                  myList.add(tempArray[i]);
			              }
			              for(i=0;i< tempArray.length;i++ ) {
			            	  System.out.println(tempArray[i]);
			              }
		// TODO Auto-generated method stub
		}

	/*	function learn(tableName, truthTable) { // �ǲߥD�{���G��J���ؼЯu�Ȫ� truthTable �P��W�� tableName�C
		  log("================== �ǲ� %s ��� ====================", tableName);
		  var p = new Perceptron();       // �إ߷P��������
		  var w = p.training(truthTable); // �V�m�P����
		  if (w != null)                  // ��ܰV�m���G
		    log("�ǲߦ��\ !");
		  else
		    log("�ǲߥ��� !");
		  log("w=%j", w);
		}

		var andTable = [ [ 0, 0, 0 ], [ 0, 1, 0 ], [ 1, 0, 0 ], [ 1, 1, 1 ] ]; // AND ��ƪ��u�Ȫ�
		var orTable  = [ [ 0, 0, 0 ], [ 0, 1, 1 ], [ 1, 0, 1 ], [ 1, 1, 1 ] ]; // OR  ��ƪ��u�Ȫ�
		var xorTable = [ [ 0, 0, 0 ], [ 0, 1, 1 ], [ 1, 0, 1 ], [ 1, 1, 0 ] ]; // XOR ��ƪ��u�Ȫ�

		learn("and", andTable); // �ǲ� AND ���
		learn("or",  orTable);  // �ǲ� OR  ���
		learn("xor", xorTable); // �ǲ� XOR ���	*/
	}

}