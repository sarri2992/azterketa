package ehu.isad.controllers;

import ehu.isad.model.Webgunea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

public class Controller {

    List<Webgunea> laglist;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea textId;

    @FXML
    private Button checkId;

    @FXML
    private TableView<Webgunea> taulaId;

    @FXML
    private TableColumn<?, ?> urlId;

    @FXML
    private TableColumn<?, ?> md5Id;

    @FXML
    private TableColumn<?, ?> versionId;

    @FXML
    void bilatu(ActionEvent event) throws SQLException, IOException, NoSuchAlgorithmException {

        String url=textId.getText()+"/README";

        MessageDigestForURL.main(url);

        laglist=KontsultaKud.getNireKontsultaKud().getWebguneak();
        boolean topatua=false;
        int i=0;
//        while (!topatua || laglist.isEmpty()){
//            if (laglist.get(i).getMd5().equals(md5)){
//                topatua=true;
//                Webgunea lag = laglist.get(i);
//                List <Webgunea> laglist2=null;
//                laglist2.add(lag);
//                ObservableList<Webgunea> lagak = FXCollections.observableArrayList(laglist2);
//                taulaId.setItems(lagak);
//            }
//            laglist.remove(i);
//            i++;
//        }






    }



    @FXML
    void initialize() {

        versionId.setEditable(true);
        versionId.setCellValueFactory(new PropertyValueFactory<>("version"));


    }

    public String getWeb(){
        return textId.getText();
    }

}

