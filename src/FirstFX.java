import java.awt.Label;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;


public class FirstFX extends Application {

	Label label1;
	Button button1;
	int i=1;
	
	public static void main(String[] args) {
	launch(args);

	}
	@Override
public void start(Stage stage) throws Exception {
	stage.setTitle("My First Stage Title!");
	label1 = new Label("My first new Label!");
	VBox root = new VBox();
	
	Scene scene = new Scene(root, 123, 300);
	stage.setScene(scene);
	
	button1 = new Button("Calculate");
	button1.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
		System.out.println("Hello World!");
		label1.setText("Trial number:"+i);
		i++;
		}
	} );
	
	root.getChildren().addAll(label1, button1);
		
	stage.show();
	}
}
