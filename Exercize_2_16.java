/*(Comparing Integers) Write an application that asks the user to enter two integers, obtains
them from the user and displays the larger number followed by the words "is larger".*/


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Exercize_2_16 extends Application {
	public static void main(String[] args)
	{
		Application.launch(args);
	}

	public void start(Stage primaryStage) throws Exception
	{
		Parent root = FXMLLoader.load(getClass().getResource("Exercize_2_16.fxml"));
		primaryStage.setResizable(false);
		primaryStage.sizeToScene();
		primaryStage.setTitle("JavaFX application");
		primaryStage.centerOnScreen();
		//-----------------------------------------------
		Scene s = new Scene(root);
		primaryStage.setScene(s);
		primaryStage.show();
	}

}