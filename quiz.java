package p2;

import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int acertos = 0;

        cabecalho cabecalho1 = new cabecalho();

        cabecalho.Faculdade = "Faculdade: Faculdade Alfredo Nasser";
        cabecalho.Aluno = "Aluno: ana carolina carmo dos santos";
        cabecalho.Professor = "Professor: Brenno Pimenta";
        cabecalho.Disciplina = "Disciplina: Algoritmo e Programaçao II";
        cabecalho.Inicio = "Bem-vindo ao Quiz";
        cabecalho1.escrevaCabecalho();


        questoes questoes1 = new questoes();
        questoes1.questoes1 = "1- Quem descobriu o Brasil?";
        questoes1.A = "A) Pedro Alvares Cabral";
        questoes1.B = "B) Vicente Yanez Pizon";
        questoes1.C = "C) Socrates";
        questoes1.D = "D) Santo Agostinho ";
        questoes1.E = "E) Guilherme de Occam";
        questoes1.escrevaquestao();
        questoes1.correta = "A";
        System.out.println("Digite a alternativa correta: ");
        String resposta = sc.nextLine();
        if (questoes1.iscorreta(resposta)) {
            acertos = acertos + 1;
            System.out.println("ACERTOS: " + acertos);

            System.out.println("====================================================================== ");

        }

        questoes questoes2 = new questoes();
        questoes2.questoes = "2- Qual ultimo placar do jogo do Brasil?";
        questoes2.A = "A) Brasil 0x0 Argentina";
        questoes2.B = "B) Brasil 7x1 Argentina";
        questoes2.C = "C) Brasil 0x1 Argentina";
        questoes2.D = "D) Brasil 0x7 Argentina";
        questoes2.E = "E) Nenhuma das Anteriores";
        questoes2.escrevaquestao();
        questoes2.correta = "C";
        System.out.println("Digite a alternativa correta: ");
        resposta = sc.nextLine();
        if (questoes2.iscorreta(resposta)) {
            acertos = acertos + 1;
        }
        System.out.println("ACERTOS: " + acertos);

        System.out.println("====================================================================== ");


        questoes questoes3 = new questoes();
        questoes3.questoes = "3- Qual carro que indica que vai chover?";
        questoes3.A = "A) Corolla branco";
        questoes3.B = "B) Celta Preto";
        questoes3.C = "C) Creta Roxo";
        questoes3.D = "D) Fusca Azul";
        questoes3.E = "E) Brasilia Verde";
        questoes3.escrevaquestao();
        questoes3.correta = "B";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes3.iscorreta(resposta)) {
            acertos = acertos + 1;
        }

        System.out.println("ACERTOS: " + acertos);

        System.out.println("====================================================================== ");
        questoes questoes4 = new questoes();
        questoes4.questoes = "4- Qual nome do cantor GUSTTAVO LIMA?";
        questoes4.A = "A) Gustavo";
        questoes4.B = "B) Nielson";
        questoes4.C = "C) Antonio";
        questoes4.D = "D) João";
        questoes4.E = "E) Nivaldo";
        questoes4.escrevaquestao();
        questoes4.correta = "E";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes4.iscorreta(resposta)) {
            acertos = acertos + 1;
        }

        System.out.println("ACERTOS: " + acertos);

        System.out.println("====================================================================== ");

        questoes questoes5 = new questoes();
        questoes5.questoes = "5- qual é o maior estadio do Brasil";
        questoes5.A = "A)  arena neo quimica";
        questoes5.B = "B) alias parque";
        questoes5.C = "C) maracanã";
        questoes5.D = "D)  arena do gremio";
        questoes5.E = "E) Mangueirão";
        questoes5.escrevaquestao();
        questoes5.correta = "c";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes3.iscorreta(resposta)) {
            acertos = acertos + 1;
        }

        System.out.println("ACERTOS: " + acertos);

        System.out.println("====================================================================== ");

        questoes questoes6 = new questoes();
        questoes6.questoes = "6- qual é o maior estadio do Brasil";
        questoes6.A = "A)  arena neo quimica";
        questoes6.B = "B) alias parque";
        questoes6.C = "C) maracanã";
        questoes6.D = "D)  arena do gremio";
        questoes6.E = "E) Mangueirão";
        questoes6.escrevaquestao();
        questoes6.correta = "c";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes3.iscorreta(resposta)) {
            acertos = acertos + 1;
        }

        System.out.println("ACERTOS: " + acertos);

        System.out.println("====================================================================== ");

        questoes questoes7 = new questoes();
        questoes7.questoes = "7-Normalmente, quantos litros de sangue uma pessoa tem? Em média, quantos são retirados numa doação de sangue?";
        questoes7.A = "A)  Tem entre 2 a 4 litros. São retirados 450 mililitros";
        questoes7.B = "B) Tem entre 4 a 6 litros. São retirados 450 mililitros";
        questoes7.C = "C) Tem 10 litros. São retirados 2 litros";
        questoes7.D = "D)  Tem 7 litros. São retirados 1,5 litros";
        questoes7.E = "E) Tem 0,5 litros. São retirados 0,5 litros";
        questoes7.escrevaquestao();
        questoes7.correta = "b";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes3.iscorreta(resposta)) {
            acertos = acertos + 1;
        }

        System.out.println("ACERTOS: " + acertos);

        System.out.println("====================================================================== ");


        questoes questoes8 = new questoes();
        questoes8.questoes = "De quem é a famosa frase “Penso, logo existo";
        questoes8.A = "A)  Platão";
        questoes8.B = "B)  Galileu Galilei";
        questoes8.C = "C) Descartes";
        questoes8.D = "D)  Sócrates";
        questoes8.E = "E)  Francis Bacon";
        questoes8.escrevaquestao();
        questoes8.correta = "c";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes3.iscorreta(resposta)) {
            acertos = acertos + 1;
        }

        System.out.println("ACERTOS: " + acertos);

        System.out.println("====================================================================== ");


        questoes questoes9 = new questoes();
        questoes9.questoes = "De onde é a invenção do chuveiro elétrico";
        questoes9.A = "A)  França";
        questoes9.B = "B)  Inglaterra";
        questoes9.C = "C)  Brasil";
        questoes9.D = "D)  Austrália";
        questoes9.E = "E)   Itália";
        questoes9.escrevaquestao();
        questoes9.correta = "c";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes3.iscorreta(resposta)) {
            acertos = acertos + 1;
        }

        System.out.println("ACERTOS: " + acertos);

        System.out.println("====================================================================== ");


        questoes questoes10 = new questoes();
        questoes10.questoes = "Quais o menor e o maior país do mundo";
        questoes10.A = "A)  Vaticano e Rússia";
        questoes10.B = "B)   Nauru e China";
        questoes10.C = "C) Mônaco e Canadá";
        questoes10.D = "D)  Malta e Estados Unidos";
        questoes10.E = "E)   São Marino e Índia";
        questoes10.escrevaquestao();
        questoes10.correta = "a";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes3.iscorreta(resposta)) {
            acertos = acertos + 1;
        }

        System.out.println("ACERTOS: " + acertos);

        System.out.println("====================================================================== ");

        questoes questoes11 = new questoes();
        questoes11.questoes = "Qual o livro mais vendido no mundo a seguir à Bíblia";
        questoes11.A = "A)  O Senhor dos Anéis";
        questoes11.B = "B)   Dom Quixote";
        questoes11.C = "C)  O Pequeno Príncipe";
        questoes11.D = "D)  Ela, a Feiticeira";
        questoes11.E = "E)    Um Conto de Duas Cidades";
        questoes11.escrevaquestao();
        questoes11.correta = "b";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes3.iscorreta(resposta)) {
            acertos = acertos + 1;
        }

        System.out.println("ACERTOS: " + acertos);

        System.out.println("====================================================================== ");

        questoes questoes12 = new questoes();
        questoes12.questoes = "Quantas casas decimais tem o número pi";
        questoes12.A = "A)  Duas";
        questoes12.B = "B)  Centenas";
        questoes12.C = "C)  Infinitas";
        questoes12.D = "D)  Vinte";
        questoes12.E = "E)  Milhares";
        questoes12.escrevaquestao();
        questoes12.correta = "c";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes3.iscorreta(resposta)) {
            acertos = acertos + 1;
        }

        System.out.println("ACERTOS: " + acertos);

        System.out.println("====================================================================== ");

        questoes questoes13 = new questoes();
        questoes13.questoes = " Atualmente, quantos elementos químicos a tabela periódica possui";
        questoes13.A = "A)  113";
        questoes13.B = "B)  109";
        questoes13.C = "C)  108";
        questoes13.D = "D) 118";
        questoes13.E = "E)  92";
        questoes13.escrevaquestao();
        questoes13.correta = "d";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes3.iscorreta(resposta)) {
            acertos = acertos + 1;
        }

        System.out.println("ACERTOS: " + acertos);

        System.out.println("====================================================================== ");


        questoes questoes14 = new questoes();
        questoes14.questoes = " O que a palavra legend significa em português";
        questoes14.A = "A)   Legenda";
        questoes14.B = "B)  Conto";
        questoes14.C = "C) História";
        questoes14.D = "D)Lenda";
        questoes14.E = "E)  Legendário";
        questoes14.escrevaquestao();
        questoes14.correta = "d";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes3.iscorreta(resposta)) {
            acertos = acertos + 1;
        }

        System.out.println("ACERTOS: " + acertos);

        System.out.println("====================================================================== ");


        questoes questoes15 = new questoes();
        questoes15.questoes = "  Qual o número mínimo de jogadores em cada time numa partida de futebol";
        questoes15.A = "A)   8";
        questoes15.B = "B)  10";
        questoes15.C = "C) 9";
        questoes15.D = "D)5";
        questoes15.E = "E)  7";
        questoes15.escrevaquestao();
        questoes15.correta = "e";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes3.iscorreta(resposta)) {
            acertos = acertos + 1;
        }

        System.out.println("ACERTOS: " + acertos);

        System.out.println("====================================================================== ");





























    }
}





































