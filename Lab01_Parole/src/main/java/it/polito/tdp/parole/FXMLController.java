package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;
	

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;
    
    @FXML
    private TextField txtTime;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;
    
    @FXML
    private Button btnCancella;
    
    @FXML
    void doCancel(ActionEvent event) {
    	long start = System.nanoTime();
    	String s = txtParola.getText();
    	elenco.cancellaParola(s);
    	txtResult.clear();
    	for(String si : elenco.getElenco())
    		txtResult.appendText(si+"\n");
    	long end = System.nanoTime();
    	long duration = end- start;
    	duration = TimeUnit.SECONDS.convert(duration, TimeUnit.MILLISECONDS);
    	String tempo = String.valueOf(duration);
    	txtTime.setText(tempo+"ms");
    

    }

    @FXML
    void doInsert(ActionEvent event) {
    	// TODO
    	long start = System.nanoTime();
    	txtResult.clear();
    	String p = txtParola.getText();
    	elenco.addParola(p);
    	for(String s : elenco.getElenco())
    		txtResult.appendText(s+"\n");
    	txtParola.clear();
    	long end = System.nanoTime();
    	long duration = end- start;
    	duration = TimeUnit.SECONDS.convert(duration, TimeUnit.MILLISECONDS);
    	String tempo = String.valueOf(duration);
    	txtTime.setText(tempo+"ms");
    	
    }

    @FXML
    void doReset(ActionEvent event) {
    	long start = System.nanoTime();
    	elenco.reset();
    	txtResult.clear();
    	txtParola.clear();
    	long end = System.nanoTime();
    	long duration = end- start;
    	duration = TimeUnit.SECONDS.convert(duration, TimeUnit.MILLISECONDS);
    	String tempo = String.valueOf(duration);
    	txtTime.setText(tempo+"ms");
    	
    }

    @FXML
    void initialize() {
    	assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTime != null : "fx:id=\"txtTime\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
}
