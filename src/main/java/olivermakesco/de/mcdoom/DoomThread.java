package olivermakesco.de.mcdoom;

import mochadoom.Engine;

public class DoomThread extends Thread {
    @Override
    public void run() {
        try {
            Engine engine = new Engine();
            engine.DOOM.setupLoop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
