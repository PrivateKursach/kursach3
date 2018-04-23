angular.module("app", ["ui.router", "ui.bootstrap", "ng-fusioncharts"])
    .config(routing)
    .component("tsMain", tsIndexComponent)
    .component("ticketSales", ticketSalesComponent);