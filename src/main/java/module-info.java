module mns.java.Morpion {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	requires java.sql;

    opens mns.java.Morpion to javafx.fxml;
    exports mns.java.Morpion;
}
