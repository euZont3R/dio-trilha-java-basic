package candidatura;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) {
    	selecaoCandidatos();
    }
    static void selecaoCandidatos() {
    	String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
    
    	int candidatosSelecionados = 0;
    	int candidatosAtual = 0;
    	double salarioBase = 2000.0;
    	while(candidatosSelecionados< 5 && candidatosAtual < candidatos.length){
    		String candidato = candidatos[candidatosAtual];
    		double salarioPretendido = valorPretendido();
    		
    		System.out.println("O candidato " + candidato + " Solicitou este valor de salario " + salarioPretendido);
    		if(salarioBase >= salarioPretendido) {
    			System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
    			candidatosSelecionados++;
    		}
    		candidatosAtual++;
    	}
    }
	static void analisarCandidatura(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDAR O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
