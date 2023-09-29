(function(){
    $("#tabprodutos").on("click",".js-delete", function(){
        let botaoClicado = $(this);
        $("#btnsim").attr("data.id", botaoClicado.attr("data-id"));
    $("#modalproduto").modal("show");
    });
})()
