package VideoPoker;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Teste
		String[] k = args;
		String[] a= new String[2],b= new String[2],c= new String[2],d= new String[2],e= new String[2],f= new String[2],g= new String[2],h = new String[2];
		Deck deck = new Deck(8);
		a[0] = "4";
		a[1] = "H";
		b[0] = "4";
		b[1] = "H";
		c[0] = "4";
		c[1] = "H";
		d[0] = "4";
		d[1] = "H";
		e[0] = "4";
		e[1] = "H";
		f[0] = "4";
		f[1] = "H";
		g[0] = "4";
		g[1] = "H";
		h[0] = "4";
		h[1] = "H";
	
		deck.insertNewCard(a);
		deck.insertNewCard(b);
		deck.insertNewCard(c);
		deck.insertNewCard(d);
		deck.insertNewCard(e);
		deck.insertNewCard(f);
		deck.insertNewCard(g);
		deck.insertNewCard(h);
		deck.printDeck();

	}

}
