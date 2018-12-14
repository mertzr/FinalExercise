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
	private TextField txtYearsToWork;
	
	@FXML
	private TextField txtAnnualReturnWork;
	
	@FXML
	private TextField txtYearsRetired;
	
	@FXML
	private TextField txtAnnualReturnRetired;
	
	@FXML
	private TextField txtRequiredIncome;
	
	@FXML
	private TextField txtMonthlySSI;
	
	@FXML 
	private Label labelSaveEachMonth;
	
	@FXML 
	private Label labelWhatYouNeed;
	

	public RetirementApp getMainApp() {
		return mainApp;
	}

	public void setMainApp(RetirementApp mainApp) {
		this.mainApp = mainApp;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {		
	}
	
	private boolean isInt(String txtYearsToWork, String txtYearsRetired ){
		try {
			Integer.parseInt(txtYearsToWork);
			Integer.parseInt(txtYearsRetired);
			
			return true;
		}
		catch(NumberFormatException e) {
			return false;
		}
	}
	private boolean isDouble(String txtAnnualReturnWork, String txtAnnualReturnRetired, String txtRequiredIncome, String txtMonthlySSI ){
		try {
			Double.parseDouble(txtAnnualReturnWork);
			Double.parseDouble(txtAnnualReturnRetired);
			Double.parseDouble(txtRequiredIncome);
			Double.parseDouble(txtMonthlySSI);
			
			return true;
		}
		catch(NumberFormatException e) {
			return false;
		}
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
		if(isInt(txtYearsToWork.getText(),txtYearsRetired.getText())==true&& isDouble(txtAnnualReturnWork.getText(), txtAnnualReturnRetired.getText(),txtRequiredIncome.getText(), txtMonthlySSI.getText())==true) {
		
		rt.setiYearsToWork(Integer.parseInt(txtYearsToWork.getText()));
		rt.setdAnnualReturnWorking(Double.parseDouble(txtAnnualReturnWork.getText()));
		rt.setiYearsRetired(Integer.parseInt(txtYearsRetired.getText()));
		rt.setdAnnualReturnRetired(Double.parseDouble(txtAnnualReturnRetired.getText()));
		rt.setdRequiredIncome(Double.parseDouble(txtRequiredIncome.getText()));
		rt.setdMonthlySSI(Double.parseDouble(txtMonthlySSI.getText()));
		
		labelWhatYouNeed.setText(String.valueOf(rt.TotalAmountSaved()));
		labelSaveEachMonth.setText(String.valueOf(rt.AmountToSave()));
		}
		
		else {
			txtYearsToWork.setText("");
			txtAnnualReturnWork.setText("");
			txtYearsRetired.setText("");
			txtAnnualReturnRetired.setText("");
			txtRequiredIncome.setText("");
			txtMonthlySSI.setText("");
			labelSaveEachMonth.setText("Please Enter Valid Entries");
			labelWhatYouNeed.setText("Please Enter Valid Entries");
		}
	}
}
