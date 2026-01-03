module com.example.hmsjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hmsjavafx to javafx.fxml;
    exports com.example.hmsjavafx;
}