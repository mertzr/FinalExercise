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
	
	
	@FXML
	public TextField getTxtYearsToWork() {
		return txtYearsToWork;
	}
	
	public void setTxtYearsToWork(TextField txtYearsToWork) {
		this.txtYearsToWork = txtYearsToWork;
	}
	@FXML
	public TextField getTxtAnnualReturnWork() {
		return txtAnnualReturnWork;
	}
	
	public void setTxtAnnualReturnWork(TextField txtAnnualReturnWork) {
		this.txtAnnualReturnWork = txtAnnualReturnWork;
	}
	@FXML
	public TextField getTxtYearsRetired() {
		return txtYearsRetired;
	}
	
	public void setTxtYearsRetired(TextField txtYearsRetired) {
		this.txtYearsRetired = txtYearsRetired;
	}
	@FXML
	public TextField getTxtAnnualReturnRetired() {
		return txtAnnualReturnRetired;
	}

	public void setTxtAnnualReturnRetired(TextField txtAnnualReturnRetired) {
		this.txtAnnualReturnRetired = txtAnnualReturnRetired;
	}
	@FXML
	public TextField getTxtRequiredIncome() {
		return txtRequiredIncome;
	}

	public void setTxtRequiredIncome(TextField txtRequiredIncome) {
		this.txtRequiredIncome = txtRequiredIncome;
	}
	@FXML
	public TextField getTxtMonthlySSI() {
		return txtMonthlySSI;
	}

	public void setTxtMonthlySSI(TextField txtMonthlySSI) {
		this.txtMonthlySSI = txtMonthlySSI;
	}
	@FXML
	public Label getLabelSaveEachMonth() {
		return labelSaveEachMonth;
	}

	public void setLabelSaveEachMonth(Label labelSaveEachMonth) {
		this.labelSaveEachMonth = labelSaveEachMonth;
	}
	@FXML
	public Label getLabelWhatYouNeed() {
		return labelWhatYouNeed;
	}

	public void setLabelWhatYouNeed(Label labelWhatYouNeed) {
		this.labelWhatYouNeed = labelWhatYouNeed;
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
