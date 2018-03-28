package edu.csbsju.ntc;

import org.junit.*;

public class NewTelephoneCompanyTest_WBT {
	private NewTelephoneCompany ntc;
	
	@Before
	public void init() throws Exception{
		ntc = new NewTelephoneCompany();
	}
	
	//=============== INVALID START TIME ===============
	
	@Test (expected=UnsupportedOperationException.class)
	public void testInvalidStartTime_Case1() {
		ntc.setStartTime(-5);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test (expected=UnsupportedOperationException.class)
	public void testInvalidStartTime_Case2() {
		ntc.setStartTime(-1);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test (expected=UnsupportedOperationException.class)
	public void testInvalidStartTime_Case3() {
		ntc.setStartTime(2544);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test (expected=UnsupportedOperationException.class)
	public void testInvalidStartTime_Case4() {
		ntc.setStartTime(2400);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test (expected=UnsupportedOperationException.class)
	public void testInvalidStartTime_Case5() {
		ntc.setStartTime(2401);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test (expected=UnsupportedOperationException.class)
	public void testInvalidStartTime_Case6() {
		ntc.setStartTime(1578);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test (expected=UnsupportedOperationException.class)
	public void testInvalidStartTime_Case7() {
		ntc.setStartTime(1160);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test (expected=UnsupportedOperationException.class)
	public void testInvalidStartTime_Case8() {
		ntc.setStartTime(1161);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test (expected=UnsupportedOperationException.class)
	public void testInvalidStartTime_Case9() {
		ntc.setStartTime(799);
		ntc.setDuration(-5);
		ntc.computeCharge();
	}
	
	//=============== INVALID DURATION ===============
	
	@Test (expected=UnsupportedOperationException.class)
	public void testInvalidDuration_Case1() {
		ntc.setStartTime(1800);
		ntc.setDuration(0);
		ntc.computeCharge();
	}
	
	@Test (expected=UnsupportedOperationException.class)
	public void testInvalidDuration_Case2() {
		ntc.setStartTime(1801);
		ntc.setDuration(-1);
		ntc.computeCharge();
	}
	
	//=== DISCOUNTED STARTTIME & DISCOUNTED DURATION ===
	@Test
	public void testDiscountedStartTimeAndDuration_Case1() {
		ntc.setStartTime(500);
		ntc.setDuration(100);
		System.out.println("Discounted StartTime & Duration: " + ntc.computeCharge());
	}
	
	@Test
	public void testDiscountedStartTimeAndDuration_Case2() {
		ntc.setStartTime(759);
		ntc.setDuration(100);
		System.out.println("Discounted StartTime & Duration: " + ntc.computeCharge());
	}
	
	@Test
	public void testDiscountedStartTimeAndDuration_Case3() {
		ntc.setStartTime(1959);
		ntc.setDuration(100);
		System.out.println("Discounted StartTime & Duration: " + ntc.computeCharge());
	}
	
	@Test
	public void testDiscountedStartTimeAndDuration_Case4() {
		ntc.setStartTime(2359);
		ntc.setDuration(100);
		System.out.println("Discounted StartTime & Duration: " + ntc.computeCharge());
	}
	
	//=========== DISCOUNTED STARTTIME ONLY ============
	@Test
	public void testDiscountedStartTimeOnly_Case1() {
		ntc.setStartTime(0);
		ntc.setDuration(60);
		System.out.println("Discounted StartTime Only: " + ntc.computeCharge());
	}
	
	@Test
	public void testDiscountedStartTimeOnly_Case2() {
		ntc.setStartTime(400);
		ntc.setDuration(59);
		System.out.println("Discounted StartTime Only: " + ntc.computeCharge());
	}
	
	@Test
	public void testDiscountedStartTimeOnly_Case3() {
		ntc.setStartTime(759);
		ntc.setDuration(1);
		System.out.println("Discounted StartTime Only: " + ntc.computeCharge());
	}
	
	@Test
	public void testDiscountedStartTimeOnly_Case4() {
		ntc.setStartTime(1800);
		ntc.setDuration(10);
		System.out.println("Discounted StartTime Only: " + ntc.computeCharge());
	}
	
	@Test
	public void testDiscountedStartTimeOnly_Case5() {
		ntc.setStartTime(1801);
		ntc.setDuration(10);
		System.out.println("Discounted StartTime Only: " + ntc.computeCharge());
	}
	
	@Test
	public void testDiscountedStartTimeOnly_Case6() {
		ntc.setStartTime(2359);
		ntc.setDuration(10);
		System.out.println("Discounted StartTime Only: " + ntc.computeCharge());
	}
	//============ DISCOUNTED DURATION ONLY ============
	@Test
	public void testDiscountedDurationOnly_Case1() {
		ntc.setStartTime(800);
		ntc.setDuration(65);
		System.out.println("Discounted Duration Only: " + ntc.computeCharge());
	}
	
	@Test
	public void testDiscountedDurationOnly_Case2() {
		ntc.setStartTime(900);
		ntc.setDuration(61);
		System.out.println("Discounted Duration Only: " + ntc.computeCharge());
	}
	//================== NO DISCOUNTS ==================
	@Test
	public void testNoDiscounts_Case1() {
		ntc.setStartTime(1000);
		ntc.setDuration(40);
		System.out.println("No Discounts: " + ntc.computeCharge());
	}
	
	@Test
	public void testNoDiscounts_Case2() {
		ntc.setStartTime(800);
		ntc.setDuration(1);
		System.out.println("No Discounts: " + ntc.computeCharge());
	}
	
	@Test
	public void testNoDiscounts_Case3() {
		ntc.setStartTime(801);
		ntc.setDuration(59);
		System.out.println("No Discounts: " + ntc.computeCharge());
	}
	
	@Test
	public void testNoDiscounts_Case4() {
		ntc.setStartTime(1759);
		ntc.setDuration(60);
		System.out.println("No Discounts: " + ntc.computeCharge());
	}
	
}