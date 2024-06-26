package es.uca.dss.parkcontrol.web_ui.views.options_page;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Manager Section")
@Route(value = "manager-options")

public class ManagerOptionsView extends VerticalLayout {

    public ManagerOptionsView() {
        setSpacing(false);

        add(new H1("Manager Options"));

        VerticalLayout verticalLayout = new VerticalLayout();

        // Create a HorizontalLayout for the buttons
        HorizontalLayout buttonFirstRowLayout = new HorizontalLayout();
        buttonFirstRowLayout.setSpacing(true);

        Button getAllParkings = new Button("Get all parkings");
        getAllParkings.addClickListener(e -> {
            UI.getCurrent().navigate("/manager/all-parkings");
        });

        Button addParking = new Button("Add parking");
        addParking.addClickListener(e -> {
            UI.getCurrent().navigate("/manager/add-parking");
        });

        Button getParkingById = new Button("Get parking by id");
        getParkingById.addClickListener(e -> {
            UI.getCurrent().navigate("/manager/parking-info-by-id");
        });

        Button changeParkingDetails = new Button("Change parking details");
        changeParkingDetails.addClickListener(e -> {
            UI.getCurrent().navigate("/manager/change-parking-details");
        });

        buttonFirstRowLayout.add(getAllParkings, addParking, getParkingById, changeParkingDetails);

        // Create a HorizontalLayout for the buttons
        HorizontalLayout buttonSecondRowLayout = new HorizontalLayout();
        buttonFirstRowLayout.setSpacing(true);

        Button deleteParking = new Button("Delete parking");
        deleteParking.addClickListener(e -> {
            UI.getCurrent().navigate("/manager/delete-parking");
        });

        Button getAllVehiclesInParking = new Button("Get all vehicles in parking");
        getAllVehiclesInParking.addClickListener(e -> {
            UI.getCurrent().navigate("/manager/vehicles-in-selected-parking");
        });

        buttonSecondRowLayout.add(deleteParking, getAllVehiclesInParking);

        verticalLayout.setAlignItems(Alignment.CENTER);
        verticalLayout.add(new H2("Parking Management"));
        verticalLayout.add(buttonFirstRowLayout, buttonSecondRowLayout);
        verticalLayout.add(new H2("Statistics Management"));

        HorizontalLayout buttonThirdRowLayout = new HorizontalLayout();
        buttonFirstRowLayout.setSpacing(true);

        Button getEntriesStatisticByDay = new Button("Get entries statistic by day");
        getEntriesStatisticByDay.addClickListener(e -> {
            UI.getCurrent().navigate("/manager/entries-stat-by-day");
        });

        Button getExitsStatisticByDay = new Button("Get exits statistic by day");
        getExitsStatisticByDay.addClickListener(e -> {
            UI.getCurrent().navigate("/manager/exits-stat-by-day");
        });

        Button getEntriesStatisticByMonth = new Button("Get entries statistic by month");
        getEntriesStatisticByMonth.addClickListener(e -> {
            UI.getCurrent().navigate("/manager/entries-stat-by-month");
        });

        Button getExitsStatisticByMonth = new Button("Get exits statistic by month");
        getExitsStatisticByMonth.addClickListener(ee -> {
            UI.getCurrent().navigate("/manager/exits-stat-by-month");
        });

        buttonThirdRowLayout.add(getEntriesStatisticByDay, getExitsStatisticByDay, getEntriesStatisticByMonth, getExitsStatisticByMonth);
        verticalLayout.add(buttonThirdRowLayout);

        verticalLayout.add(new H2("Subscription Management"));

        HorizontalLayout buttonFourthRowLayout = new HorizontalLayout();
        buttonFirstRowLayout.setSpacing(true);

        Button getAllSubscriptions = new Button("Get all subscriptions");
        getAllSubscriptions.addClickListener(e -> {
            UI.getCurrent().navigate("/manager/all-subscriptions");
        });

        Button getAllSubscriptionTypes = new Button("Get all subscription types");
        getAllSubscriptionTypes.addClickListener(e -> {
            UI.getCurrent().navigate("/manager/all-subscription-types");
        });

        Button createSubscriptionType = new Button("Create subscription type");
        createSubscriptionType.addClickListener(e -> {
            UI.getCurrent().navigate("/manager/create-subscription-type");
        });

        Button changeSubscriptionTypePrice = new Button("Change subscription type price");
        changeSubscriptionTypePrice.addClickListener(e -> {
            UI.getCurrent().navigate("/manager/change-subscription-type-price");
        });

        Button deleteSubscriptionType = new Button("Delete subscription type");
        deleteSubscriptionType.addClickListener(e -> {
            UI.getCurrent().navigate("/manager/delete-subscription-type");
        });

        buttonFourthRowLayout.add(getAllSubscriptions, getAllSubscriptionTypes, createSubscriptionType, changeSubscriptionTypePrice, deleteSubscriptionType);
        verticalLayout.add(buttonFourthRowLayout);

        verticalLayout.add(new H2("Plan Management"));

        HorizontalLayout buttonFifthRowLayout = new HorizontalLayout();
        buttonFirstRowLayout.setSpacing(true);

        Button getAllPlans = new Button("Get all plans");
        getAllPlans.addClickListener(e -> {UI.getCurrent().navigate("/manager/all-plans"); });

        Button createPlan = new Button("Create plan");
        createPlan.addClickListener(e -> { UI.getCurrent().navigate("/manager/create-plan"); });

        Button changePlanPrice = new Button("Change plan price");
        changePlanPrice.addClickListener(e -> { UI.getCurrent().navigate("/manager/change-plan-price"); });

        Button changePlanName = new Button("Change plan name");
        changePlanName.addClickListener(e -> { UI.getCurrent().navigate("/manager/change-plan-name"); });

        Button deletePlan = new Button("Delete plan");
        deletePlan.addClickListener(e -> { UI.getCurrent().navigate("/manager/delete-plan"); });

        buttonFifthRowLayout.add(getAllPlans, createPlan, changePlanPrice, changePlanName, deletePlan);
        verticalLayout.add(buttonFifthRowLayout);

        Button goToStartPage = new Button("Go to Start page");

        goToStartPage.addClickListener(e -> {
            UI.getCurrent().navigate("home");
        });
        goToStartPage.addThemeVariants(ButtonVariant.LUMO_PRIMARY, ButtonVariant.LUMO_CONTRAST);


        verticalLayout.add(goToStartPage);
        add(verticalLayout);

        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }

}
