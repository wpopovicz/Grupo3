function abrirPag(valor) {
    var url = valor;

    xmlRequest.open("GET", url, true);
    return url;
}

function mudancaEstado() {
    if (xmlRequest.readyState == 4) {
        document.getElementById("conteudo").innerHTML = xmlRequest.responseText;
    }
}
function redireciona(param) {
    location.href = param;
}  

function enviarServlet (servlet,cod) {
    $.ajax({
        url: servlet,
        type: 'POST',
        data: {
            id: cod
        },
         success: function(data){
            $('#conteudo').html(data);
        }
    });
}