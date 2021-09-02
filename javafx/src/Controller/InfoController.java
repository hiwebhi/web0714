package Controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import Dao.MemberDao;
import Domain.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class InfoController implements Initializable{
	
	private String login;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		// dbó�� 
				MemberDao memberDao = MemberDao.getMemberDao();
				Member member = memberDao.getmember(login);
				
				txtid.setText( member.getId() );
				txtname.setText( member.getName() );
				txtemail.setText( member.getEmail() );
			
				String phone = member.getPhone().substring(0, 3) +"-"+ 
						member.getPhone().substring(3, 7)+"-"+ 
						member.getPhone().substring(7, 11);
				
				txtphone.setText( phone );
				txtpoint.setText( member.getPoint()+"" );
		/*
		//1.�α��ε� ���̵� ��������
		login=LoginController.getinstance().getloginid();
		//2.����Ʈ�� ���̵� ã�Ƽ�
		for(Member member: List.members) {
			if(member.getId().equals(login) ) {
				//3.ã�� ���̵��� ���� ���
				txtid.setText(member.getId());
				txtname.setText(member.getName());
				txtemail.setText( member.getEmail() );
				
				String phone = member.getPhone().substring(0, 3) +"-"+ 
						member.getPhone().substring(3, 7)+"-"+ 
						member.getPhone().substring(7, 11);
				
				txtphone.setText( phone );
				txtpoint.setText( member.getPoint()+"" );
				
				
			}
		}*/
		
	}
	
	///
	  @FXML
	    private Label txtpoint;

	    @FXML
	    private Button btnupdate;

	    @FXML
	    private Button btndelete;

	    @FXML
	    private Label txtid;

	    @FXML
	    private Label txtname;

	    @FXML
	    private Label txtemail;

	    @FXML
	    private Label txtphone;

	    @FXML
	    void delete(ActionEvent event) throws Exception {
	    	// 1.�޽���â���� Ȯ�ο��� ����� 
	    	Alert alert = new Alert( AlertType.CONFIRMATION );
	    	alert.setContentText(" ���� ȸ��Ż�� �Ͻðڽ��ϱ�? ");
	    	alert.setHeaderText("ȸ��Ż��");
	    	
	    	Optional<ButtonType>optional = alert.showAndWait();
	    	
	    	if( optional.get() == ButtonType.OK ) {
	    		// 2. ok �������� 
	    		// db ó�� 
	    		MemberDao memberDao = MemberDao.getMemberDao();
	    		boolean result =  memberDao.memberdelete(login);
	    		if( result ) { // ���� 
	    			
					// 4. ���� �������� �����ϰ� �α���â���� �̵�
					btndelete.getScene().getWindow().hide();
					// 5. �α���â ���� 
		    	    	Stage stage = new Stage();
		    			// 2. fxml ���� ��üȭ									// ���� Ŭ������ ��Ű���� �ٸ��� ������ [ ��� ���� ] 
		    			Parent parent = FXMLLoader.load(getClass().getResource("/FXML/login.fxml"));
		    			// 3. �� ���� fxml���� �ֱ� 
		    			Scene scene = new Scene(parent);
		    			// 4. ���������� �� �ֱ� 
		    			stage.setScene(scene);
		    			// 5. �������� ���� �� ���� 
		    			stage.setResizable(false); // �������� ũ�⺯��Ұ� 
		    			stage.setTitle("Disney store");//�������� Ÿ��Ʋ
	    				//�������� ������
	    					//1. �̹��� �ҷ�����
	    					Image image=new Image("file:C:/Users/gpqls/OneDrive/���� ȭ��/web/javafx/src/FXML/icon.png");
		    				stage.getIcons().add(image);
		    			stage.show();
				}
	    		/*
	    		// 3. ����Ʈ�� ���Ͽ��� ������ ������Ʈ 
	    		for( Member member : List.members ) {
	    			//1.����Ʈ���� ���� 
	    			if( member.getId().equals(login)) {
	    				List.members.remove( member );
	    				// 2. ���� ó�� 
	    				FileUtil.filesave();
	    				// 4. ���� �������� �����ϰ� �α���â���� �̵�
	    				btndelete.getScene().getWindow().hide();
	    				// 5. �α���â ���� 
			    	    	Stage stage = new Stage();
			    			// 2. fxml ���� ��üȭ									// ���� Ŭ������ ��Ű���� �ٸ��� ������ [ ��� ���� ] 
			    			Parent parent = FXMLLoader.load(getClass().getResource("/FXML/login.fxml"));
			    			// 3. �� ���� fxml���� �ֱ� 
			    			Scene scene = new Scene(parent);
			    			// 4. ���������� �� �ֱ� 
			    			stage.setScene(scene);
			    			//5. �������� ���� �� ����
			    			stage.setResizable(false); //�������� ũ�⺯�� �Ұ�
			    			stage.setTitle("Disney store");//�������� Ÿ��Ʋ
			    				//�������� ������
			    					//1. �̹��� �ҷ�����
			    					Image image=new Image("file:C:/Users/gpqls/git/web-java/javafx_project/src/FXML/icon.png");
			    					stage.getIcons().add(image);
			    				stage.show();
		    				
	    			}
	    		}*/
	    	}
	    }

	    @FXML
	    void update(ActionEvent event) {
	    	// ������ ��ȯ [ ���������� �޼ҵ� ���� �ҷ�����  ]
	    	MainController.getinstance().loadpage("infoupdatepage");

	    }
	    
	    

}
