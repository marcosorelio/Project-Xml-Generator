XmlGenerator
============

Gerador de arquivos XML


Uitlizando Biblioteca Externa para manipular arquivos XML

````Java

public static void main(String[] args) {

		ManipularXML manipularXML = new ManipularXML();
		List<Cliente> listaCli = new ArrayList<Cliente>();
		listaCli.addAll(Arrays.asList(new Cliente(101, "Leo", "leo@email.com",
				"masculino"), new Cliente(102, "Bia", "bia@email.com",
				"feminino"), new Cliente(103, "Ana", "ana@email.com",
				"feminino"), new Cliente(104, "Nat", "nat@email.com",
				"feminino"), new Cliente(105, "Let", "let@email.com",
				"feminino"), new Cliente(106, "Mic", "mic@email.com",
				"masculino")));

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
````
````Java
public void gravarXML(List<Cliente> listaCli) throws Exception {

		OutputStream out = new FileOutputStream("D:/xml/teste1.xml");

		XStream xstream = new XStream(new Dom4JDriver());
		xstream.alias("cliente", Cliente.class);
		xstream.alias("ListaCliente", List.class);

		xstream.toXML(listaCli, out);

		System.out.println("Conteudo armazenado");

	}
	
````

Resultado----
![](http://marcosjunior.hol.es/git/img/xml_generator_1.0_tela.png)
