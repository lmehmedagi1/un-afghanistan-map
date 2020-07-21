package un.afghanistan.map.utility;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.util.Callback;

import java.io.IOException;

public class CustomFXMLLoader<T> {

    public Parent root;
    public T controller;

    public CustomFXMLLoader(String fxml) {
        initialize(FXMLUtils.getFXMLLoader(fxml));
    }

    public CustomFXMLLoader(String fxml, Callback<Class<?>, Object> controllerFactory) {
        initialize(FXMLUtils.getFXMLLoader(fxml, controllerFactory));
    }

    private void initialize(FXMLLoader loader) {
        try {
            root = loader.load();
            controller = loader.getController();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
