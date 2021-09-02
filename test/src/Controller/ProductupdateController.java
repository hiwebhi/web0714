package Controller;


import java.net.URL;
import java.util.ResourceBundle;

import Dao.ProductDao;
import Domain.ProductDto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ProductupdateController implements Initializable{
	
	private ProductDto productdto=null;
	private int pactivation=0;
	private Stage filestage;
	private String pimage=null;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		productdto=ProductpageController.getinstance().productdto;
		pactivation=productdto.getPactivation();
		pimage=productdto.getPimage();
		
		txtpname.setText(productdto.getPname());
		txtpcontents.setText(productdto.getPcontents());
		txtpprice.setText(productdto.getPprice()+"");
		txtpstock.setText(productdto.getPstock()+"");
		
		//ī�װ�
		if(productdto.getPcategory().equals("����")) {opt_1.setSelected(true);}
		if(productdto.getPcategory().equals("����")) {opt_2.setSelected(true);}
		if(productdto.getPcategory().equals("�Ź�")) {opt_3.setSelected(true);}
		if(productdto.getPcategory().equals("����")) {opt_4.setSelected(true);}
		if(productdto.getPcategory().equals("ACC")) {opt_5.setSelected(true);}
		
		//����
		lblpath.setText(pimage);
		Image image=new Image(productdto.getPimage());
		uploadimg.setImage(image);
		
		//��ǰ����
		if(productdto.getPactivation()==0) {btnactivation.setText("�غ���");}
		if(productdto.getPactivation()==1) {btnactivation.setText("�Ǹ���");}
		if(productdto.getPactivation()==2) {btnactivation.setText("����");}
		
	}
	
	 @FXML
	    void activation(ActionEvent event) {
//		 if(pactivation==0) {btnactivation.setText("�Ǹ���"); pactivation=1;}
//		 else if(pactivation==1) {btnactivation.setText("�غ���"); pactivation=0;}

	    }
	
	 
	 
	    
	    @FXML
	    void productupdate(ActionEvent event) {
//	    	productdto.setPname(txtpname.getText());
//	    	productdto.setPcontents(txtpcontents.getText());
//	    	productdto.setPprice(Integer.parseInt(txtpprice.getText()));
//	    	productdto.setPstock(Integer.parseInt(txtpstock.getText()));
//	    	// ������ư ���������� �� ���� 
//	    	
//	    	if( opt_1.isSelected() ) { productdto.setPcategory("����"); }
//	    	if( opt_2.isSelected() ) { productdto.setPcategory("����"); }
//	    	if( opt_3.isSelected() ) { productdto.setPcategory("�Ź�"); }
//	    	if( opt_4.isSelected() ) { productdto.setPcategory("����"); }
//	    	if( opt_5.isSelected() ) { productdto.setPcategory("ACC"); }
//	    	
//	    	productdto.setPimage(pimage);
//	    	productdto.setPactivation(pactivation);
//	    	
//	    	//dao
//	    	ProductDao productDao=ProductDao.getprocutdao();
//	    	boolean result=productDao.productupdate(productdto);
//	    	if(result) {
//	    		MainpageController.getinstance().loadpage("productpage");
//	    		
//	    	}else {
//	    		
//	    	}
	    }
	   
	    @FXML
	    void upload(ActionEvent event) {

	    }
	
	@FXML
    private Button btnproductupdate;

    @FXML
    private Button btnproductcancel;

    @FXML
    private ImageView uploadimg;

    @FXML
    private TextField txtpname;

    @FXML
    private TextArea txtpcontents;

    @FXML
    private TextField txtpprice;

    @FXML
    private TextField txtpstock;

    @FXML
    private RadioButton opt_1;

    @FXML
    private ToggleGroup category;

    @FXML
    private RadioButton opt_2;

    @FXML
    private RadioButton opt_3;

    @FXML
    private RadioButton opt_4;

    @FXML
    private RadioButton opt_5;

    @FXML
    private Button btnupload;

    @FXML
    private Label lblpath;

    @FXML
    private Button btnactivation;

   

    @FXML
    void productcancel(ActionEvent event) {

    }
    


}
