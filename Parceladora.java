public interface Parceladora {

	// todo atributo da interface eh public static final, 
	// mesmo se nao for explicitamente declarado 
	// String CONSTANTE = "";

	// os métodos da interface sao publicos e abstratos,
	// mesmo se nao for explicitamente declarado 
	/* public abstract */ PlanoDePagamento parcela(Produto produto);

}
