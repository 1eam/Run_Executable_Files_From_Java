

package openFfmpeg;

import java.io.BufferedReader;
import java.io.IOException;

public class OpenFfmpeg {

	public static void main(String[] args) throws IOException {
		
		/*If your on windows and press run, kladblok/notepad will open*/
//		Process openNotepad = Runtime.getRuntime().exec("cmd /c notepad");
		
		/*If your on windows, have ffmpeg installed and press run, ffmpeg will run*/
		Process openFFMPEG = Runtime.getRuntime().exec("cmd /c C:\\Users\\Esther PC>ffmpeg");
	}

}
