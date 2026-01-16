package com.devbam.kioskrenewal.controller;

import com.devbam.kioskrenewal.model.Order;
import javafx.collections.ObservableMap;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;

public class OrderController implements Initializable {
    // Curry
    @FXML
    private ImageView curry001img;
    @FXML
    private ImageView curry002img;
    @FXML
    private ImageView curry003img;
    @FXML
    private ImageView curry004img;
    @FXML
    private ImageView curry005img;
    @FXML
    private ImageView curry006img;
    @FXML
    private ImageView curry007img;
    @FXML
    private ImageView curry008img;
    @FXML
    private ImageView curry009img;
    @FXML
    private ImageView curry010img;
    @FXML
    private Button curry001add;
    @FXML
    private Button curry002add;
    @FXML
    private Button curry003add;
    @FXML
    private Button curry004add;
    @FXML
    private Button curry005add;
    @FXML
    private Button curry006add;
    @FXML
    private Button curry007add;
    @FXML
    private Button curry008add;
    @FXML
    private Button curry009add;
    @FXML
    private Button curry010add;
    @FXML
    private Label curry001count;
    @FXML
    private Label curry002count;
    @FXML
    private Label curry003count;
    @FXML
    private Label curry004count;
    @FXML
    private Label curry005count;
    @FXML
    private Label curry006count;
    @FXML
    private Label curry007count;
    @FXML
    private Label curry008count;
    @FXML
    private Label curry009count;
    @FXML
    private Label curry010count;
    @FXML
    private Button curry001remove;
    @FXML
    private Button curry002remove;
    @FXML
    private Button curry003remove;
    @FXML
    private Button curry004remove;
    @FXML
    private Button curry005remove;
    @FXML
    private Button curry006remove;
    @FXML
    private Button curry007remove;
    @FXML
    private Button curry008remove;
    @FXML
    private Button curry009remove;
    @FXML
    private Button curry010remove;

    // udon
    @FXML
    private ImageView udon001img;
    @FXML
    private ImageView udon002img;
    @FXML
    private ImageView udon003img;
    @FXML
    private ImageView udon004img;
    @FXML
    private ImageView udon005img;
    @FXML
    private ImageView udon006img;
    @FXML
    private Button udon001add;
    @FXML
    private Button udon002add;
    @FXML
    private Button udon003add;
    @FXML
    private Button udon004add;
    @FXML
    private Button udon005add;
    @FXML
    private Button udon006add;
    @FXML
    private Label udon001count;
    @FXML
    private Label udon002count;
    @FXML
    private Label udon003count;
    @FXML
    private Label udon004count;
    @FXML
    private Label udon005count;
    @FXML
    private Label udon006count;
    @FXML
    private Button udon001remove;
    @FXML
    private Button udon002remove;
    @FXML
    private Button udon003remove;
    @FXML
    private Button udon004remove;
    @FXML
    private Button udon005remove;
    @FXML
    private Button udon006remove;

    // pasta
    @FXML
    private ImageView pasta001img;
    @FXML
    private ImageView pasta002img;
    @FXML
    private ImageView pasta003img;
    @FXML
    private ImageView pasta004img;
    @FXML
    private Button pasta001add;
    @FXML
    private Button pasta002add;
    @FXML
    private Button pasta003add;
    @FXML
    private Button pasta004add;
    @FXML
    private Label pasta001count;
    @FXML
    private Label pasta002count;
    @FXML
    private Label pasta003count;
    @FXML
    private Label pasta004count;
    @FXML
    private Button pasta001remove;
    @FXML
    private Button pasta002remove;
    @FXML
    private Button pasta003remove;
    @FXML
    private Button pasta004remove;

    // hayashiRice
    @FXML
    private ImageView hayashi001img;
    @FXML
    private ImageView hayashi002img;
    @FXML
    private ImageView hayashi003img;
    @FXML
    private ImageView hayashi004img;
    @FXML
    private Button hayashi001add;
    @FXML
    private Button hayashi002add;
    @FXML
    private Button hayashi003add;
    @FXML
    private Button hayashi004add;
    @FXML
    private Label hayashi001count;
    @FXML
    private Label hayashi002count;
    @FXML
    private Label hayashi003count;
    @FXML
    private Label hayashi004count;
    @FXML
    private Button hayashi001remove;
    @FXML
    private Button hayashi002remove;
    @FXML
    private Button hayashi003remove;
    @FXML
    private Button hayashi004remove;

    // donburry

    @FXML
    private ImageView donburry001img;
    @FXML
    private ImageView donburry002img;
    @FXML
    private ImageView donburry003img;
    @FXML
    private Button donburry001add;
    @FXML
    private Button donburry002add;
    @FXML
    private Button donburry003add;
    @FXML
    private Label donburry001count;
    @FXML
    private Label donburry002count;
    @FXML
    private Label donburry003count;
    @FXML
    private Button donburry001remove;
    @FXML
    private Button donburry002remove;
    @FXML
    private Button donburry003remove;

    // set

    @FXML
    private ImageView set001img;
    @FXML
    private ImageView set002img;
    @FXML
    private ImageView set003img;
    @FXML
    private ImageView set004img;
    @FXML
    private ImageView set005img;
    @FXML
    private ImageView set006img;
    @FXML
    private ImageView set007img;
    @FXML
    private Button set001add;
    @FXML
    private Button set002add;
    @FXML
    private Button set003add;
    @FXML
    private Button set004add;
    @FXML
    private Button set005add;
    @FXML
    private Button set006add;
    @FXML
    private Button set007add;
    @FXML
    private Label set001count;
    @FXML
    private Label set002count;
    @FXML
    private Label set003count;
    @FXML
    private Label set004count;
    @FXML
    private Label set005count;
    @FXML
    private Label set006count;
    @FXML
    private Label set007count;
    @FXML
    private Button set001remove;
    @FXML
    private Button set002remove;
    @FXML
    private Button set003remove;
    @FXML
    private Button set004remove;
    @FXML
    private Button set005remove;
    @FXML
    private Button set006remove;
    @FXML
    private Button set007remove;

    // tab
    @FXML
    private TabPane tabContainer;
    @FXML
    private Tab curryTab;
    @FXML
    private Tab udonTab;
    @FXML
    private Tab pastaTab;
    @FXML
    private Tab hayashiTab;
    @FXML
    private Tab donburryTab;
    @FXML
    private Tab setTab;

    private double tabWidth = 100.0;
    public static int lastSelectedTabIndex = 0;

    // orderList
    @FXML
    public ListView<String> myOrder;

    @FXML
    private Button cancelOrder;

    @FXML
    private Button orderBtn;

    @FXML
    private Button adminButton;

    @FXML
    private Label lblStatus;
    @FXML
    private TextField txtUserName;
    @FXML
    private PasswordField txtPassword;

    public static ArrayList<Order> orderList;
    private static HashMap<String, Order> orderMap;
    public static ObservableMap<String, String> countMap;

    private Stage primaryStage;

    public OrderController() {

    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
