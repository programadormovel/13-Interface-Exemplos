public class UsaProduto {

    public static void main(String[] args) {
        Produto tv = new Produto("Tv", 3500.0);
        tv.imprime();

	System.out.println("Imprimindo planos de pagamento");

	//uma interface nao pode ser instanciada
	//Parceladora parceladora = new Parceladora();

	//instanciando uma implementacao da interface Parceladora
        ParceladoraCartao parceladoraCartao = new ParceladoraCartao();
        PlanoDePagamento planoCartao = parceladoraCartao.parcela(tv);
        planoCartao.imprime();

	ParceladoraCheque parceladoraCheque = new ParceladoraCheque();
	PlanoDePagamento planoCheque = parceladoraCheque.parcela(tv);
	planoCheque.imprime();

	ParceladoraBoleto parceladoraBoleto = new ParceladoraBoleto();
	PlanoDePagamento planoBoleto = parceladoraBoleto.parcela(tv);
	planoBoleto.imprime();

    }
}
