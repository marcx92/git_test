package Fase1;

class Rocket {
	
	private final String code;
	private int nProp;
	
	public Rocket(String code, int nProp)throws Exception {
		
        if (code.length() < 8) throw new Exception("Code must have at least 8 characters");
        if (nProp <= 0) throw new Exception("The number of propellers must be greater than O");
		this.code = code;
		this.nProp = nProp;		
	}

	public String getCode() {
		return code;
	}

	public int getnProp() {
		return nProp;
	}

		
	public void setnProp(int nProp) {
		this.nProp = nProp;
	}
		
}

