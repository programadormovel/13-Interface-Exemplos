public class ParceladoraBoleto implements Parceladora /*  pode implementar mais interfaces, separando por virgula*/{

	public PlanoDePagamento parcela(Produto produto){
		return new PlanoDePagamento("Boleto",3,produto.getPreco()/3*1.01);
	}

}
