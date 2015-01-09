package org.gradle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ReponseBisTest {

	QuestionBis q;
	
	@Before
	public void setUp() throws Exception {
		q = new QuestionBis("Es-tu beau?", "Non");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testVerif() {
		assert(q.getReponse().equals("Non") == true);
		assert(!(q.getReponse().equals("Non")) == false);
	}
	

}
