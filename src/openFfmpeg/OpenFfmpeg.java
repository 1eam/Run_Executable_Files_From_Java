//If your on windows and press run, kladblok/notepad will open

package openFfmpeg;

import java.io.BufferedReader;
import java.io.IOException;

public class OpenFfmpeg {

	public static void main(String[] args) throws IOException {
		Process open = Runtime.getRuntime().exec("cmd /c notepad");

	}

}
