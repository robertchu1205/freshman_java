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
		   int bufferSize = (int) Math.min(audioInputStream.getFrameLength()* audioFormat.getFrameSize(),Integer.MAX_VALUE); // �w�Ĥj�p�A�p�G���T�ɮפ��j�A�i�H�����s�J�w�ĪŶ��C�o�Ӽƭ����ӭn���ӥγ~�ӨM�w
		   DataLine.Info dataLineInfo = new DataLine.Info(Clip.class, audioFormat, bufferSize);
		   Clip clip = (Clip) AudioSystem.getLine(dataLineInfo);
		   clip.open(audioInputStream);
		   clip.start();
		  } catch (Exception ex) {

		  }
		}
		 
}
