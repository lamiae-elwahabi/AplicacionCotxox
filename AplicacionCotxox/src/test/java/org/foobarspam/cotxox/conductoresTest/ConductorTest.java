package org.foobarspam.cotxox.conductoresTest;

import static org.junit.Assert.*;

import org.foobarspam.cotxox.conductores.Conductor;
import org.junit.Test;

public class ConductorTest {

	@Test
	public void testConductorSam() {
		Conductor conductor = new Conductor("Samantha");
	}
	
	@Test
	public void TestConductorFox() {
		Conductor conductor = new Conductor("Fox");
	}

}
