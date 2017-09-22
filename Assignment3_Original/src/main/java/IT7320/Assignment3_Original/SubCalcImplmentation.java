package IT7320.Assignment3_Original;

public class SubCalcImplmentation {
	
	CalcInterface intObj;
	public int subTwoNums(int c, int d)
	{
		return intObj.sub(c,d);
	}
	
	public void setIntObj(CalcInterface intObj) {
		this.intObj = intObj;
	}

}



