import java.util.Scanner;

public class Sprint1prog {
    public static void main(String[] args) {
        int dis;
        int posicao = 1, comando = 1;
        double valor = 0;
        String dir;
        Scanner sc = new Scanner(System.in);

        System.out.println("Regras:");
        System.out.println("\uF0E8 Direções inválidas resultam em encerramento imediato da partida:");
        System.out.println("\uF0E8 Distancias negativas resultam em encerramento imediato da partida");
        System.out.println("\uF0E8 Se o movimento leva o robô para fora dos limites do armazém o comando será invalidado");
        System.out.println("\uF0E8 Se o movimento leva o robô a colidir com uma prateleira o comando será invalidado");

        System.out.println("\uF0E8 Os sentidos permitos para movimetos são ‘Frente’, ‘Trás’, ‘Esquerda’ ou ‘Direita’");

        //movimento 1

        System.out.println("Comando n° " + comando);
        comando = comando + 1;
        System.out.println(" ");

        System.out.print("Digite o sentido do movimento: ");
        dir = sc.next();
        System.out.println(" ");

        if (!dir.equalsIgnoreCase("Direita") && !dir.equalsIgnoreCase("Esquerda") && !dir.equalsIgnoreCase("Frente") && !dir.equalsIgnoreCase("Trás")) {
            System.out.println("Direção inválida!!");
            System.out.println("Encerrando partida!!");
            System.exit(0);
        }

        System.out.print("Digite a distância a ser percorrida: ");
        dis = sc.nextInt();

        if (dis <= 0) {
            System.out.println("Distância inválida");
            System.out.println("Encerrando partida!!");
            System.exit(0);
        }

        //Posição 1

        if (dis == 7 && dir.equalsIgnoreCase("Frente")){
            System.out.println("Comando válido (°w°)");
            posicao = posicao + 1;
            valor = dis + valor;
            System.out.println(" ");
        } else if (dis != 7 && dir.equalsIgnoreCase("Frente")) {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        }
        else {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        }

        //Movimento 2

        System.out.println("Comando n° " + comando);
        comando = comando + 1;

        System.out.print("Digite o sentido do movimento: ");
        dir = sc.next();

        if (!dir.equalsIgnoreCase("Direita") && !dir.equalsIgnoreCase("Esquerda") && !dir.equalsIgnoreCase("Frente") && !dir.equalsIgnoreCase("Trás")) {
            System.out.println("Direção inválida!!");
            System.out.println("Encerrando partida!!");
            System.exit(0);
        }

        System.out.print("Digite a distância a ser percorrida: ");
        dis = sc.nextInt();

        if (dis <= 0) {
            System.out.println("Distância inválida");
            System.out.println("Encerrando partida!!");
            System.exit(0);
        }

        //Posição 1
        if (dis == 7 && dir.equalsIgnoreCase("Frente") && posicao == 1 ){
            System.out.println("Comando válido (°w°)");
            posicao = posicao + 1;
            valor = dis + valor;
            System.out.println(" ");
        }
        else if (dis != 7 && dir.equalsIgnoreCase("Frente") && posicao == 1 ) {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        }

        //Posição 2
        else if (dis == 3 && dir.equalsIgnoreCase("Direita") && posicao == 2 ) {
            System.out.println("Comando válido (°w°)");
            posicao = posicao + 1;
            valor = dis + valor;
            System.out.println(" ");
        }
        else if (dis != 3 && dir.equalsIgnoreCase("Direita") && posicao == 2) {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        }

        else {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        }

        //Movimento 3

        System.out.println("Comando n° " + comando);
        comando = comando + 1;
        System.out.println(" ");

        System.out.print("Digite o sentido do movimento: ");
        dir = sc.next();

        if (!dir.equalsIgnoreCase("Direita") && !dir.equalsIgnoreCase("Esquerda") && !dir.equalsIgnoreCase("Frente") && !dir.equalsIgnoreCase("Trás")) {
            System.out.println("Direção inválida!!");
            System.out.println("Encerrando partida!!");
            System.exit(0);
        }

        System.out.print("Digite a distância a ser percorrida: ");
        dis = sc.nextInt();

        if (dis <= 0) {
            System.out.println("Distância inválida");
            System.out.println("Encerrando partida!!");
            System.exit(0);
        }

        //Posição 1
        if (dis == 7 && dir.equalsIgnoreCase("Frente") && posicao == 1 ){
            System.out.println("Comando válido (°w°)");
            posicao = posicao + 1;
            valor = dis + valor;
            System.out.println(" ");
        }
        else if (dis != 7 && dir.equalsIgnoreCase("Frente") && posicao == 1 ) {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        }

        //Posição 2
        else if (dis == 3 && dir.equalsIgnoreCase("Direita") && posicao == 2 ) {
            System.out.println("Comando válido (°w°)");
            posicao = posicao + 1;
            valor = dis + valor;
            System.out.println(" ");
        }
        else if (dis != 3 && dir.equalsIgnoreCase("Direita") && posicao == 2) {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        }

        //Posição 3
        else if (dis == 3 && dir.equalsIgnoreCase("Trás") && posicao == 3 ) {
            System.out.println("Comando válido (°w°)");
            posicao = posicao + 1;
            valor = dis + valor;
            System.out.println(" ");
        }
        else if (dis != 3 && dir.equalsIgnoreCase("Trás") && posicao == 3) {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        }
        else {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        }

        //Movimento 4

        System.out.println("Comando n° " + comando);
        comando = comando + 1;
        System.out.println(" ");

        System.out.print("Digite o sentido do movimento: ");
        dir = sc.next();

        if (!dir.equalsIgnoreCase("Direita") && !dir.equalsIgnoreCase("Esquerda") && !dir.equalsIgnoreCase("Frente") && !dir.equalsIgnoreCase("Trás")) {
            System.out.println("Direção inválida!!");
            System.out.println("Encerrando partida!!");
            System.exit(0);
        }

        System.out.print("Digite a distância a ser percorrida: ");
        dis = sc.nextInt();
        System.out.println(" ");

        if (dis <= 0) {
            System.out.println("Distância inválida");
            System.out.println("Encerrando partida!!");
            System.exit(0);
        }

        //Posição 1
        if (dis == 7 && dir.equalsIgnoreCase("Frente") && posicao == 1 ){
            System.out.println("Comando válido (°w°)");
            posicao = posicao + 1;
            valor = dis + valor;
            System.out.println(" ");
        } else if (dis != 7 && dir.equalsIgnoreCase("Frente") && posicao == 1 ) {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        }

        //Posição 2
        else if (dis == 3 && dir.equalsIgnoreCase("Direita") && posicao == 2 ) {
            System.out.println("Comando válido (°w°)");
            posicao = posicao + 1;
            valor = dis + valor;
            System.out.println(" ");
        } else if (dis != 3 && dir.equalsIgnoreCase("Direita") && posicao == 2) {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        }

        //Posição 3
        else if (dis == 3 && dir.equalsIgnoreCase("Trás") && posicao == 3 ) {
            System.out.println("Comando válido (°w°)");
            posicao = posicao + 1;
            valor = dis + valor;
            System.out.println(" ");
        } else if (dis != 3 && dir.equalsIgnoreCase("Trás") && posicao == 3) {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        }

        //Posição 4
        else if (dis == 1 && dir.equalsIgnoreCase("Esquerda") && posicao == 4 ) {
            System.out.println("Comando válido (°w°)");
            posicao = posicao + 1;
            valor = dis + valor;
            System.out.println(" ");
        } else if (dis != 1 && dir.equalsIgnoreCase("Esquerda") && posicao == 4) {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        } else {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        }

        //Movimento 5

        System.out.println("Comando n° " + comando);
        comando = comando + 1;

        System.out.print("Digite o sentido do movimento: ");
        dir = sc.next();

        if (!dir.equalsIgnoreCase("Direita") && !dir.equalsIgnoreCase("Esquerda") && !dir.equalsIgnoreCase("Frente") && !dir.equalsIgnoreCase("Trás")) {
            System.out.println("Direção inválida!!");
            System.out.println("Encerrando partida!!");
            System.exit(0);
        }

        System.out.print("Digite a distância a ser percorrida: ");
        dis = sc.nextInt();
        System.out.println(" ");

        if (dis <= 0) {
            System.out.println("Distância inválida");
            System.out.println("Encerrando partida!!");
            System.exit(0);
        }

        //Posição 1
        if (dis == 7 && dir.equalsIgnoreCase("Frente") && posicao == 1 ){
            System.out.println("Comando válido (°w°)");
            posicao = posicao + 1;
            valor = dis + valor;
            System.out.println(" ");
        } else if (dis != 7 && dir.equalsIgnoreCase("Frente") && posicao == 1 ) {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        }

        //Posição 2
        else if (dis == 3 && dir.equalsIgnoreCase("Direita") && posicao == 2 ) {
            System.out.println("Comando válido (°w°)");
            posicao = posicao + 1;
            valor = dis + valor;
            System.out.println(" ");
        } else if (dis != 3 && dir.equalsIgnoreCase("Direita") && posicao == 2) {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        }

        //Posição 3
        else if (dis == 3 && dir.equalsIgnoreCase("Trás") && posicao == 3 ) {
            System.out.println("Comando válido (°w°)");
            posicao = posicao + 1;
            valor = dis + valor;
            System.out.println(" ");
        } else if (dis != 3 && dir.equalsIgnoreCase("Trás") && posicao == 3) {
            System.out.println("Comando inválido!");
        }

        //Posição 4
        else if (dis == 1 && dir.equalsIgnoreCase("Esquerda") && posicao == 4 ) {
            System.out.println("Comando válido (°w°)");
            posicao = posicao + 1;
            valor = dis + valor;
            System.out.println(" ");
        } else if (dis != 1 && dir.equalsIgnoreCase("Esquerda") && posicao == 4) {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        }

        //Posição 5
        else if (dis == 3 && dir.equalsIgnoreCase("Trás") && posicao == 5 ) {
            System.out.println("Comando válido (°w°)");
            posicao = posicao + 1;
            valor = dis + valor;
            System.out.println(" ");
        } else if (dis != 3 && dir.equalsIgnoreCase("Trás") && posicao == 5) {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        }
        else {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        }

        //Movimento 6

        System.out.println("Comando n° " + comando);
        comando = comando + 1;

        System.out.print("Digite o sentido do movimento: ");
        dir = sc.next();

        if (!dir.equalsIgnoreCase("Direita") && !dir.equalsIgnoreCase("Esquerda") && !dir.equalsIgnoreCase("Frente") && !dir.equalsIgnoreCase("Trás")) {
            System.out.println("Direção inválida!!");
            System.out.println("Encerrando partida!!");
            System.exit(0);
        }

        System.out.print("Digite a distância a ser percorrida: ");
        dis = sc.nextInt();
        System.out.println(" ");

        if (dis <= 0) {
            System.out.println("Distância inválida");
            System.out.println("Encerrando partida!!");
            System.exit(0);
        }

        //Posição 1
        if (dis == 7 && dir.equalsIgnoreCase("Frente") && posicao == 1 ){
            System.out.println("Comando válido (°w°)");
            posicao = posicao + 1;
            valor = dis + valor;
            System.out.println(" ");
        } else if (dis != 7 && dir.equalsIgnoreCase("Frente") && posicao == 1 ) {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        }

        //Posição 2
        else if (dis == 3 && dir.equalsIgnoreCase("Direita") && posicao == 2 ) {
            System.out.println("Comando válido (°w°)");
            posicao = posicao + 1;
            valor = dis + valor;
            System.out.println(" ");
        } else if (dis != 3 && dir.equalsIgnoreCase("Direita") && posicao == 2) {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        }

        //Posição 3
        else if (dis == 3 && dir.equalsIgnoreCase("Trás") && posicao == 3 ) {
            System.out.println("Comando válido (°w°)");
            posicao = posicao + 1;
            valor = dis + valor;
            System.out.println(" ");
        } else if (dis != 3 && dir.equalsIgnoreCase("Trás") && posicao == 3) {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        }

        //Posição 4
        else if (dis == 1 && dir.equalsIgnoreCase("Esquerda") && posicao == 4 ) {
            System.out.println("Comando válido (°w°)");
            posicao = posicao + 1;
            valor = dis + valor;System.out.println(" ");

        } else if (dis != 1 && dir.equalsIgnoreCase("Esquerda") && posicao == 4) {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        }

        //Posição 5
        else if (dis == 3 && dir.equalsIgnoreCase("Trás") && posicao == 5 ) {
            System.out.println("Comando válido (°w°)");
            posicao = posicao + 1;
            valor = dis + valor;
            System.out.println(" ");
        } else if (dis != 3 && dir.equalsIgnoreCase("Trás") && posicao == 5) {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        }

        //Posição 6
        else if (dis == 2 && dir.equalsIgnoreCase("Direita") && posicao == 6 ) {
            System.out.println("Comando válido (°w°)");
            valor = dis + valor;
            System.out.println(" ");
        } else if (dis != 2 && dir.equalsIgnoreCase("Direita") && posicao == 6) {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        }

        else {
            System.out.println("Comando inválido!");
        }

        //Movimento 7

        System.out.println("Comando n° " + comando);
        comando = comando + 1;

        System.out.print("Digite o sentido do movimento: ");
        dir = sc.next();

        if (!dir.equalsIgnoreCase("Direita") && !dir.equalsIgnoreCase("Esquerda") && !dir.equalsIgnoreCase("Frente") && !dir.equalsIgnoreCase("Trás")) {
            System.out.println("Direção inválida!!");
            System.out.println("Encerrando partida!!");
            System.exit(0);
        }

        System.out.print("Digite a distância a ser percorrida: ");
        dis = sc.nextInt();

        if (dis <= 0) {
            System.out.println("Distância inválida");
            System.out.println("Encerrando partida!!");
            System.exit(0);
            System.out.println(" ");
        }

        //Posição 1
        if (dis == 7 && dir.equalsIgnoreCase("Frente") && posicao == 1 ){
            System.out.println("Comando válido (°w°)");
            posicao = posicao + 1;
            valor = dis + valor;
            System.out.println(" ");
        } else if (dis != 7 && dir.equalsIgnoreCase("Frente") && posicao == 1 ) {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        }

        //Posição 2
        else if (dis == 3 && dir.equalsIgnoreCase("Direita") && posicao == 2 ) {
            System.out.println("Comando válido (°w°)");
            posicao = posicao + 1;
            valor = dis + valor;
            System.out.println(" ");
        } else if (dis != 3 && dir.equalsIgnoreCase("Direita") && posicao == 2) {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        }

        //Posição 3
        else if (dis == 3 && dir.equalsIgnoreCase("Trás") && posicao == 3 ) {
            System.out.println("Comando válido (°w°)");
            posicao = posicao + 1;
            valor = dis + valor;
            System.out.println(" ");
        } else if (dis != 3 && dir.equalsIgnoreCase("Trás") && posicao == 3) {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        }

        //Posição 4
        else if (dis == 1 && dir.equalsIgnoreCase("Esquerda") && posicao == 4 ) {
            System.out.println("Comando válido (°w°)");
            posicao = posicao + 1;
            valor = dis + valor;
            System.out.println(" ");
        } else if (dis != 1 && dir.equalsIgnoreCase("Esquerda") && posicao == 4) {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        }

        //Posição 5
        else if (dis == 3 && dir.equalsIgnoreCase("Trás") && posicao == 5 ) {
            System.out.println("Comando válido (°w°)");
            posicao = posicao + 1;
            valor = dis + valor;
            System.out.println(" ");
        } else if (dis != 3 && dir.equalsIgnoreCase("Trás") && posicao == 5) {
            System.out.println("Comando inválido!");
        }

        //Posição 6
        else if (dis == 2 && dir.equalsIgnoreCase("Direita") && posicao == 6 ) {
            System.out.println("Comando válido (°w°)");
            valor = dis + valor;
            System.out.println(" ");
        } else if (dis != 2 && dir.equalsIgnoreCase("Direita") && posicao == 6) {
            System.out.println("Comando inválido!");
        }
        else {
            System.out.println("Comando inválido!");
            System.out.println(" ");
        }

        if (posicao != 6){
            System.out.println("Falha em atingir a Saída");
            System.out.println("Posição final do mapa: " + posicao);
        }
        else {
            System.out.println("Saída atingida");
            System.out.println("Total de comandos usados: " + comando);
            System.out.printf("Distancia percorrida: %.0f\n", valor);
            valor = valor * 0.5;
            System.out.println("O valor do percurso foi de: R$ " + valor);
            System.out.println(" ");

            if (valor >= 5.1 && valor <= 10){
                System.out.println("Rota moderada");
            } else if (valor > 10) {
                System.out.println("Rota ineficiente");

            }
            else {
                System.out.println("Rota econômica");
            }
        }
    }
}
