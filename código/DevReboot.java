public class DevReboot {

    public static void main(String[] args) {
        System.out.println("🚀 Iniciando Versão Dev 2.0...");

        String[] planoDeAcao = {
            "Dia 1: Diagnóstico: listar habilidades, objetivos e foco de carreira.",
            "Dia 2: Atualização: currículo, LinkedIn e GitHub prontos para o mercado.",
            "Dia 3: Visibilidade: publicar conteúdo técnico no LinkedIn.",
            "Dia 4: Portfólio: destacar e documentar um projeto de destaque.",
            "Dia 5: Aprendizado: estudar e aplicar uma nova tecnologia.",
            "Dia 6: Treinamento: simular entrevista técnica e resolver desafios.",
            "Dia 7: Ação real: aplicar para vagas e ativar networking direto."
        };

        for (int dia = 0; dia < planoDeAcao.length; dia++) {
            System.out.println("📅 " + planoDeAcao[dia]);
            executarTarefa(dia + 1);
        }

        System.out.println("\n✅ Dev 2.0 iniciado com sucesso. Agora é manter o ritmo. Boa sorte!");
    }

    private static void executarTarefa(int dia) {
        switch (dia) {
            case 1 -> diagnostico();
            case 2 -> atualizacao();
            case 3 -> visibilidade();
            case 4 -> portfolio();
            case 5 -> aprendizado();
            case 6 -> treinamento();
            case 7 -> acaoReal();
            default -> System.out.println("⚠️ Dia inválido");
        }
    }

    // Métodos simbólicos
    private static void diagnostico() {
        System.out.println("🔍 Analisando perfil, habilidades e metas...");
    }

    private static void atualizacao() {
        System.out.println("🧾 Atualizando CV, LinkedIn e GitHub com os dados mais recentes...");
    }

    private static void visibilidade() {
        System.out.println("📢 Publicando post técnico para aumentar alcance e networking...");
    }

    private static void portfolio() {
        System.out.println("💼 Refinando projeto, README e documentação para destaque...");
    }

    private static void aprendizado() {
        System.out.println("📚 Estudando nova tecnologia e aplicando em mini projeto...");
    }

    private static void treinamento() {
        System.out.println("🎙️ Simulando entrevista e resolvendo desafio técnico...");
    }

    private static void acaoReal() {
        System.out.println("📨 Aplicando para vagas e se conectando com recrutadores...");
    }
}
