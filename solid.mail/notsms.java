package solid.mail;

class notsms implements NotSend {
    @Override
    public void send(String message) {
        System.out.println("Отправлено через sms" + message);
    }
}
