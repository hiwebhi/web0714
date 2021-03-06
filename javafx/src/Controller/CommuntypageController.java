package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Dao.BoardDao;
import Domain.BoardDto;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public class CommuntypageController implements Initializable {

	private static BoardDto boarddto; // 현재 클릭된 게시물의 아이템
	
	private static CommuntypageController instance;
	
	public CommuntypageController() { // 본인클래스의 본인객체
		instance = this;
	}
	
	public static CommuntypageController getinstance() {
		return instance;
	}
	public BoardDto getboard() {
		return boarddto;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// 해당 페이지가 열렸을때 초기값 설정해주는 메소드 
		// 1. DAO 객체 
		BoardDao boardDao = BoardDao.getboarddao();
		// 2. DAO 메소드 실행 
		ObservableList<BoardDto> boardDtos =  boardDao.boardlist();
		// 3. 결과를 테이블의 각 필드에 값 넣기 
		TableColumn tc = tableview.getColumns().get(0); // 첫번째 열[필드] 가져오기 
		tc.setCellValueFactory( new PropertyValueFactory<>("bno") );
		
		tc = tableview.getColumns().get(1); // 두번째 열[필드] 가져오기 
		tc.setCellValueFactory( new PropertyValueFactory<>("btitle") );
		
		tc = tableview.getColumns().get(2); // 세번째 열[필드] 가져오기 
		tc.setCellValueFactory( new PropertyValueFactory<>("bwriter"));
		
		tc = tableview.getColumns().get(3); // 네번째 열[필드] 가져오기 
		tc.setCellValueFactory( new PropertyValueFactory<>("bdate") );
		
		tc = tableview.getColumns().get(4); // 다섯번째 열[필드] 가져오기 
		tc.setCellValueFactory( new PropertyValueFactory<>("bcount"));
		// 4. 테이블의 리스트 연결 
		tableview.setItems(boardDtos); // 테이블에 리스트 넣기 
		
		// 테이블에 행 클릭했을때 이벤트 
			//tableview.setOnMouseClicked( (MouseEvent event ) -> { 실행코드 } );
									// 람다식 : 익명메소드 [  인수 -> 실행코드  ]
		tableview.setOnMouseClicked(  ( MouseEvent event ) -> { 
			if( event.getButton().equals( MouseButton.PRIMARY) ) { // 해당 이벤트가 클릭이면 
							// 테이블에서 선택한 모델[행]의 아이템[셀값]
				boarddto = tableview.getSelectionModel().getSelectedItem();
				// 조회수 증가 
				boardDao.boardcount( boarddto.getBcount()+1 , boarddto.getBno() );
				
				MainController.getinstance().loadpage("boardviewpage");
			}
		} );
	}
	// fx:id 
    @FXML
    private TableView<BoardDto> tableview; // ObservableList 
    			// <  >  : 제네릭 
    @FXML
    private Button btnboardwrite;

    @FXML
    void boardwrite(ActionEvent event) {
    	MainController.getinstance().loadpage("boardwritepage");
    }
}
