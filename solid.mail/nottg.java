package solid.mail;

class nottg implements NotServ {
    @Override
    public void send(String message) {
        System.out.println("Отправлено через телеграмм: " + message);
    }
}
