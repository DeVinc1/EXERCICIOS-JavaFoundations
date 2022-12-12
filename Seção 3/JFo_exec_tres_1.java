import java.util.Scanner;

public class JFo_exec_tres_1{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("UM DIA DE CADA VEZ\n");

        System.out.println("Enquanto você descia de seu SR-73 após uma longa de jornada de reconhecimento pelos"+ "\n" 
        + "campos agora dominados pelos Vigiais, o almirante Kers corria em sua direção, atrevessando a pista do porta aviões" + "\n" 
        + "tenso e exclamando" + "\n" 
        + "- Ei, você! - Enquanto apontava a prancheta com seus papeis em sua direção - Qual seu nome?");

        System.out.print("- ");
        String nome = input.nextLine();

        System.out.println("- Prazer " + nome + ", sou o Almirante Kers da Federação Aeronautica de Defesa Global. Precisaria que você" + "\n" 
        + "me respondesse uma pergunta bem brevemente." + "\n" 
        + "Você concordou, uma pequena pergunta não iria fazer mal a ninguém." + "\n" 
        + "- Qual a velocidade mach máxima que você já atingiu abordo do SR-73?");

        System.out.print("- ");
        Double mach = input.nextDouble();

        System.out.println("- Mach " + mach + "? " + (mach * 1235) + " km/h... Não é o suficiente, mas vai ter que servir."+ "\n" 
        +"Você fica confuso. Porque teria de ir mais rápido? Você sempre foi um bom piloto com o SR-73 e somente uma vez teve que voar acima de Mach " + (mach - 0.8) + "\n" 
        +"Kers anota algumas coisas em sua prancheta, olha pra você; pro seu avião... Tudo isso para riscar todas as suas anotações. Ele tira seu óculos e pergunta:" + "\n"
        +"- Quanto anos você tem, jovem? ");

        System.out.print("- ");
        int idade = input.nextInt();

        System.out.println("- " + idade + " anos... Você tinha apenas " + (idade-15) + " quando isso tudo começou... Lembra-se de algo antes de se tornar um piloto?");

        System.out.print("- ");
        input.nextLine();
        String resposta1 = input.nextLine();

        System.out.println("- A  vida era mais simples, jovem; podiamos andar pelas ruas, sair com nossas familias... podiamos viver..." + "\n" 
        +"O que nos resta hoje? Um mundo sendo devorado enquanto lutamos pra que possamos ver o sol nascer amanhã..." + "\n" 
        +"Você pilota esse jato a quantoa anos, jovem?");

        System.out.print("- ");
        int resposta2 = input.nextInt();

        System.out.println("- " + resposta2 + " anos servindo o seu planeta... Você é um bom piloto... Não pelo que faz nos céus, mas por continuar aqui, todos os dias" + "\n" 
        + "É de se orgulhar soldado..."+ "\n" 
        + "Mas as coisas vem piorando, e nós precisamos arrumar um jeito de sair dessa situação... Vamos precisar de você, em um novo projeto." + "\n" 
        + "O milagre que precisamos está chegando e precisamos de pessoas como você" + "\n" 
        + "Não posso te falar do que se trata, mas precisa confiar em mim jovem. Me reponda:"+ "\n" 
        + "Sim ou Não? ");

        System.out.print("- ");
        input.nextLine();
        String resposta3 = input.nextLine();

        System.out.println("Você pode mudar de ideia quando quiser jovem... Entendo que é uma decisão difícil. De qualquer forma, te esperarei amanhâ no hangar se você se decidir");

        System.out.println("FIM (ou um novo começo?)");

        System.out.println("Você gostou do conto?");
        String respostaSurvey = input.nextLine();
        System.out.println("Que nota de 0 a 10?");
        int respostaSurveyNota = input.nextInt();
        System.out.println("Deixe uma sugestão sobre o tema do conto:");
        input.nextLine();
        String sugestao = input.nextLine();
        System.out.println("Que outro tema você gostaria de ler?");
        input.nextLine();
        String outroTema = input.nextLine();

        input.close();
    }
}
