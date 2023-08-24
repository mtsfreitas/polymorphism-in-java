# polymorphism-in-java

##1 
Crie uma classe Calculadora. Essa classe deve implementar as operações básicas (soma, subtração, divisão e multiplicação) entre dois números. Utilizando o conceito de herança, crie uma calculadora científica que implemente os seguintes cálculos: raiz quadrada e potência. Dica: utilize a classe Math do pacote java.lang. Crie uma classe de teste para utilizar os dois tipos de calculadoras para realização dos cálculos oferecidos.

## 2
Crie uma estrutura hierárquica que contenha as seguintes classes: Veiculo (classe abstrata), Bicicleta e Automóvel (essas duas últimas devem herdar de Veiculo). Os métodos da classe Veiculo são todos abstratos e possuem a seguinte assinatura:

public int getNumeroRodas();

public void acelerar(float velocidade);

public void parar();

Esses métodos são implementados nas subclasses Automóvel e Bicicleta. Acrescentar na classe Automóvel o método public void trocarOleo(), que atualiza a data da última troca de óleo para a data atual.

## 3 
Siga os passos abaixo para implementar uma hierarquia de figuras geométricas e a utilização de técnicas de polimorfismo:
-> Implemente uma classe abstrata com nome Forma onde são declarados dois métodos abstratos:

float calcularArea();

float cacularPerimetro();

String getTipo();

-> Crie, como subclasse de Forma, uma classe de nome Retangulo cujas instâncias são caracterizadas pelos atributos lado e altura, ambos do tipo float. Implemente na classe Retangulo os métodos herdados de Forma e outros que ache necessários.

-> Crie, como subclasse de Forma, uma classe de nome Circulo cujas instâncias são caracterizadas pelo atributo raio do tipo float. Implemente na classe Circulo os métodos herdados de Forma e outros que ache necessários. Dica: poderá recuperar o valor de Pi fazendo Math.Pi.

-> Crie, como subclasse de Retangulo, uma classe de nome Quadrado cujas instâncias são caracterizadas por terem os atributos lado e altura com o mesmo valor

-> Elabore um programa de teste onde é declarado um ArrayList do tipo Forma. Nesse ArrayList devem ser guardadas instâncias de Retangulo, Circulo e Quadrado. Crie diferentes formas e adicione ao ArrayList para testes. Depois implemente um laço que percorra o ArrayList chamando, relativamente a cada um dos objetos guardados, os métodos calcularArea e calcularPerimetro.

## 4
Escreva o jogo Pedra, Papel e Tesoura. Deverá conter uma interface Objeto que será implementada por Papel, Pedra e Tesoura. Deverá conter uma classe Jogo que ficará jogando o tempo todo. (Aqui vem o famoso: Objeto o1 = new Pedra();) Faça o computador escolher aleatoriamente que objetos ele irá escolher e vá imprimindo os resultados. Note que durante os confrontos o método que receber os dois objetos deverá receber duas coisas sem saber exatamente de que tipo é. Neste caso, usando os métodos específicos de cada um deverá fazer a comparação. Papel ganha de Pedra (envolve), Pedra ganha de tesoura (quebra) e Tesoura ganha de Papel (Corta).
