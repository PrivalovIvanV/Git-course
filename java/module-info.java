module smetanca.test {
    requires javafx.controls;
    requires javafx.fxml;


    opens smetanca.test to javafx.fxml;
    exports smetanca.test;
}