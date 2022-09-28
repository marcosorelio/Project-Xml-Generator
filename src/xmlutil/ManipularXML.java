package xmlutil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Dom4JDriver;
import com.thoughtworks.xstream.io.xml.DomDriver;

import entidade.Cliente;

public class ManipularXML {

	public void criarArquivo() throws Exception {

		File file = new File("D:/xml", "teste1.xml");
		file.createNewFile();
		System.out.println("Arquivo Criado");

	}

	public void gravarXML(List<Cliente> listaCli) throws Exception {

		OutputStream out = new FileOutputStream("D:/xml/teste1.xml");

		XStream xstream = new XStream(new Dom4JDriver());
		xstream.alias("cliente", Cliente.class);
		xstream.alias("ListaCliente", List.class);

		xstream.toXML(listaCli, out);

		System.out.println("Conteudo armazenado");

	}

	@SuppressWarnings("unchecked")
	public List<Cliente> obterDadosXML() throws Exception {

		InputStream in = new FileInputStream("D:/xml/teste1.xml");
		XStream xstream = new XStream(new DomDriver("UTF-8"));
		xstream.alias("ListaCliente", List.class);
		List<Cliente> lista = (List<Cliente>) xstream.fromXML(in);

		return lista;
	}

}