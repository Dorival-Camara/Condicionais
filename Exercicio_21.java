import java.util.Scanner;

public class Exercicio_21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nomeSala = new String[3];
        String[] espetaculos = new String[3];
        double[] precoInteiro = new double[3];
        char[][][] cadeiras = new char[3][12][12];
        char[] letras = {'A','B','C','D','E','F','G','H','I','J','K','L'};
        double[] tabelaPreco = {100.0, 120.0, 200.0};
        String[] titulosExercicios = {
        "Par ou Ímpar", 
        "Maior de Dois Números", 
        "Aprovação Escolar", 
        "Classificação de Temperatura", 
        "Calculadora Simples com Switch", 
        "Ano Bissexto", "Triângulo Válido", 
        "IMC", "Dia da Semana com Switch", 
        "Positivo, Negativo ou Zero", 
        "Ingresso de Cinema", 
        "Nota por Conceito", 
        "Estação do Ano com Switch", 
        "Maior de Três Números", 
        "Verificador de Login", 
        "Múltiplo de 3 e 5", 
        "Desconto em Compra", 
        "Número Romano com Switch", 
        "Velocidade e Multa", 
        "Jogo Pedra, Papel e Tesoura"
    };

        String[] enunciadoExercicios = {
        "Leia um número inteiro e informe se ele é par ou ímpar. Obrigatório: use o operador ternário para exibir a mensagem.",
        "Leia dois números inteiros e exiba qual é o maior. Obrigatório: use o operador ternário para determinar e exibir o maior.",
        "Leia a média de um aluno (0 a 10) e exiba: ...Aprovado... se média >= 7 ...Recuperação... se média >= 5 e < 7 ...Reprovado... se média < 5",
        "Leia a temperatura em graus Celsius e classifique: Abaixo de 15°C → ...Frio... Entre 15°C e 25°C → ...Agradável... Acima de 25°C → ...Quente... Desafio: tente usar o ternário aninhado para classificar.",
        "Leia dois números e um operador (+, -, *, /) e realize a operação correspondente usando switch. Trate a divisão por zero.",
        "Leia um ano e informe se ele é bissexto ou não.",
        "Leia três lados e verifique se formam um triângulo válido. Se sim, classifique como equilátero, isósceles ou escaleno.",
        "Leia o peso (kg) e a altura (m) de uma pessoa, calcule o IMC (peso / altura²) e classifique: IMC < 18.5 → ...Abaixo do peso... 18.5 ≤ IMC < 25 → ...Peso normal... 25 ≤ IMC < 30 → ...Sobrepeso... IMC ≥ 30 → ...Obesidade... Desafio: use o ternário para exibir se o IMC está ...dentro... ou ...fora... da faixa saudável.",
        "Leia um número de 1 a 7 e exiba o nome do dia da semana correspondente usando switch. Para qualquer outro número, exiba ...Dia inválido....",
        "Leia um número e informe se é positivo, negativo ou zero. Obrigatório: use o operador ternário aninhado.",
        "Uma sala de cinema cobra: Menores de 12 anos: R$ 10,00 Entre 12 e 60 anos: R$ 20,00 Acima de 60 anos: R$ 10,00 (meia) Leia a idade e exiba o valor do ingresso.",
        "Leia uma nota (0-10) e exiba o conceito: 9 a 10 → ...A... 7 a 8 → ...B... 5 a 6 → ...C... 0 a 4 → ...D...",
        "Leia o número do mês (1-12) e exiba a estação do ano correspondente (considere o hemisfério sul).",
        "Leia três números inteiros e exiba qual é o maior entre os três. Trate o caso de empate.",
        "Defina um usuário e senha fixos no código. Leia o usuário e a senha digitados e exiba ...Acesso permitido... ou ...Acesso negado.... Obrigatório: use o operador ternário para exibir a mensagem.",
        "Leia um número inteiro e informe: Se é múltiplo de 3 e de 5 simultaneamente Se é múltiplo apenas de 3 Se é múltiplo apenas de 5 Se não é múltiplo de nenhum Desafio: use o ternário onde for possível.",
        "Uma loja dá desconto conforme o valor da compra: Acima de R$ 500 → 20% de desconto Entre R$ 200 e R$ 500 → 10% de desconto Abaixo de R$ 200 → sem desconto Leia o valor e exiba o valor final após o desconto.",
        "Leia um número de 1 a 10 e exiba seu equivalente em algarismo romano usando switch.",
        "Leia a velocidade de um veículo e o limite da via. Classifique: Dentro do limite → ...Sem multa... Até 20% acima → ...Multa leve... Entre 20% e 50% acima → ...Multa grave... Acima de 50% → ...Multa gravíssima + suspensão...",
        "Leia a escolha de dois jogadores (...pedra..., ...papel... ou ...tesoura...) e determine quem venceu ou se houve empate usando if/else encadeado. Desafio: use o operador ternário para exibir o resultado final (...Jogador 1 venceu..., ...Jogador 2 venceu... ou ...Empate...)."
    };

        int totalSala = 0;
        int salaSelecionada = -1;
        int opcao;

        for (int s = 0; s < 3; s++) {
            for (int i = 0; i < 12; i++) {
                for (int c = 0; c < 12; c++) {
                    cadeiras[s][i][c] = 'L';
                }
            }
        }

        do {
            System.out.println("\n---------------------------");
            System.out.println("Seja bem-vindo ao teatro");
            System.out.println("---------------------------");
            System.out.println("1 - Cadastro de sala");
            System.out.println("2 - Selecionar sala");
            System.out.println("3 - Exibir mapa da plateia");
            System.out.println("4 - Reservar assento");
            System.out.println("5 - Comprar assento");
            System.out.println("6 - Cancelar reserva");
            System.out.println("7 - Relatório financeiro");
            System.out.println("8 - Lista de Exercícios");
            System.out.println("0 - Finalizar");
            System.out.print("\nDigite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    if (totalSala >= 3) {
                        System.out.println("Limite de salas atingido!");
                    } else {
                        scanner.nextLine();

                        System.out.print("Digite o nome da sala: ");
                        nomeSala[totalSala] = scanner.nextLine();

                        System.out.print("Digite o nome do espetáculo: ");
                        espetaculos[totalSala] = scanner.nextLine();

                        precoInteiro[totalSala] = tabelaPreco[totalSala];

                        System.out.println("Preço da sala: R$ " + precoInteiro[totalSala]);

                        totalSala++;
                        System.out.println("Sala cadastrada com sucesso!");
                    }
                    break;

                case 2:
                    if (totalSala == 0) {
                        System.out.println("Cadastre a sala primeiro!");
                    } else {
                        System.out.println("\nSalas cadastradas:");
                        for (int i = 0; i < totalSala; i++) {
                            System.out.println(i + " - " + nomeSala[i]);
                        }

                        System.out.print("Escolha a sala: ");
                        int escolha = scanner.nextInt();

                        if (escolha >= 0 && escolha < totalSala) {
                            salaSelecionada = escolha;
                            System.out.println("Sala selecionada!");
                        } else {
                            System.out.println("Sala inválida!");
                        }
                    }
                    break;

                case 3:
                    if (salaSelecionada == -1) {
                        System.out.println("Selecione uma sala primeiro!");
                    } else {
                        int livres = 0;
                        int reservadas = 0;
                        int ocupadas = 0;

                        System.out.println("\nSALA: " + nomeSala[salaSelecionada]);
                        System.out.println("ESPETÁCULO: " + espetaculos[salaSelecionada]);
                        System.out.println("Inteira: R$ " + precoInteiro[salaSelecionada] +
                                " | Meia: R$ " + (precoInteiro[salaSelecionada] / 2));

                        System.out.println("   1  2  3  4  5  6  7  8  9 10 11 12");

                        for (int i = 0; i < 12; i++) {
                            System.out.print(letras[i] + " ");

                            for (int c = 0; c < 12; c++) {
                                char estado = cadeiras[salaSelecionada][i][c];

                                if (estado == 'L') {
                                    System.out.print("[ ]");
                                    livres++;
                                } else if (estado == 'R') {
                                    System.out.print("[R]");
                                    reservadas++;
                                } else {
                                    System.out.print("[X]");
                                    ocupadas++;
                                }
                            }
                            System.out.println();
                        }

                        System.out.println("Livres: " + livres + " | Reservadas: " + reservadas + " | Ocupadas: " + ocupadas);
                    }
                    break;

                case 4:
                    if (salaSelecionada == -1) {
                        System.out.println("Selecione uma sala primeiro!");
                    } else {
                        System.out.print("Linha (A-L): ");
                        char linha = scanner.next().toUpperCase().charAt(0);

                        System.out.print("Coluna (1-12): ");
                        int coluna = scanner.nextInt();

                        int l = linha - 'A';
                        int c = coluna - 1;

                        if (l < 0 || l >= 12 || c < 0 || c >= 12) {
                            System.out.println("Posição inválida!");
                        } else {
                            if (cadeiras[salaSelecionada][l][c] == 'L') { 
                                cadeiras[salaSelecionada][l][c] = 'R';
                                double valor = precoInteiro[salaSelecionada] / 2;
                                System.out.println("Reservado! Valor: R$ " + valor);
                            } else {
                                System.out.println("Assento indisponível!");
                            }
                        }
                    }
                    break;

                case 5:
                    if (salaSelecionada == -1) {
                        System.out.println("Selecione uma sala primeiro!");
                    } else {
                        System.out.print("Linha (A-L): ");
                        char linha = scanner.next().toUpperCase().charAt(0);

                        System.out.print("Coluna (1-12): ");
                        int coluna = scanner.nextInt();

                        int l = linha - 'A';
                        int c = coluna - 1;

                        if (l < 0 || l >= 12 || c < 0 || c >= 12) {
                            System.out.println("Posição inválida!");
                        } else {
                            char estado = cadeiras[salaSelecionada][l][c];

                            if (estado == 'L') {
                                cadeiras[salaSelecionada][l][c] = 'X';
                                System.out.println("Compra: R$ " + precoInteiro[salaSelecionada]);
                            } else if (estado == 'R') {
                                cadeiras[salaSelecionada][l][c] = 'X';
                                System.out.println("Pagou restante: R$ " + (precoInteiro[salaSelecionada] / 2));
                            } else {
                                System.out.println("Já está ocupada!");
                            }
                        }
                    }
                    break;

                case 6:
                    if (salaSelecionada == -1) {
                        System.out.println("Selecione uma sala primeiro!");
                    } else {
                        System.out.print("Linha (A-L): ");
                        char linha = scanner.next().toUpperCase().charAt(0);

                        System.out.print("Coluna (1-12): ");
                        int coluna = scanner.nextInt();

                        int l = linha - 'A';
                        int c = coluna - 1;

                        if (l < 0 || l >= 12 || c < 0 || c >= 12) {
                            System.out.println("Posição inválida!");
                        } else {
                            if (cadeiras[salaSelecionada][l][c] == 'R') {
                                cadeiras[salaSelecionada][l][c] = 'L';
                                System.out.println("Reembolso: R$ " + (precoInteiro[salaSelecionada] / 2));
                            } else {
                                System.out.println("Não é possível cancelar!");
                            }
                        }
                    }
                    break;

                case 7:
                    if (salaSelecionada == -1) {
                        System.out.println("Selecione uma sala primeiro!");
                    } else {
                        int livres = 0;
                        int reservadas = 0;
                        int ocupadas = 0;

                        for (int i = 0; i < 12; i++) {
                            for (int c = 0; c < 12; c++) {
                                char estado = cadeiras[salaSelecionada][i][c];

                                if (estado == 'L') {
                                    livres++;
                                } else if (estado == 'R') {
                                    reservadas++;
                                } else {
                                    ocupadas++;
                                }
                            }
                        }

                        double valor = precoInteiro[salaSelecionada];

                        System.out.println("\nRELATÓRIO");
                        System.out.println("Livres: " + livres);
                        System.out.println("Reservadas: " + reservadas);
                        System.out.println("Ocupadas: " + ocupadas);
                        System.out.println("Arrecadado: R$ " + (ocupadas * valor));
                        System.out.println("Reservas: R$ " + (reservadas * (valor / 2)));
                        System.out.println("Potencial: R$ " + (144 * valor));
                    }
                    break;

                case 8: 
                        int paginaAtual = 0;
                        int itensPorPagina = 7;
                        int totalExercicios = 20;
                        int totalPaginas = (int) Math.ceil((double) totalExercicios / itensPorPagina);

                        String opcaoExercicio;

                        do {
                            int inicio = paginaAtual * itensPorPagina;
                            int fim = Math.min(inicio + itensPorPagina, totalExercicios);

                            System.out.println("\n-----------------------------");
                            System.out.println("LISTA DE EXERCÍCIOS");
                            System.out.println("-----------------------------");
                            System.out.println("Página " + (paginaAtual + 1) + " de " + totalPaginas);

                            for (int i = inicio; i < fim; i++) {
                                System.out.println((i + 1) + " - " + titulosExercicios[i]);
                            }

                            System.out.println("\nOpções:");
                            if (paginaAtual > 0) {
                                System.out.println("A - Página anterior");
                            }
                            if (paginaAtual < totalPaginas - 1) {
                                System.out.println("P - Próxima página");
                            }
                            System.out.println("V - Voltar");
                            System.out.print("Escolha uma opção ou número do exercício: ");
                            opcaoExercicio = scanner.next();

                            if (opcaoExercicio.equalsIgnoreCase("A")) {
                                if (paginaAtual > 0) {
                                    paginaAtual--;
                                }
                            } 
                            else if (opcaoExercicio.equalsIgnoreCase("P")) {
                                if (paginaAtual < totalPaginas - 1) {
                                    paginaAtual++;
                                }
                            } 
                            else if (opcaoExercicio.equalsIgnoreCase("V")) {
                                System.out.println("Voltando ao menu principal...");
                            } 
                            else {
                                int numero = Integer.parseInt(opcaoExercicio);

                                if (numero >= 1 && numero <= 20) {
                                    System.out.println("\n-----------------------------");
                                    System.out.println("EXERCÍCIO " + numero);
                                    System.out.println("-----------------------------");
                                    System.out.println("Título: " + titulosExercicios[numero - 1]);
                                    System.out.println("Enunciado: " + enunciadoExercicios[numero - 1]);
                                    System.out.println("\nDigite qualquer tecla para voltar...");
                                    scanner.next();
                                } 
                                else {
                                    System.out.println("Número inválido!");
                                }
                            }

                        } while (!opcaoExercicio.equalsIgnoreCase("V"));
                    break;      

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}