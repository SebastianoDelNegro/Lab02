package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class FXMLController {
	AlienDictionary dictionary = new AlienDictionary();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private Button buttonClear;
    

    @FXML
    private Button buttonTranslate;

    @FXML
    private TextField txtTesto;

    @FXML
    private TextArea txtTraduzione;

    @FXML
    void doClear(ActionEvent event) {
    	
    	txtTraduzione.clear();
    	


    }

    @FXML
    void doTranslate(ActionEvent event) {
    	String testo = txtTesto.getText();
    	String t = testo.toLowerCase();
    	String result = t.replace(" ", "");
    	if(Pattern.matches("[a-zA-Z]+", result)==false) {
    		txtTraduzione.setText("ERRORE: inserire solo lettere");
    		txtTesto.clear();
    		return;
    	}

    	if(testo.contains(" ")==true) {
    		String[] arr = t.split(" ");
    		for(Word b : dictionary.getDictionary()) {
    			String n = b.getAlienword();
    			if(n.toLowerCase().equals(arr[0])) {
    				b.setTraduzione(arr[1]);
    			}
    		}
    		
    		dictionary.addWord(arr[0], arr[1]);
    	}
    	else {
    		String tra = dictionary.translateWord(t);
    		if(tra==null) {
    			txtTraduzione.setText("null");
    			txtTesto.clear();
    			return;
    		}
    		
    		txtTraduzione.setText(tra);
    	}
    	txtTesto.clear();

    }

    @FXML
    void initialize() {
        assert txtTesto != null : "fx:id=\"txtTesto\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTraduzione != null : "fx:id=\"txtTraduzione\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}