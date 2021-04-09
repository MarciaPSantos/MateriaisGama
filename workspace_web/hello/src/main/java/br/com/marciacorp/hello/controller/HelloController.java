package br.com.marciacorp.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.marciacorp.hello.model.Produto;

/*agora a classe aceita "atender" requisições WEB
 * no seguinte endereço: http://localhost:8080
 * 
 */
@RestController
public class HelloController {

	//esse é o caminho para que o método sayHello execute */
	@GetMapping("/hello")
	public String sayHello() {
		return "Oi, tudo bem? Meu primeiro teste no Spring Boot!!";
	}
	
	@GetMapping("/hellohtml")
	public String sayHtml() {
		return "<html> "
				+ "<body> "
				+ "<h1> Exemplo de Pagina </h1>"
				+ "<hr>"
				+ "<p> O isidro fala pa bune </p>"
				+ "</body> "
				+ "<html>";
	}
	
	@GetMapping("/produto")
	public Produto exibirProduto() {
		Produto prod = new Produto();
		prod.setId(987654);
		prod.setDescricao("Computador top de linha cheio de luzinha que acende");
		prod.setPreco(2850.00);
		prod.setQuantidade(3);
		return prod;
	}
	

	@PostMapping("/novoproduto")
	public String inserirNovoProduto(@RequestBody Produto novo) {
		/* para efeito de conferencia */
		System.out.println("Produto recebido!!!");
		System.out.println(novo.getId() + "/" + novo.getDescricao() + "/" + novo.getPreco());
		return "OK";
	}	
	
	

	
}
