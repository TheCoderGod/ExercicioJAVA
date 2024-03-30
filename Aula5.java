package aula5;

public class Aula5 {

    public static void main(String[] args) {
        contaBanco conta1 = new contaBanco(1, "cc", "Creusa", 500, false);
        conta1.setSaldo(500);
        conta1.abrirConta();
        conta1.sacar(100);
        conta1.situacao();
        
        contaBanco conta2 = new contaBanco(2, "cp", "Jubileu", 300, false);
        conta2.setSaldo(300);
        conta2.abrirConta();
        conta2.situacao();
    }
   
}
