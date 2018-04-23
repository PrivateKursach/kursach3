angular.module("app", ["ui.router", "ui.bootstrap", "ng-fusioncharts"])
    .config(routing)
    .service("ticketSalesService", ticketSalesService)
    .component("tsIndex", tsIndexComponent)
    .component("ticketSales", ticketSalesComponent);