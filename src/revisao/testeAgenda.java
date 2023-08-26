package revisao;

public class testeAgenda {

	public static void main(String[] args) {
		Agenda minhaAgenda = new Agenda(null, null);
		minhaAgenda.setNome("Carlos");
		minhaAgenda.setTelefone("912345-6879"); 
		minhaAgenda.addEmail("eu@email.com");
		minhaAgenda.addEndereco("Rua Boa Vista");

		System.out.println(minhaAgenda.getNome() + "\n" + minhaAgenda.getTelefone() + "\n" + 
		minhaAgenda.getEmail() + "\n" + minhaAgenda.getEndereco());

	}
}
