/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.jfoenix.controls.JFXButton;
import dataBase.ConnectBd;
import de.jensd.fx.glyphs.GlyphsDude;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author yassine
 */
public class MainController implements Initializable {
    
    @FXML
    private BorderPane principalBorder;
    @FXML
    private JFXButton test;
    @FXML
    private JFXButton tesrbuttn;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ConnectBd.getconnection();
//        principalBorder.getChildren().addAll(GlyphsDude.createIcon(FontAwesomeIcons.BARCODE, "70px"));
//        principalBorder.setCenter(GlyphsDude.createIcon(FontAwesomeIcons.BARCODE, "70px"));
    }
    
    @FXML
    private void funcTest(ActionEvent event) throws IOException {
        AnchorPane root = null;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/TESTCenter.fxml"));
        root = loader.load();
        principalBorder.setCenter(root);
    }
    
}
