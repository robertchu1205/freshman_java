package s103502548;

import static org.junit.Assert.*;

import java.awt.event.ActionEvent;

import org.junit.Test;

public class FPTest {

	@Test
	public void testFP() {
		FP fp = new FP();
		assertEquals(true,fp.d);
	}
	@Test
	public void testActionPerformed() {
			FP fp = new FP();
			ActionEvent e= new ActionEvent(fp, 0, null);
			fp.own.doClick();
			fp.actionPerformed(e);
			assertEquals(fp.x0,fp.v);
	}
	/*@Test
	public void testMain() {
		fail("Not yet implemented");
	}

	@Test
	public void testBacktoMenu() {
		fail("Not yet implemented");
	}*/

}
