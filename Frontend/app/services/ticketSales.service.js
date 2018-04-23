function ticketSalesService($http) {
    var service = this;

    service.getTicketSalesObservations = function () {
        return $http({
            method: "GET",
            url: "http://localhost:8081/rest/ticket-sales/observations"
        }).then(function (response) {
            return response.data;
        });
    };

    service.getTicketSalesForecast = function () {
        return $http({
            method: "GET",
            url: "http://localhost:8081/rest/ticket-sales/forecast"
        }).then(function (response) {
            return response.data;
        });
    };
}