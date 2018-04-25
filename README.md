# JavaTechnicalTestingCuemby

PRUEBA	TÉCNICA	JAVA
Una	empresa	desea	construir	un	sistema	donde	pueda	llevar	el	control	de	la	asistencia de	sus	
empleados,	para	ello	deben	hacer	ciertas	funcionalidades	demarcadas	a	continuación:	
• Construir	funcionalidad	para	registros	de	empleados
• Construir	funcionalidad	para	dar	de	baja	a	un	empleado	retirado
• Formulario	para	la	asistencia	
• Reporte	de	asistencia	en	un	periodo	de	una	semana	y	un	mes.
Detalles	funcionales
• La	inscripción	del	usuario	debe	tener	como	datos	mínimos:	identificación,	nombre,	
apellido,	edad,	cargo,	salario,	fecha	de	nacimiento, fecha	de	ingreso	a	la	empresa y
status	
• Para	eliminar	el	usuario	del	sistema,	solo	se	debe	cambiar	el	status	del	usuario	a	inactivo
• El	formulario	de	asistencia	captura,	fecha	actual	(en	la	que	se	toma	la	asistencia) en	
formato	dd-MM-yyyy y	la	identificación	del	usuario.
• El	reporte	debe	devolver	una	lista	de	los	usuarios	que	hayan	reportado	su	asistencia	en	
un	periodo	de	tiempo	(pre	configurado,	semanal	o	mensual) y	que	esté activo.
Detalles	Técnicos
La	prueba	se	debe	separar	en	dos	partes,	la	primera	es	un	API	que	se	construirá en	JAVA de	la	
forma	que	desee	hacerlo,	esta	API	podrá	ser	probada	desde	Postman	o Soap	UI	y	debe	manejar	
mensajería	tipo	Json en	el request	y	en	el	response,	adicional	no	se	va	a	manejar	base	de	datos	
todo	se	debe	hacer	en	estructuras en	memoria	que	usted	defina	para	la	solución.
Por	otro	lado, el	Front	lo	hará de	una	manera	básica	que	cumpla	con	el	objetivo	de	la	prueba,	la	
idea	es	que	el	Backend	haga	el	trabajo	fuerte,	desde	el	UI	mandará	las	peticiones	y	renderizará
las	respuestas,	para	el	UI	puede	utilizar	el framework	de	su	preferencia.
Notas:
• Dará puntos	extras	Spring	MVC	para	los	servicios
• Obligatoriamente	el	proyecto	debe	ser	tipo	Maven
• Comentarios	en	inglés
• Test	unitarios	dará puntos	extras
• Aplicar	patrones	de	diseño	a	la	solución	dará puntos	extras
• Buen	diseño	del	UI	aplica puntos	extra
A partir	del	momento en	que	reciba	la	prueba	tiene	2	días	y	medio	para	ser	devuelta,	por	favor	
confirmar	la	recepción	del	correo.
