package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;

import static javafx.scene.paint.Color.rgb;



public class Controller {
    @FXML ScrollBar redColor;
    @FXML ScrollBar greenColor;
    @FXML ScrollBar blueColor;
    @FXML ScrollBar visibility;
    @FXML private Label out;
    private int red = 0;
    private int green = 0;
    private int blue = 0;
//    public void things(ActionEvent actionEvent) {
//        //Ask professor about pulling the value from the Scrollbars
//        label.setTextFill(rgb((int)redColor.getValue(),(int)greenColor.getValue(),(int)blueColor.getValue()));
//        //Change to input from scrollbars
//        label.setOpacity((int)visibility.getValue());
//    }
//    @FXML
//    public void rAction(MouseEvent dragEvent) {
//        red = (int)(redColor.getValue());
//        //label.setTextFill(rgb(red,green,blue));
//        System.out.println(red);
//    }
//    @FXML
//    public void gAction(MouseDragEvent onMouseDragExited) {
//
//    }
//    @FXML
//    public void bAction(MouseEvent dragEvent) {
//
//    }
//    @FXML
//    public void vAction(MouseEvent dragEvent) {
//
//    }

    public void vActionReleased(MouseEvent mouseEvent) {
        out.setOpacity(visibility.getValue());
    }

    public void rActionReleased(MouseEvent mouseEvent) {
        red = (int)redColor.getValue();
        out.setTextFill(rgb(red,green,blue));
    }

    public void gActionReleased(MouseEvent mouseEvent) {
        green = (int)greenColor.getValue();
        out.setTextFill(rgb(red,green,blue));
    }

    public void bActionReleased(MouseEvent mouseEvent) {
        blue = (int)blueColor.getValue();
        out.setTextFill(rgb(red,green,blue));
    }
//
//    public void gAction(MouseEvent mouseEvent) {
//    }
}
