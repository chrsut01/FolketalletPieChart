module com.example.folketalletpiechart {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.folketalletpiechart to javafx.fxml;
    exports com.example.folketalletpiechart;
}