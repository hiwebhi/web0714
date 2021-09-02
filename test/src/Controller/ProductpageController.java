package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Dao.ProductDao;
import Domain.ProductDto;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;

public class ProductpageController implements Initializable {
	
	public ProductDto productdto=null;
	
	private static ProductpageController instance;
	
	public ProductpageController() {
		instance=this;
	}
	public static ProductpageController getinstance() {
		return instance;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	ProductDao productDao=ProductDao.getprocutdao();
	ObservableList<ProductDto> productDtos=productDao.productlist();
	//열[필드 컬럼]
	TableColumn tc = tableview.getColumns().get(0);
	tc.setCellValueFactory( new PropertyValueFactory<>("pno") ); // 첫번째 필드에 연결할 필드명
	
	tc = tableview.getColumns().get(1);
	tc.setCellValueFactory( new PropertyValueFactory<>("pname") );
	
	tc = tableview.getColumns().get(2);
	tc.setCellValueFactory( new PropertyValueFactory<>("pcategory") );
	
	tc = tableview.getColumns().get(3);
	tc.setCellValueFactory( new PropertyValueFactory<>("pprice") );
	
	tc = tableview.getColumns().get(4);
	tc.setCellValueFactory( new PropertyValueFactory<>("pstock") );
	
	tc = tableview.getColumns().get(5);
	tc.setCellValueFactory( new PropertyValueFactory<>("pquantity") );
	
	tableview.setItems(productDtos); 

	
	tableview.setOnMouseClicked( ( event ) -> {
		
		if( event.getButton().equals( MouseButton.PRIMARY ) ) {
			
			// ProductDto productdto; // 혹시 이렇게 했을때 왜 안되는지 아시나요??아니요
			// 잘 보시면 dto가 위에서 선언이 되었죠??넵 그럼 위에서 선언했는데 아래에서 또 선언하면 서로 같을까요? 다를까요? 달라요? 네 다른 객체가 되는거에요
				// 그래서 아래에서는 선언하지 않고 대입만 해주면 됩니다 그래서 클래스명을 제외해야 합니다
			
			productdto = tableview.getSelectionModel().getSelectedItem();
			// 메소드 안에서 선언시에는 메소드 안에서만 사용 가능합니다 [ 지역변수 ] 
			
			Image image = new Image(productdto.getPimage());
			productimg.setImage( image );
			
			lblproductname.setText( productdto.getPname() );
			lblproductcontents.setText( "제품 설명 : "+ productdto.getPcontents() );
			
			if( productdto.getPactivation() == 0	) { lblproductactivation.setText( "제품 상태 : "+"판매준비중" ); }
			if( productdto.getPactivation() == 1	) { lblproductactivation.setText( "제품 상태 : "+"판매중" ); }
			if( productdto.getPactivation() == 2	) { lblproductactivation.setText( "제품 상태 : "+"품절" ); }
			
		
		}
		
		
	});
	
			
	}
	@FXML
    private TableView<ProductDto> tableview;

    @FXML
    private Button btnproductadd;

    @FXML
    private Button btnproductsum;

    @FXML
    private ImageView productimg;

    @FXML
    private Label lblproductcontents;

    @FXML
    private Label lblproductactivation;

    @FXML
    private Label lblproductname;
    
    @FXML
    private Button btnproductupdate;


    @FXML
    void productadd(ActionEvent event) {
    	MainpageController.getinstance().loadpage("productaddpage");
    }

    @FXML
    void productsum(ActionEvent event) {

    }
	
    
    @FXML
    void productupdate(ActionEvent event) {
    	MainpageController.getinstance().loadpage("productupdatepage");
    }

    
    
    
    
    
    
    
    
    
	
}
