package class21HW;

public class Computer {
    String display;
    String keyboard;
    int ramSize;



    void playMusic() {
        System.out.println("Calm music playing");
    }

    void surfWeb() {
        System.out.println("Reading webpages");
    }

    void watchVideo() {
        System.out.println("Watching Java tutorial");
    }

    void liveStream() {
        System.out.println("Live streaming an event");
    }
}
class Apple extends Computer {

    void liveStream() {
        System.out.println("Live streaming an event");
    }

    void searchAppStore() {
        System.out.println("Searching for an app");
    }
}
class Lenovo extends Computer {
    Lenovo() {
    }

    void surfWeb() {
        System.out.println("Reading webpages");
    }

    void shopAmazon() {
        System.out.println("Shopping with Prime on Amazon");
    }
}
class HP extends Computer {

    void playMusic() {
        System.out.println("Calm music playing");
    }

    void studyOnline() {
        System.out.println("Studying online for test");
    }
}
class Dell extends Computer {

    void watchVideo() {
        System.out.println("Watching Java tutorial");
    }

    void playGames() {
        System.out.println("Playing Minecraft");
    }
}

class ComputerTester {

    public static void main(String[] args) {
        Computer[] comp = new Computer[]{new Apple(), new Lenovo(), new HP(), new Dell()};
        Computer[] var2 = comp;
        int var3 = comp.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Computer brand = var2[var4];
            if (brand instanceof Apple) {
                ((Apple)brand).searchAppStore();
                ((Apple)brand).liveStream();
            } else if (brand instanceof Lenovo) {
                ((Lenovo)brand).shopAmazon();
                ((Lenovo)brand).surfWeb();
            } else if (brand instanceof HP) {
                ((HP)brand).studyOnline();
                ((HP)brand).playMusic();
            } else if (brand instanceof Dell) {
                ((Dell)brand).playGames();
                ((Dell)brand).watchVideo();
            }
        }

    }
}