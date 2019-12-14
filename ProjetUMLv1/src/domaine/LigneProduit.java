package domaine;

public class LigneProduit {

	int numProduit;
	int qte;
	String opt;
	int numLp;
	
	LigneProduit(int numP,int qt, String op,int numL){
		numProduit=numP;
		qte=qt;
		opt=op;
		numLp=numL;
	}
	public int getNumProduit() {
		return numProduit;
	}

	public void setNumProduit(int numProduit) {
		this.numProduit = numProduit;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public String getOpt() {
		return opt;
	}

	public void setOpt(String opt) {
		this.opt = opt;
	}

	public int getNumLp() {
		return numLp;
	}

	public void setNumLp(int numLp) {
		this.numLp = numLp;
	}

}
