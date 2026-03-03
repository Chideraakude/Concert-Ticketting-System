public class EventList {

    public static void listOfEvent() {

        if (EventCreation.eventCounter == 0) {
            System.out.println("No Event Available For Purchase");
            return;
        }

        System.out.println("\nList Of Events");
        System.out.println("--------------------------------------------------");

        for (int index = 0; index < EventCreation.eventCounter; index++) {

            System.out.printf(
                "%d. %s | %s | ₦%.2f | Tickets Left: %d\n",
                index + 1,
                EventCreation.eventId[index],
                EventCreation.eventName[index],
                EventCreation.eventPrices[index],
                EventCreation.ticketQuantity[index]
            );
        }
    }
}
