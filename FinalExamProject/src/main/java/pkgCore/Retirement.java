package pkgCore;

import org.apache.poi.ss.formula.functions.*;

import pkgApp.controller.RetirementController;



public class Retirement {
	
	RetirementController rtc = new RetirementController();

	private int iYearsToWork=Integer.parseInt(rtc.getTxtYearsToWork().getText());
	private double dAnnualReturnWorking=Double.parseDouble(rtc.getTxtAnnualReturnWork().getText());
	private int iYearsRetired=Integer.parseInt(rtc.getTxtYearsRetired().getText());
	private double dAnnualReturnRetired=Double.parseDouble(rtc.getTxtAnnualReturnRetired().getText());
	private double dRequiredIncome=Double.parseDouble(rtc.getTxtRequiredIncome().getText());
	private double dMonthlySSI=Double.parseDouble(rtc.getTxtMonthlySSI().getText());
	
	//TODO: Build the contructor, getters and setters for the attributes above.
	
	public Retirement() {
		
	}
	
	public int getiYearsToWork() {
		return iYearsToWork;
	}

	public void setiYearsToWork(int iYearsToWork) {
		this.iYearsToWork = iYearsToWork;
	}

	public double getdAnnualReturnWorking() {
		return dAnnualReturnWorking;
	}

	public void setdAnnualReturnWorking(double dAnnualReturnWorking) {
		this.dAnnualReturnWorking = dAnnualReturnWorking;
	}

	public int getiYearsRetired() {
		return iYearsRetired;
	}
	
	public void setiYearsRetired(int iYearsRetired) {
		this.iYearsRetired = iYearsRetired;
	}

	public double getdAnnualReturnRetired() {
		return dAnnualReturnRetired;
	}

	public void setdAnnualReturnRetired(double dAnnualReturnRetired) {
		this.dAnnualReturnRetired = dAnnualReturnRetired;
	}

	public double getdRequiredIncome() {
		return dRequiredIncome;
	}

	public void setdRequiredIncome(double dRequiredIncome) {
		this.dRequiredIncome = dRequiredIncome;
	}

	public double getdMonthlySSI() {
		return dMonthlySSI;
	}

	public void setdMonthlySSI(double dMonthlySSI) {
		this.dMonthlySSI = dMonthlySSI;
	}

	public double TotalAmountSaved() 
	{
		//	TODO: Determine amount to be saved based on Monthly SSI, Required Income, Annual return during retirement
		//		and number of years retired.
		//
		
		
		return ((getdRequiredIncome() - getdMonthlySSI())/(getdAnnualReturnRetired() / 12)*(1 - Math.pow(1 + (getdAnnualReturnRetired()/12) , -(getiYearsRetired()*12))));
	}
	
	public double AmountToSave()
	{
		//TODO: Determine the amount to save each month based on TotalAmountSaved, YearsToWork
		//		and Annual return while working
		
		
		
		double TAMTS=((getdRequiredIncome() - getdMonthlySSI())/(getdAnnualReturnRetired() / 12)*(1 - Math.pow(1 + (getdAnnualReturnRetired()/12) , -(getiYearsRetired()*12))));
		return -FinanceLib.pmt(getdAnnualReturnWorking()/12, getiYearsToWork()*12, 0 , TAMTS, false);
	}
	
	
}
