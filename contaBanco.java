package aula5;

public class contaBanco {
    // ATRIBUINDO OS MÉTODOS
    public int numconta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    
    // INÍCIO GETTERS E SETTERS
    public int getNumconta() {
        return numconta;
    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    // FIM GETTERS E SETTERS
    
    
    // METODO CONSTRUTOR
    public contaBanco(int numconta, String tipo, String dono, float saldo, boolean status) {
        this.numconta = numconta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0;
        this.status = false;
    }
    // FIM METODO CONSTRUTOR
    
    
    // METODO ABRIRCONTA()
    public void abrirConta(){
        this.status = true; //Declarando a conta como aberta
        switch(tipo){ // ADICIONAR SALDO CONFORME O TIPO DA CONTA
            case "cc":
                this.saldo = this.saldo+50;
                break;
            case "cp":
                this.saldo = this.saldo+150;
                break;
        }
    } // FIM METODO ABRIRCONTA()
    
    
    // METODO FECHAR CONTA
    public void fecharConta(){
        if (this.saldo > 0){
            System.out.println("Ainda tem saldo! Saque para fechar a conta");
        }
        else{
            this.status = false; //Fechando a conta
        }
    
    } // FIM METODO FECHAR CONTA
    
    
    // METODO DEPOSITAR
    public void depositar(){
        if (this.status == false){
            System.out.println("Conta fechada!");
        }
        else{
            System.out.println("Pode depositar!");
        }
    } // FIM METODO DEPOSITAR
    
    
    // METODO SACAR
    public void sacar(int sacar){
        if (status == true) {
            if (saldo <= 0) {
                System.out.println("Saldo insuficiente");
            }
            else{
                saldo = this.saldo-sacar;
                if (saldo <= 0){
                    System.out.println("SALDO NEGATIVO!");
                }
            }
            
        }
        else{
            System.out.println("Conta fechada!");
        }
            
         } // FIM METODO SACAR
    
    
    // METODO PAGAR MENSAL
    public void pagarMensal(){
        if ("cc".equals(tipo)){
            if (saldo >= 12){
                this.saldo = saldo-12;
            }
            else{
                System.out.println("Saldo insuficiente!");
            }
                
        }
        
        if ("cp".equals(tipo)){
                if (saldo >= 20){
                    this.saldo = saldo-20;
                }
                else{
                System.out.println("Saldo insuficiente!");
                }
                  
            }
        } // FIM METODO PAGAR MENSAL 
    
    
        // EXIBINDO SITUACAO DA CONTA
        public void situacao(){
            System.out.println("Numero da conta: " + this.numconta);
            System.out.println("Tipo de conta: " + this.tipo);
            System.out.println("Dono da conta: " + this.dono);
            System.out.println("Saldo da conta: " + this.saldo);
            System.out.println("Status da conta: " + this.status);
        }
}
