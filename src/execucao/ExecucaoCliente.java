package execucao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import entidade.Cliente;
import xmlutil.ManipularXML;

public class ExecucaoCliente {

	public static void main(String[] args) {

		ManipularXML manipularXML = new ManipularXML();
		List<Cliente> listaCli = new ArrayList<Cliente>();
		listaCli.addAll(Arrays.asList(new Cliente(101, "Leo", "leo@email.com", "masculino"),
				new Cliente(102, "Bia", "bia@email.com", "feminino"),
				new Cliente(103, "Ana", "ana@email.com", "feminino"),
				new Cliente(104, "Nat", "nat@email.com", "feminino"),
				new Cliente(105, "Let", "let@email.com", "feminino"),
				new Cliente(106, "Mic", "mic@email.com", "masculino")));

		Collections.sort(listaCli);

		try {

			manipularXML.criarArquivo();
			manipularXML.gravarXML(listaCli);
			List<Cliente> listaXML = manipularXML.obterDadosXML();

			System.out.println();

			for (Cliente c : listaXML) {
				System.out.println(c);

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
