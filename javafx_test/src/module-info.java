module javafx_test {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
