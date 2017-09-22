package IT7320.Assignment3_Original;


import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class CalcImplementationTest extends TestCase {
	CalcImplementation obj;
	int x, y;

	protected void setUp() throws Exception {
		obj = new CalcImplementation();
		x=3;
		y=4;
		
		CalcInterface mockObj = mock(CalcInterface.class);
		when(mockObj.add(x, y)).thenReturn(x+y);
		obj.setIntObj(mockObj);
	
	}

	protected void tearDown() throws Exception {
		obj = null;
		x = 0;
		y = 0;
	
	}

	public void testAddTwoNums() {
		assertEquals(7,obj.addTwoNums(x,y));
	
	}

}
