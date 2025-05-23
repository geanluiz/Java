package classes.carro;

public class Class {

    public static void main(String[] args) {

        // Cria nova instância
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
 * public, disponível a todo projeto
 * protected, disponível dentro do package(pasta), classe e subclasses
 * default, disponível dentro do mesmo package
 * private, somente dentro da mesma classe (não visível mesmo no mesmo arquivo)
 */