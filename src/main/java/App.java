import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.StageStyle;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("FXML/menu.fxml"));
            Scene scene = new Scene(root);

            scene.setFill(Color.TRANSPARENT);
            stage.initStyle(StageStyle.TRANSPARENT);

            stage.setScene(scene);
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}

//import Controllers.InitPreloader;
//import Controllers.LauncherPreloader;
//import javafx.application.Application;
//import javafx.stage.Stage;
//
//
//public class App extends Application {
//    public static Stage primaryStage = null;
//    @Override
//    public void init() {
//        InitPreloader init = new InitPreloader();
//        init.checkFunctions();
//    }
//
//    @Override
//    public void start(Stage primaryStage) {
//        App.primaryStage = primaryStage;
//
//    }
//
//    public static void main(String[] args) {
//        System.setProperty("javafx.preloader",  LauncherPreloader.class.getCanonicalName());
//        launch(args);
//    }
//}
