public class Code {

	public static final int NumDistinctCode = 6;

	// The four pegs
	private int peg1;
	private int peg2;
	private int peg3;
	private int peg4;

	// Default constructor
	public Code() {
		setPeg1(0);
		setPeg2(0);
		setPeg3(0);
		setPeg4(0);
	}

	// A constructor that a Code object using four pegs
	public Code(int p1, int p2, int p3, int p4) {
		setPeg1(p1);
		setPeg2(p2);
		setPeg3(p3);
		setPeg4(p3);
	}
		
	// Generate a random code. The code may contain duplicated pegs.
	public void genRandomCode() {
		peg1 = (int) (Math.random() * Code.NumDistinctCode) + 1;
		peg2 = (int) (Math.random() * Code.NumDistinctCode) + 1;
		peg3 = (int) (Math.random() * Code.NumDistinctCode) + 1;
		peg4 = (int) (Math.random() * Code.NumDistinctCode) + 1;
	}

	// set the four pegs
	public void setPegs(int p1, int p2, int p3, int p4) {
		peg1 = p1;
		peg2 = p2;
		peg3 = p3;
		peg4 = p4;
	}

	// check if there is duplicated pegs in the code
	public boolean hasDuplicatedPegs() {
		return getPeg1() == getPeg2() || getPeg1() == getPeg3() || getPeg1() == getPeg4() || getPeg2() == getPeg3()
				|| getPeg2() == getPeg4() || getPeg3() == getPeg4();

	}

	// return true if the code of this object is the same as the code of c.
	// return false otherwise.
	public boolean compare(Code c) {
		return getPeg1() == c.getPeg1() && getPeg2() == c.getPeg2() && getPeg3() == c.getPeg3()
				&& getPeg4() == c.getPeg4();
	}

	// return the number of black key pegs by comparing this object and c.
	public int getNumBlackKeyPegs(Code c) {
		return (getPeg1() == c.getPeg1() ? 1 : 0) + (getPeg2() == c.getPeg2() ? 1 : 0)
				+ (getPeg3() == c.getPeg3() ? 1 : 0) + (getPeg4() == c.getPeg4() ? 1 : 0);
	}

	// return the number of white key pegs by comparing this object and c.
	public int getNumWhiteKeyPegs(Code c) {
		return (getPeg1() == c.getPeg2() ? 1 : 0) + (getPeg1() == c.getPeg3() ? 1 : 0)
				+ (getPeg1() == c.getPeg4() ? 1 : 0) + (getPeg2() == c.getPeg1() ? 1 : 0)
				+ (getPeg2() == c.getPeg3() ? 1 : 0) + (getPeg2() == c.getPeg4() ? 1 : 0)
				+ (getPeg3() == c.getPeg1() ? 1 : 0) + (getPeg3() == c.getPeg2() ? 1 : 0)
				+ (getPeg3() == c.getPeg4() ? 1 : 0) + (getPeg4() == c.getPeg1() ? 1 : 0)
				+ (getPeg4() == c.getPeg2() ? 1 : 0) + (getPeg4() == c.getPeg3() ? 1 : 0);
	}

	public void printCode() {
		System.out.println(peg1 + " " + peg2 + " " + peg3 + " " + peg4);
	}

	public int getPeg1() {
		return peg1;
	}

	public void setPeg1(int peg1) {
		this.peg1 = peg1;
	}

	public int getPeg2() {
		return peg2;
	}

	public void setPeg2(int peg2) {
		this.peg2 = peg2;
	}

	public int getPeg3() {
		return peg3;
	}

	public void setPeg3(int peg3) {
		this.peg3 = peg3;
	}

	public int getPeg4() {
		return peg4;
	}

	public void setPeg4(int peg4) {
		this.peg4 = peg4;
	}

}
