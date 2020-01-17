import java.io.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
	public static Stage stage;

	@Override
		public void start(Stage stage) throws Exception {
			//スタート画面の表示
			Main.stage = stage;
			changeView("StartScene.fxml");
			Main.stage.show();
		}

	public static void main(String[] args){
		launch(args);
	}

	public void changeView(String fxml){
		FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
		try{
			stage.setScene(new Scene(loader.load()));
			if(fxml.equals("MapGame.fxml")){//追記（岡野）
				stage.setMaximized(true);//画面サイズを最大化
			}
		} catch (IOException ex) {
			System.err.print(ex);
		}
	}
}
