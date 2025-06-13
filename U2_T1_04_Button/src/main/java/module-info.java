module com.damian.form.demo3b {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.damian.form.demo3b to javafx.fxml;
    exports com.damian.form.demo3b;
}