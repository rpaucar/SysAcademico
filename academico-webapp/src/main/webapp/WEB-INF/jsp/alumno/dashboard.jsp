<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<script>

function newAlumno() {
	document.alumno.submit();
}
function editAlumno(id) {
	document.alumno.id.value = id;
	document.alumno.action.value = "editAlumno";
	document.alumno.submit();
}
function deleteAlumno(id) {
	document.alumnoDelete.id.value = id;
	document.alumnoDelete.submit();
}
</script>
<div class="row">
	<div class="span2">
		<%@ include file="/WEB-INF/jsp/include/menu.jsp"%>
	</div>	
	<div class="modal-body">
		Lista de Alumnos:
		<div class="pull-right">
		<a href="#" class="btn btn-primary" onclick="javascript:newAlumno()">Registrar alumno</a>
		</div>	
		<display:table name="${listAlumno}" id="item" requestURI="/dashboard" class="table">
			
			<display:column title="N°" property="id" />
			<display:column title="Codigo" property="codigo_alumno" />
			<display:column title="Usuario" property="usuario_creacion" />
			
			
		</display:table>
	</div>
</div>

<form method="post" action="<%=request.getContextPath()%>/alumno/alumnoForm" name="alumno">
	<input type = "hidden" id="id" name="id"/>
	<input type = "hidden" id="action" name="action"/>
</form>

<form method="post" action="<%=request.getContextPath()%>/alumno/deleteAlumno" name="alumnoDelete">
	<input type = "hidden" id="id" name="id"/>
</form>zzz