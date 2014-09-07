package comparacao;

import java.util.Comparator;

import entidade.Cliente;

public class ClienteComparator implements Comparator<Cliente> {

	@Override
	public int compare(Cliente c1, Cliente c2) {
		return c1.getIdCliente().compareTo(c2.getIdCliente());
	}

}
