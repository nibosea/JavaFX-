/**
 * Sample Skeleton for 'Untitled' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.io.IOException;

public class StartSceneController {

	@FXML // ResourceBundle that was given to the FXMLLoader
		private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
		private URL location;

	@FXML
		void openIntroduction(ActionEvent event) {

			try {

				//ブラウザを起動し、必要な URL を渡す

				String browserName = "google-chrome";

				String url = "Introduction.html";

				Runtime.getRuntime().exec(new String[ ] {browserName, url});
			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}


	@FXML // This method is called by the FXMLLoader when initialization is complete
		void initialize() {

		}
}

