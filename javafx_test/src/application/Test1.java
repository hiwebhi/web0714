package application;



import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Test1 extends Application{
	
	
	@Override
	public void start(Stage stage) throws Exception {
		VBox vBox=new VBox();
		vBox.setAlignment(Pos.CENTER);
		
			Button button=new Button();
			button.setText("�ݱ�");
			button.setOnAction(e -> Platform.exit());
			
			Label label = new Label();		// ���̺� ��ü ����� 
			label.setText("�ȳ��ϼ��� javafx �Դϴ�");	// ���̺� �ؽ�Ʈ ����
			label.setFont( new Font(30) );			// ���̺� �۲� ���� 
			
			vBox.getChildren().add(label);
			vBox.getChildren().add(button);
			
			Scene scene=new Scene(vBox,500,500);
			stage.setScene(scene);
			stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
