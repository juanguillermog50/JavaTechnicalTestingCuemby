angular.module('app', []).controller('appCtrl',
		[ '$http', controladorPrincipal ]);

function controladorPrincipal($http) {
	var url = "http://localhost:8080/employees";
	var ci = this;
	ci.fdatos = {};
	ci.insert = function() {
		$http.post(url, ci.fdatos).success(function(respuesta) {
			ci.employee = respuesta;
			alert(respuesta);

		}).error(function(data) {
			alert(data);
		});
	}

	var cb = this;
	cb.search = function() {
		$http.get(url + "/" + cb.id).success(function(respuesta) {
			cb.employee = respuesta;
		}).error(function(data) {
			error(data);
			alert(data);
		});
	}

	cb.deactivate = function() {
		$http.post(url + "/" + cb.id).success(function(respuesta) {
			cb.employee = respuesta;
			alert(respuesta);
		});
	}
	var url1 = "http://localhost:8080/attendances";
	cb.attendance = function() {
		var data = {
			id : cb.id,
			date : cb.date
		};
		$http.post(url1, data).success(function(respuesta) {
			cb.employee = respuesta;
			alert(respuesta);
		});
	}
	var cr = this;
	cr.report = function() {
		var url1 = "http://localhost:8080/attendances";
		$http.get(url1 + "?init=" + cr.init + "&end=" + cr.end).success(
				function(respuesta) {
					cr.attendances = respuesta;
				});
	}
}