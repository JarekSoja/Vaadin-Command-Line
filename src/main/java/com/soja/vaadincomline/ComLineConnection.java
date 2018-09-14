package com.soja.vaadincomline;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ComLineConnection {

    public static Process createConnection() {
        List<String> command = new ArrayList<>();
        command.add("cmd");
        command.add("/K");
        command.add("batch.bat");

        ProcessBuilder pb = new ProcessBuilder(command);
        pb.redirectErrorStream(true);
        pb.directory(new File("D:\\Temp"));
        pb.redirectInput(ProcessBuilder.Redirect.INHERIT);
        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);

        try {
            Process process = pb.start();
            return process;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
