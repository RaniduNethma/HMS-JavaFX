module com.example.hmsjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.hmsjavafx.view to javafx.fxml;
    exports com.hmsjavafx.view;
}