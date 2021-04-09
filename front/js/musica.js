function filtrar(){
    
    // nesse caso como vai usar um GET (esta no musicacontroller) vai direto para o fetch
    // txtinicio e txtfim foram definidos no id em musica.html (linha 22 e 26)
    fetch("http://localhost:8080/cadastro/" + 
    document.getElementById("txtinicio").value + 
    "/" + document.getElementById("txtfim").value)
        .then(res => res.json())
        .then(res => {
            var tabela = 
            "<table border='1' align='center'>" + 
            "<tr>" + 
            "<th>Musica</th>" + 
            "<th>Artista</th>" +
            "<th>Cadastro</th>" +
            "</tr>";
            for(cont=0;cont<res.length;cont++){
                tabela +=
                "<tr>" + 
                "<td>" + res[cont].titulo + "</td>" +
                "<td>" + res[cont].artista.nomeArtistico + "</td>" +  //Artistico em letra maiuscula pq é de acordo com o atributo
                "<td>" + res[cont].cadastro + "</td>" +
                "</tr>";
            }

            //preencher a tabela (for)
            tabela+="</table>";
            document.getElementById("resultado").innerHTML = tabela;
        });


}