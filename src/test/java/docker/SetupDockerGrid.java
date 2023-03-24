package docker;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SetupDockerGrid {

	@BeforeTest
	void startDockerGrid() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start start_dockergrid.bat");
		Thread.sleep(15000);
	}

	@AfterTest
	void stopDockerGrid() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start stop_dockergrid.bat");
		Thread.sleep(5000);

		// Close Command Prompt
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
	}
}
