module com.example.hmsjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.hmsjavafx.view to javafx.fxml;
    exports com.hmsjavafx.view;
    exports com.hmsjavafx.controller;
    opens com.hmsjavafx.controller to javafx.fxml;
}