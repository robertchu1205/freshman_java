package s103502548;

import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class Music {
	
	
	public void playMusic(String path){
		try {
	

		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream((new File(path)));
		   AudioFormat audioFormat = audioInputStream.getFormat();
		   int bufferSize = (int) Math.min(audioInputStream.getFrameLength()* audioFormat.getFrameSize(),Integer.MAX_VALUE); // 緩衝大小，如果音訊檔案不大，可以全部存入緩衝空間。這個數值應該要按照用途來決定
		   DataLine.Info dataLineInfo = new DataLine.Info(Clip.class, audioFormat, bufferSize);
		   Clip clip = (Clip) AudioSystem.getLine(dataLineInfo);
		   clip.open(audioInputStream);
		   clip.start();
		  } catch (Exception ex) {

		  }
		}
		 
}
