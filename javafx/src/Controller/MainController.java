package Controller;


import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainController implements Initializable{
	
	//현재 클래스 [컨트롤러]의 객체
	private static MainController instance;
	
	public MainController() {
		instance=this;
	}
	
	public static MainController getinstance() {
		return instance;
	}
	
	
	private String login;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		login=LoginController.getinstance().getloginid();
		//로그인 컨트롤러에서 로그인된 아이디 가져오기
		loginid.setText(login);
	}
	//fx:id 가져오기
	@FXML
    private BorderPane boarderpane;

    @FXML
    private AnchorPane cp;

    @FXML
    private AnchorPane lp;

    @FXML
    private Label loginid;

    @FXML
    private Button btnlogout;

    @FXML
    private Label btncommunity;

    @FXML
    private Label btninfo;

    @FXML
    private Label btnproduct;

    @FXML
    private Label btnchatting;

   

    @FXML
    void logout(ActionEvent event) throws Exception { //로그아웃 클릭했을때
    	
    	//0.메세지를 띄우기 [확인 / 취소]
    	Alert alert=new Alert(AlertType.CONFIRMATION);
    	alert.setContentText("로그아웃 하시겠습니까?");
    	alert.setHeaderText("로그아웃");
    		//해당 메세지에서 선택한 버튼 가져오기
    		Optional<ButtonType> optional=alert.showAndWait();	
    			//null을 포함한 모든 객체를 저장
    		if(optional.get()==ButtonType.OK) { //확인 버튼을 눌렀을때
    			//1.현재 스테이지 닫기[ 현재 컨트롤명.getScene().getWindow().hide();
    	    	btnlogout.getScene().getWindow().hide();
    	    	
    	    	//2.로그인 스테이지 열기
    	    	Stage stage=new Stage();
	    	    	//2.fxml 파일 객체화									//현재 클래스와 패키지가 다르기때문에[경로 설정]
	    			Parent parent=FXMLLoader.load(getClass().getResource("/FXML/login.fxml"));
	    			
	    			//3.씬 만들어서 fxml 파일 넣기
	    			Scene scene=new Scene(parent);
	    			
	    			//4.스테이지에 씬 넣기
	    			stage.setScene(scene);
	    		
	    			//5. 스테이지 설정 및 실행
	    			stage.setResizable(false); //스테이지 크기변경 불가
	    			stage.setTitle("Disney store");//스테이지 타이틀
	    				//스테이지 아이콘
	    					//1. 이미지 불러오기
	    					Image image=new Image("file:C:/Users/gpqls/OneDrive/바탕 화면/web/javafx/src/FXML/icon.png");
	    					stage.getIcons().add(image);
	    				stage.show();
    				
    		}
    		
    }

    @FXML
    void product(MouseEvent event) {
    	loadpage("productpage");

    }
    
    @FXML
    void chatting(MouseEvent event) {
    	loadpage("chattingpage");

    }

    @FXML
    void community(MouseEvent event) {
    	loadpage("communitypage");

    }

    @FXML
    void info(MouseEvent event) {
    	loadpage("infopage");

    }
    
    //////////////페이지 전환 메소드[cp에 표시할 fxml 변환]////////////
    public void loadpage(String page) {
    	
    	try {
			Parent parent=FXMLLoader.load(getClass().getResource("/FXML/"+page+".fxml"));
			boarderpane.setCenter(parent);
    	
    	} catch (Exception e) {
			
			
		}
    	
    	
    }

}
