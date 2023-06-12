module senac.sp.com.olamundo {
    requires javafx.controls;
    requires javafx.fxml;


    opens senac.sp.com.olamundo to javafx.fxml;
    exports senac.sp.com.olamundo;
}