package IT7320.Assignment3_Original;

public class CalcImplementation {
	
	CalcInterface intObj;
	public int addTwoNums(int a, int b)
	{
		return intObj.add(a, b);
	}
	
	public void setIntObj(CalcInterface intObj) {
		this.intObj = intObj;
	}

}
