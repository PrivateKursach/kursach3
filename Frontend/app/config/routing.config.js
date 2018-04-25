function routing($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.otherwise("/");

    var welcomeState = {
        name: "welcome",
        url: "/",
        component: "ticketSales"
    };

    var ticketSalesState = {
        name: "ticketSales",
        url: "/ticket-sales",
        component: "ticketSales"
    };

    $stateProvider.state(welcomeState);
    $stateProvider.state(ticketSalesState);
}