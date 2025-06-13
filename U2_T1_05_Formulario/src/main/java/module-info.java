module com.damian.form.u2_t1_05_formulario {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.damian.form.u2_t1_05_formulario to javafx.fxml;
    exports com.damian.form.u2_t1_05_formulario;
}