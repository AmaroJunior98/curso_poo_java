package aula03;

public class Conta {
    public int num_conta;
    private String nome;
    private double saldo;
    private double limite;
    private boolean status;
    protected boolean tipo;

    public Conta() {
        this.saldo = 0;
        this.status = false;
    
    }
    public void openAccount(){
        setTipo(t);
        setStatus(true);
        if (t == "CC")
            this.saldo = 50;
        else if (t == "CP")
            setSaldo(150);
            
    }
    public void closedAccount(){
        if (this.saldo > 0)
            System.out.println("Your account have money!!!");
        else if (this.saldo < 0)
            System.out.println("Your account dont have money!!!");
        else
            setStatus(false);
    }
    public void depositar(){


    }
    public void sacar(){


    }
    public void pagarConta(){


    }
    public int getNum_conta() {
        return num_conta;

    }
    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    
    }
    public String getNome() {
        return nome;

    }
    public void setNome(String nome) {
        this.nome = nome;
    
    }
    public void corrente() {
        this.tipo = false;

    }
    public void corrent() {
        this.tipo = true;
    
    }
    public void setStatus(boolean status){
        this.status = status;
    
    }
    public boolean getStatus(){
        return this.status;
    
    }
    public void setSaldo(double sal) {
        this.saldo = sal;
        
    }
    public double getSaldo(){
        return this.saldo;
    
    }
    public void setLimite(double limit){
        this.limite = limit;

    }
    public double getLimit(){
        return this.limite;

    }
}