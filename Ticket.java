    public void createEvent() {
        System.out.print("Enter event ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter event name: ");
        String name = scanner.nextLine();

        System.out.print("Total tickets: ");
        int total = scanner.nextInt();

        System.out.print("Price: ");
        double price = scanner.nextDouble();

        System.out.print("Max tickets per user: ");
        int max = scanner.nextInt();
        scanner.nextLine();

        events.add(new Event(id, name, total, price, max));
        System.out.println("Event created successfully!");
    }
