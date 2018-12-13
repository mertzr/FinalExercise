package pkgApp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import pkgApp.RetirementApp;
import pkgCore.Retirement;
import javafx.scene.control.*;
public class RetirementController implements Initializable {

		
	private RetirementApp mainApp = null;
	
	@FXML
	public TextField txtYearsToWork;
	
	@FXML
	public TextField txtAnnualReturnWork;
	
	@FXML
	public TextField txtYearsRetired;
	
	@FXML
	public TextField txtAnnualReturnRetired;
	
	@FXML
	public TextField txtRequiredIncome;
	
	@FXML
	public TextField txtMonthlySSI;
	
	@FXML 
	public Label labelSaveEachMonth;
	
	@FXML 
	public Label labelWhatYouNeed;
	

	public RetirementApp getMainApp() {
		return mainApp;
	}

	public void setMainApp(RetirementApp mainApp) {
		this.mainApp = mainApp;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {		
	}
	
	@FXML
	public void btnClear(ActionEvent event) {
		txtYearsToWork.setText("");
		txtAnnualReturnWork.setText("");
		txtYearsRetired.setText("");
		txtAnnualReturnRetired.setText("");
		txtRequiredIncome.setText("");
		txtMonthlySSI.setText("");
		labelSaveEachMonth.setText("");
		labelWhatYouNeed.setText("");
		
		//	TODO: Clear all the text inputs
	}
	
	@FXML
	public void btnCalculate(ActionEvent event) {
		
		//	TODO: Call AmountToSave and TotalAmountSaved and populate 
		
		Retirement rt = new Retirement();
		labelSaveEachMonth.setText(String.valueOf(rt.AmountToSave()));
		labelWhatYouNeed.setText(String.valueOf(rt.TotalAmountSaved()));
	
		
		
	}
	
}
