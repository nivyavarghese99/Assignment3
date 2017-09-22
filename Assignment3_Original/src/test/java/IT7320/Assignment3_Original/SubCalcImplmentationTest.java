package IT7320.Assignment3_Original;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import junit.framework.TestCase;

public class SubCalcImplmentationTest extends TestCase {
	SubCalcImplmentation obj;
	int x, y;

	protected void setUp() throws Exception {
		obj = new SubCalcImplmentation();
		x=7;
		y=4;
		CalcInterface mockObj = mock(CalcInterface.class);
		when(mockObj.sub(x, y)).thenReturn(x-y);
		obj.setIntObj(mockObj);
		
	}

	protected void tearDown() throws Exception {
		obj = null;
		x = 0;
		y = 0;
	
		
	}

	public void testSubTwoNums() {
		assertEquals(3, obj.subTwoNums(x,y));
		
		
		
	}

	

}
