interface Amenities {
    void provideAmenities();
}

interface Service {
    void requestService();
}


abstract class HotelRoom {
    private int number;
    private String category;
    private String status;

    // Статическое поле
    private static int Roomcount = 0;

    public HotelRoom(int roomNumber, String category) {
        this.number = roomNumber;
        this.category = category;
        this.status = "Свободен";
        Roomcount++;
    }

    public abstract String getRoomInfo(); // информация о комнате
    public abstract void setRoomFeatures(); // что есть

    // Статический метод для получения общего количества созданных комнат
    public static int getTotalRoomsCreated() {
        return Roomcount;
    }

    // Геттеры
    public int getNumber() {
        return number;
    }

    public String getCategory() {
        return category;
    }

    public String getStatus() {
        return status;
    }

    // Неабстрактные методы
    public boolean checkIn() {
        if (status.equals("Свободен")) {
            status = "Занят";
            System.out.println("Гость заселён в номер " + number);
            return true;
        } else {
            System.out.println("Нельзя заселиться, статус комнаты: " + status);
            return false;
        }
    }

    public boolean checkOut() {
        if (status.equals("Занят")) {
            status = "На уборке";
            System.out.println("Комната " + number + " находится на уборке");
            return true;
        } else {
            System.out.println("Статус комнаты: " + status);
            return false;
        }
    }

    public boolean clean() {
        if (status.equals("На уборке")) {
            status = "Свободно";
            System.out.println("Комната убрана и готова к заселению");
            return true;
        } else {
            System.out.println("Нельзя убраться, статус комнаты: " + status);
            return false;
        }
    }
}


class SuiteRoom extends HotelRoom {
    public SuiteRoom(int number) {
        super(number, "Люкс");
    }

    @Override
    public String getRoomInfo() {
        return "Люкс " + getNumber() + ": " + getCategory();
    }

    @Override
    public void setRoomFeatures() {
        System.out.println("Люкс " + getNumber() + " оснащён: телевизор, мини-бар, сейф.");
    }

    public void orderDinner() {
        if (getStatus().equals("Занят")) {
            System.out.println("Ужин заказан для люкса " + getNumber());
        } else {
            System.out.println("Невозможно заказать ужин в люкс " + getNumber());
        }
    }
}


class BusinessRoom extends HotelRoom implements Service {
    private String equipment;

    public BusinessRoom(int number) {
        super(number, "Комната для встреч");
    }

    @Override
    public String getRoomInfo() {
        return "Комната " + number + ": " + getCategory() + ", оборудование: " + equipment;
    }

    @Override
    public void setRoomFeatures() {
        this.equipment = "Проектор, Wi-Fi, кондиционер";
    }

    @Override
    public void requestService() {
        System.out.println("Обслуживание запрошено для комнаты для встреч " + number);
    }
}

class BunkBedRoom extends HotelRoom implements Amenities {
    private int bunkNumber;

    public BunkBedRoom(int number, int bunkNumber) {
        super(number, "Койко-место");
        this.bunkNumber = bunkNumber;
    }

    @Override
    public String getRoomInfo() {
        return "Койко-место " + number + "-" + bunkNumber + ": " + getCategory();
    }

    @Override
    public void setRoomFeatures() {
        System.out.println("Койко-место " + number + " оснащено: подушка, одеяло.");
    }

    @Override
    public void provideAmenities() {
        System.out.println("Предоставлены общие удобства для койко-места " + number + "-" + bunkNumber);
    }
}

class FamilyRoom extends HotelRoom implements Amenities, Service {
    private int childCount;

    public FamilyRoom(int number, int childCount) {
        super(number, "Семейный номер");
        this.childCount = childCount;
    }

    @Override
    public String getRoomInfo() {
        return "Семейный номер " + number + ": " + getCategory() + ", детей: " + childCount;
    }

    @Override
    public void setRoomFeatures() {
        System.out.println("Номер " + number + " оснащён: кровати, игрушки, детская коляска.");
    }

    @Override
    public void provideAmenities() {
        System.out.println("Предоставлены удобства для детей в комнате " + number);
    }

    @Override
    public void requestService() {
        System.out.println("Обслуживание запрошено для комнаты с детьми " + number);
    }
}



