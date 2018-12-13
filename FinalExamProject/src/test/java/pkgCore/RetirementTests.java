package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class RetirementTests {

	@Test
	public void TestTotalAmountSaved() {
		int iYearsRetired=20;
		double dAnnualReturn=.02;
		double dExpectedPV=1454485.55;
		double dSSI=2642;
		double dRequiredIncome=10000;
		
		Retirement rt = new Retirement();
		rt.setdAnnualReturnRetired(dAnnualReturn);
		rt.setdMonthlySSI(dSSI);
		rt.setdRequiredIncome(dRequiredIncome);
		rt.setiYearsRetired(iYearsRetired);
		
		assertEquals(dExpectedPV,rt.TotalAmountSaved(),.01);
		
	}
	
	@Test
	public void TestAmountToSave() {
		int iYearsToWork=40;
		double dAnnualReturnWorking=.07;
		double dExpected=554.13;
		int iYearsRetired=20;
		double dAnnualReturnRetired=.02;
		double dSSI=2642;
		double dRequiredIncome=10000;
		
		
		Retirement rt = new Retirement();
		rt.setdAnnualReturnWorking(dAnnualReturnWorking);
		rt.setiYearsToWork(iYearsToWork);
		rt.setdAnnualReturnRetired(dAnnualReturnRetired);
		rt.setdMonthlySSI(dSSI);
		rt.setdRequiredIncome(dRequiredIncome);
		rt.setiYearsRetired(iYearsRetired);
		
		
		assertEquals(dExpected,rt.AmountToSave(),.01);
		
	
		
	}

}
