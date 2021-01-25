function eliminar(id) {
    swal({
        title: "¿Seguro que deseas eliminar el elemento?",
        text: "¡No se podrá recuperar la tarea una vez eliminada!",
        icon: "warning",
        buttons: true,
        dangerMode: true,
    })
        .then((OK) => {
            if (OK) {
                $.ajax({
                    url:"/eliminar/" + id,
                    success: function (res) {
                        console.log(res);
                    },
                })
                swal("La tarea ha sido eliminada.", {
                    icon: "success",
                }).then((ok)=>{
                    if (ok){
                        location.href = "/";
                    }
                });
            }
        });
}