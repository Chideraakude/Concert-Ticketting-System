public void menu() {
    int choice = 0;

    while (choice != 5) {
        System.out.println("\n--- Ticket System Menu ---");
        System.out.println("1. Register User");
        System.out.println("2. Create Event");
        System.out.println("3. List Events");
        System.out.println("4. Buy Ticket");
        System.out.println("5. Exit");

        choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:
                registerUser();
                break;
            case 2:
                createEvent();
                break;
            case 3:
                listEvents();
                break;
            case 4:
                buyTicket();
                break;
            case 5:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid option!");
        }
    }
}
