public class Poupanca
{

    private int anos;
    private double juros;
    private double deposito;

    public Poupanca(int a, double j, double dm) {

        anos = a;
        juros = j/100;
        deposito = dm;
    }

   

    public double calculaTotal() {
        int num_pagamentos = anos * 12;
        double total = 0;

        for (int i = 0; i < num_pagamentos; i++) {
            total = total + deposito;
            total = total + total * juros;
        }

        return total;
    }

   

    public String toString() {
             return "Anos: " + anos + "\nJuros: " + juros
                 + "\nDepósito mensal: " + deposito;

    }

}