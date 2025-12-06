public class CR2 {
    public static void main(String[] args) {
        // Создаём разные типы комнат
        SuiteRoom suite = new SuiteRoom(801);
        BusinessRoom business = new BusinessRoom(101);
        BunkBedRoom bunk = new BunkBedRoom(201, 3);
        FamilyRoom family = new FamilyRoom(301, 2);

        // Проверяем начальный статус
        System.out.println("Статусы комнат");
        System.out.println("Люкс: " + suite.getStatus());
        System.out.println("Комната для встреч: " + business.getStatus());
        System.out.println("Койко-место: " + bunk.getStatus());
        System.out.println("Семейный номер: " + family.getStatus());

        // Проверяем информацию о комнатах
        System.out.println(" Информация о комнатах ");
        business.setRoomFeatures();
        System.out.println(business.getRoomInfo());

        bunk.setRoomFeatures();
        System.out.println(bunk.getRoomInfo());

        family.setRoomFeatures();
        System.out.println(family.getRoomInfo());

        // Заселяем гостей
        System.out.println("Заселение");
        suite.checkIn();
        business.checkIn();
        bunk.checkIn();
        family.checkIn();

        // Используем специфичные методы
        System.out.println(" Использование специфичных методов ");
        suite.orderDinner(); // Только у люкса
        business.requestService(); // Реализует Service
        bunk.provideAmenities(); // Реализует Amenities
        family.provideAmenities(); // Реализует Amenities
        family.requestService(); // Реализует Service

        // Выселяем гостей
        System.out.println("\n=== Выселение ===");
        suite.checkOut();
        business.checkOut();
        bunk.checkOut();
        family.checkOut();

        // Убираем комнаты
        System.out.println("\n=== Уборка ===");
        suite.clean();
        business.clean();
        bunk.clean();
        family.clean();

        // Проверяем финальные статусы
        System.out.println("\n=== Финальные статусы комнат ===");
        System.out.println("Люкс: " + suite.getStatus());
        System.out.println("Комната для встреч: " + business.getStatus());
        System.out.println("Койко-место: " + bunk.getStatus());
        System.out.println("Семейный номер: " + family.getStatus());
    }
}