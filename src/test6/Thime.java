package test6;

public class Thime {
    private int thime;
    private int minute;
    private int seconde;

    public Thime(int thime, int minute, int seconde){
        setThime(thime, minute, seconde);
    }

    public void setThime(int thime, int minute, int seconde){
        if(isValidThime(thime, minute, seconde)){
            this.thime = thime;
            this.minute = minute;
            this.seconde = seconde;
        }else {
            this.minute = 0;
            this.seconde = 0;
            this.thime = 0;
            System.out.println("Ошибка: недопустимые значения времени. Установлено значение 00:00:00.");
        }        
    }

    private boolean isValidThime(int thime, int minute, int seconde){
        return thime >= 0 && thime <= 23 && minute <= 59 && minute >= 0 && seconde <= 59 && minute >= 0;
    }

    public void addThimes(int thimes){
        int newThime = (thime + thimes) % 24;
        setThime(newThime, minute, seconde);
    }

    public void addMinute(int minutes){
        int totalMinutes = thime * 60 + minute + minutes;
        int newThime = (totalMinutes /60) % 24;
        int newMinute = totalMinutes % 60;
        setThime(newThime, newMinute, seconde);
    }

    public void addSecond(int seconds){
        int totalSecond = thime * 3600 + minute * 60 + seconde + seconds;
        int newThime = (totalSecond / 3600)% 24;
        int newMinute = (totalSecond / 3600)/ 60;
        int newSecond = totalSecond % 60;
        setThime(newThime, newMinute, newSecond);
    }

    public String getThime(){
        return String.format("%02d:%02d:%02d", thime, minute, seconde);
    }

}

class Test{
    public static void main(String[] args) {
        Thime thime = new Thime(3, 8, 45);
        System.out.println("Текущее время: " + thime.getThime());
       thime.addThimes(2);
        System.out.println("Время после добавления 2 часов: " + thime.getThime());

        thime.addMinute(15);
        System.out.println("Время после добавления 15 минут: " + thime.getThime());

        thime.addSecond(30);
        System.out.println("Время после добавления 30 секунд: " + thime.getThime());
        System.out.println(thime.getThime());
    }
}
