$(document).ready(function() {
cargarUsuarios();
}
    $('#notas'.DataTable();
});

async function cargarUsuarios() {
const request = await fetch('listarUsuarios', {
    method: 'GET',
    headers: {
    'Accept': 'application/json',
    'Content-Type': 'application/json'
    },
});
const alumnos = await request.json();
let listadoHTML = "";
for (let alumno of alumnos) {
    let alumnoHTML = '<tr><th scope="row">'+alumnos.id+'</th><td>'+alumno.nombre+'</td><td>'+alumno.apellido+'</td><td>'+alumno.nota+'</td>'
    listadoHTML += alumnoHTML;
    document.querySelector('#notas tbody').outerHTML = listadoHTML;
}
}