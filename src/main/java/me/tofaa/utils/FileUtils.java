package me.tofaa.utils;

import me.tofaa.Survivalist;

import java.io.*;
import java.net.URLDecoder;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class FileUtils {


    private static final String resDir = "./src/main/resources/";


    public static String decodeLauncherDir() {
        String decoded = URLDecoder.decode(Survivalist.class.getProtectionDomain().getCodeSource().getLocation().getPath(), StandardCharsets.UTF_8);
        return decoded.substring(0, decoded.lastIndexOf("/"));
    }

    public static InputStream getFileAsIOStream(final String name) {
        return FileUtils.class.getClassLoader().getResourceAsStream(name);
    }

    public static File getLocalFile(final String name) {
        return new File(resDir + name);
    }

    public static void moveWithFileNIO(File from, File to) {

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        from.deleteOnExit();

        try {
            inputStream = new FileInputStream(from);
            outputStream = new FileOutputStream(to);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        final FileChannel inChannel = inputStream.getChannel();
        final FileChannel outChannel = outputStream.getChannel();

        try {
            inChannel.transferTo(0, inChannel.size(), outChannel);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally
        {
            try {
                inChannel.close();
                outChannel.close();
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

    }


}
