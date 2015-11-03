<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<ul class="nav nav-list">
	<li class="nav-header">MANTENIMIENTO</li>

	<li <c:if test="${menuChild eq 'institution'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/institution/dashboard.html">Instituciones</a></li>
	<li <c:if test="${menuChild eq 'elections'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/elections/elections.html">Elecciones</a></li>
	<li <c:if test="${menuChild eq 'students'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/institution/students.html">Alumnos</a></li>
	<li <c:if test="${menuChild eq 'users'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/institution/users.html">Usuarios</a></li>

</ul>