## Desafio 1: Jogo do Adivinha

### Descrição

Este software é um jogo interativo, onde o usuário seleciona a dificuldade e um número e joga contra o computador. O intuito é descobrir 
se o seu número selecionado é o mesmo selecionado pelo computador.

### Funções
* Seleção de dificuldade: variando entre Fácil, Médio e Difícil o jogador pode escolher o nível de dificuldade;
* Seleção de número: o jogador seleciona um número para jogar contra o computador;
* Pontuação: o sistema soma os pontos com base no número de acertos e proximidade de acertos;
* Sistema de Rodadas: o usuário pode continuar jogando infinitas vezes até sua escolha de sair do jogo;
* Exibição de acertos e erros: O sistema exibe um status final com uma lista de números acertados e errados via  `System.out.println()`.

### Como funciona
O usuario executa o programa no Prompt de Comando e logo o jogo é iniciado. É perguntado a dificuldade selecionada e logo o palpite do 
jogador. O número é comparado com o número aleatório previamente selecionado pelo computador. Se os números coincidirem o jogador ganha 10 pontos,
5 em caso de um número a +1 ou -1 de distância ou 0 nos outros casos. O usuário então é convidado a escolher a continuar jogando ou sair da aplicação.
Logo em seguida é exibido um resumo geral da somatória da pontuação geral, incluindo duas listas: uma com os acertos e outra com os erros.

### Como Executar

* Salve o código `Main.java` que  está na pasta `src` .

* Abra uma nova janela no Prompt de Comando, navegue até o diretório onde o arquivo está salvo e digite comando `javac Main.java`. Pressione Enter.
* Por último digite `java Main`
