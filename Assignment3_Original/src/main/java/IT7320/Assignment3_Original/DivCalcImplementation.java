package IT7320.Assignment3_Original;

public class DivCalcImplementation {
	CalcInterface intObj;
	public int divTwoNums(int a, int b)
	{
		return intObj.add(a, b);
	}
	
	public void setIntObj(CalcInterface intObj) {
		this.intObj = intObj;
	}

}



