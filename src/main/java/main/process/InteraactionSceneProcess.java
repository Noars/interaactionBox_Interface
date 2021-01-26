package main.process;

import java.io.IOException;

public class InteraactionSceneProcess implements AppProcess {

    ProcessBuilder processBuilder;

    @Override
    public void setUpProcessBuilder() {
        processBuilder = new ProcessBuilder(AppProcess.getBrowser(),
                "--kiosk",
                "--window-position=0,0",
                "--disable-gpu",
                "--no-sandbox",
                "--fullscreen",
                "http://interaactionScene.net/");
    }

    @Override
    public Process start() {
        try {
            return processBuilder.inheritIO().start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
