class main {
	public static void main(String[] args) {
	
		santapan s = new santapan();
		makanan ma = new makanan();
		minuman mi = new minuman();
		cemilan ce = new cemilan();
		
		s.cerna(ma);
		s.cerna(mi);
		s.cerna(ce);
	}
}