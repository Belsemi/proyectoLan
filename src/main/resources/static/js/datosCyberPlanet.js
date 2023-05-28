// Call the dataTables jQuery plugin
$(document).ready(function() {
  cargarUsuarios();
  $('#dataTable').DataTable();

});
async function cargarUsuarios(){

      const request = await fetch('datos', {
         method: 'GET',
         headers: {
           'Accept': 'application/json',
           'Content-Type': 'application/json'
         },

       });
       const respuesta = await request.json();


   let datosHtml = "";
   for(let usuarios of respuesta){

     let datos = '<tr><td>'+usuarios.id+'</td><td>'+usuarios.tiempo+'</td><td>'+usuarios.yape1+'</td><td>'+usuarios.yape2+'</td><td>'
     +usuarios.totalSumaYapes+'</td><td>'+usuarios.fiadosTotalesCliente+'</td><td>'+usuarios.efectivoTotal+'</td><td>'
     +usuarios.cyberPlanet+'</td><td>'+usuarios.restanteDinero+'</td><td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i> </a></td></tr>'

       datosHtml += datos;

       document.querySelector('#dataTable tbody').innerHTML= datosHtml;
    }
}



