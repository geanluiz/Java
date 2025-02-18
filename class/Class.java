public class Class {

    public static void main(String[] args) {

        // Cria nova isntância
        Carro novoCarro1 = new Carro("Fusca");

        Carro novoCarro2 = new Carro("Gol");

        Carro novoCarro3 = new Carro("Voyage");

        // Chama métodos dos objetos
        novoCarro1.acelerar();

        novoCarro2.acelerar();

        novoCarro3.acelerar();
    }
}

// Cria a classe
class Carro {

    // Atributo
    String modelo;

    // Construtor da classe
    public Carro(String modelo) {
        this.modelo = modelo;
    }

    // Método
    public void acelerar () {
        System.out.println("Acelerando " + this.modelo);
    }
}

/*
 * public, disponivel a todo projeto
 * default, disponível dentro do mesmo package(pasta)
 * private, somente dentro da mesma classe (não visível mesmo no mesmo arquivo)
 * protected, disponível dentro do package(pasta) ou arquivo
 */