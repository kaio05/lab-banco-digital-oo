import java.util.ArrayList;
import java.util.List;

public class Banco implements IBanco {

	private String nome;
	private List<Conta> contas = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(Conta conta) {
		this.contas.add(conta);
	}

	public void exibirContas() {
		if(!this.contas.isEmpty()) {
			System.out.println(this.contas);
		}
		else {
			System.out.println("Não há contas neste banco.");
		}
	}

	public void apagarContas() {
		this.contas.clear();
	}
}
