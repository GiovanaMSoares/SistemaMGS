package src;

import java.util.Scanner;

public class console {
    // Restante do código da classe funcionario ...

    // Método main - agora interativo para buscar funcionário pelo identificador
    public static void main(String[] args) {
        funcionario func1 = new funcionario("Antônio Marques", "Novalgina", "Diabetes", "+55 61 9999-8888", "antonio@marques.com", 6782);
        func1.exibirinformacoes();
        funcionario func2 = new funcionario("Alice Machado", "Poeira", "Hipertensão", "+55 61 7777-3333", "alice@machado.com", 9237);
        func2.exibirinformacoes();

        // Criando um scanner para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o identificador do funcionário que deseja buscar: ");
        int identificadorBusca = scanner.nextInt();

        // Buscando um funcionário pelo identificador
        funcionario funcEncontrado = funcionario.buscarPorIdentificador(identificadorBusca);

        if (funcEncontrado != null) {
            System.out.println("\nFuncionário encontrado:");
            funcEncontrado.exibirinformacoes();
        } else {
            System.out.println("\nFuncionário não encontrado para o identificador: " + identificadorBusca);
        }

        // Fechando o scanner após o uso
        scanner.close();
    }
}
