public class ParceladoraCheque implements Parceladora /*  pode implementar mais interfaces, separando por virgula*/{

        private double juros = 0.04;
        private int qtdeParcelas = 6;
        
        public PlanoDePagamento parcela(Produto produto){
            double valorParcela = produto.getPreco()/qtdeParcelas*(1+juros);
            PlanoDePagamento plano = new PlanoDePagamento("Cheque", qtdeParcelas, valorParcela);
                    return plano;
        }
        
    }

