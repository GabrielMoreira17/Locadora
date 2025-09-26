import java.util.ArrayList;
import java.util.List;

/**
 * Classe Locadora
 * Gerencia os carros e clientes cadastrados e disponibiliza operações
 * de aluguel e devolução.
 */
public class Locadoras {

    private List<Carros> carros;
    private List<Clientes> clientes;

    public Locadoras() {
        carros = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    public void cadastrarCarro(Carros c) {
        carros.add(c);
    }

    public void cadastrarCliente(Clientes c) {
        clientes.add(c);
    }

    /**
     * Tenta alugar um carro pelo modelo.
     * Se houver um carro disponível com o mesmo modelo (case-insensitive),
     * marca-o como indisponível e retorna true.
     * Caso contrário retorna false.
     */
    public boolean alugarCarro(String modelo) {
        for (Carros c : carros) {
            if (c.getModelo().equalsIgnoreCase(modelo) && c.isDisponivel()) {
                c.setDisponivel(false);
                return true;
            }
        }
        return false;
    }

    /**
     * Tenta devolver um carro pelo modelo.
     * Se houver um carro com esse modelo que estiver alugado,
     * marca como disponível e retorna true.
     * Caso contrário retorna false.
     */
    public boolean devolverCarro(String modelo) {
        for (Carros c : carros) {
            if (c.getModelo().equalsIgnoreCase(modelo) && !c.isDisponivel()) {
                c.setDisponivel(true);
                return true;
            }
        }
        return false;
    }

    /**
     * Lista apenas os carros disponíveis
     */
    public void listarCarrosDisponiveis() {
        System.out.println("----- Carros disponíveis -----");
        boolean any = false;
        for (Carros c : carros) {
            if (c.isDisponivel()) {
                System.out.println(c);
                any = true;
            }
        }
        if (!any) {
            System.out.println("Nenhum carro disponível no momento.");
        }
        System.out.println("------------------------------");
    }

    /**
     * Lista todos os carros cadastrados
     */
    public void listarTodosCarros() {
        System.out.println("----- Todos os carros -----");
        if (carros.isEmpty()) {
            System.out.println("Nenhum carro cadastrado.");
        } else {
            for (Carros c : carros) {
                System.out.println(c);
            }
        }
        System.out.println("---------------------------");
    }
}
