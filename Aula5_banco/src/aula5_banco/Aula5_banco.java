package aula5_banco;
public class Aula5_banco {
   
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.depositar(500);
        p1.sacar(50);
        p1.estadoAtual();
    }
    
}
