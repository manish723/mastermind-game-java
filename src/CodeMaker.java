public class CodeMaker {

	private Code secretCode;

	public Code getSecretCode() {
		return secretCode;
	}

	public void setSecretCode(Code secretCode) {
		this.secretCode = secretCode;
	}

	public CodeMaker() {
		secretCode = new Code();
	}

	public void genSecretCode() {
		
		if (secretCode == null)
			secretCode = new Code();
		secretCode.genRandomCode();
		while(secretCode.hasDuplicatedPegs()) {
			secretCode.genRandomCode();
		}
	}

}
