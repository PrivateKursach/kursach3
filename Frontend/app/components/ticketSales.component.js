var ticketSalesComponent = {
    templateUrl : "./templates/ticketSales.template.html",
    controller : TicketSalesController
};

function TicketSalesController(ticketSalesService, $filter) {
    var $ctrl = this;

    $ctrl.ticketSalesObservationsChartData = {
        chart: {
            caption: "Продажи авиабилетов",
            subCaption: "с 2010 по 2016 год",
            numberPrefix: "",
            theme: "ocean"
        },
        data: []
    };
    $ctrl.ticketSalesForecastChartData = {
        chart: {
            caption: "Прогноз продажи авиабилетов",
            subCaption: "с 2017 по 2018 год",
            numberPrefix: "",
            theme: "ocean"
        },
        data: []
    };
    
    $ctrl.$onInit = function () {
        ticketSalesService.getTicketSalesObservations().then(function (response) {
            $ctrl.ticketSalesObservations = response;
            var ticketSalesObservationsChartData = [];
            response.forEach(function (item, i, arr) {
                ticketSalesObservationsChartData.push({
                    label : $filter('date')(item.observationDate, 'MMM, y'),
                    value : Number.parseInt(item.numberOfTickets)
                });
            });
            $ctrl.ticketSalesObservationsChartData.data = ticketSalesObservationsChartData;
        });
    };

    $ctrl.makeForecast = function () {
        ticketSalesService.getTicketSalesForecast().then(function (response) {
            $ctrl.ticketSalesForecast = response;
            var ticketSalesForecastChartData = [];
            response.forEach(function (item, i, arr) {
                ticketSalesForecastChartData.push({
                    label : $filter('date')(item.observationDate, 'MMM, y'),
                    value : Number.parseInt(item.numberOfTickets)
                });
            });
            $ctrl.ticketSalesForecastChartData.data = ticketSalesForecastChartData;
        });
    };
}