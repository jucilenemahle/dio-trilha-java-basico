public class Conta{
    private long numero;
    private long agencia;
    private String nomeCliente;
    private Double saldo ;

    public long getNumero(){
        return this.numero;
    }
    public long getAgencia(){
        return this.agencia;
    }

    public String getNomeCliente(){
        return this.nomeCliente;
    }

    public Double getSaldo(){
        return this.saldo;
    }

    public void setNumero(long numero){
        this.numero = numero;
    }

    public void setAgencia(long agencia){
        this.agencia = agencia;
    }

    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    public void atualizaSaldo(Double saldo){
        this.saldo =  saldo;
    }

    public String toString(){
        return "Olá " + this.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, "
             + "sua agência é " + this.getAgencia() + ", conta " + this.getNumero() 
             + " e seu saldo " + this.getSaldo() +" já está disponível para saque.";
    }

}