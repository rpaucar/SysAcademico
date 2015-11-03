<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>


		<display:table name="${listAlumno}" id="item" requestURI="/dashboard" class="table">
			
			<display:column title="N°" property="id" />
			<display:column title="Codigo" property="codigo_alumno" />
			<display:column title="Usuario" property="usuario_creacion" />

		</display:table>