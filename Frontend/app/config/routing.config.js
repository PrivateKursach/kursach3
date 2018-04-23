function routing($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.otherwise("/");

    var welcomeState = {
        name: "welcome",
        url: "/",
        component: "ticketSales"
    };

    $stateProvider.state(welcomeState);
}