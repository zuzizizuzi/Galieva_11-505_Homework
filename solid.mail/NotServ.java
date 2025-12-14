package solid.mail;

class HotMail implements NotSend {
    @Override
    public void send(String message) {
        System.out.println("Отправлено через мейл" + message);
    }
}
