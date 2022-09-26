package Installation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder str = new StringBuilder();
        File dir = new File("D://Games//src");
        if (dir.mkdir()) {
            str.append("Каталог src создан.");
            str.append("\n");
        } else {
            str.append("Каталог src не создан.");
            str.append("\n");
        }
        File res = new File("D://Games//res");
        File savegames = new File("D://Games//savegames");
        File temp = new File("D://Games//temp");
        if (res.mkdir()) {
            str.append("Каталог res создан.");
            str.append("\n");
        } else {
            str.append("Каталог res не создан.");
            str.append("\n");
        }
        if (savegames.mkdir()) {
            str.append("Каталог savegames создан.");
            str.append("\n");
        } else {
            str.append("Каталог savegames не создан.");
            str.append("\n");
        }
        if (temp.mkdir()) {
            str.append("Каталог temp создан.");
            str.append("\n");
        } else {
            str.append("Каталог temp не создан.");
            str.append("\n");
        }
        File main = new File(dir, "main");
        File test = new File(dir, "test");
        if (main.mkdir()) {
            str.append("Каталог main создан.");
            str.append("\n");
        } else {
            str.append("Каталог main не создан.");
            str.append("\n");
        }
        if (test.mkdir()) {
            str.append("Каталог test создан.");
            str.append("\n");
        } else {
            str.append("Каталог test не создан.");
            str.append("\n");
        }
        File file = new File(main, "Main.java");
        File file1 = new File(main, "Utils.java");
        try {
            if (file.createNewFile()) {
                str.append("Файл Main.java создан.");
                str.append("\n");
            } else {
                str.append("Файл Main.java не создан.");
                str.append("\n");
            }
            if (file1.createNewFile()) {
                str.append("Файл Utils.java создан.");
                str.append("\n");
            } else {
                str.append("Файл Utils.java не создан.");
                str.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        File drawables = new File(res, "drawables");
        File vectors = new File(res, "vectors");
        File icon = new File(res, "icon");
        if (drawables.mkdir()) {
            str.append("Каталог drawables создан.");
            str.append("\n");
        } else {
            str.append("Каталог drawables не создан.");
            str.append("\n");
        }
        if (vectors.mkdir()) {
            str.append("Каталог vectors создан.");
            str.append("\n");
        } else {
            str.append("Каталог vectors не создан.");
            str.append("\n");
        }
        if (icon.mkdir()) {
            str.append("Каталог icon создан.");
            str.append("\n");
        } else {
            str.append("Каталог icon не создан.");
            str.append("\n");
        }

        File file2 = new File(temp, "temp.txt");
        try {
            if (file2.createNewFile()) {
                str.append("Файл temp.txt создан.");
                str.append("\n");
            } else {
                str.append("Файл temp.txt не создан.");
                str.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileWriter writer = new FileWriter(file2);
        writer.write(String.valueOf(str));
        writer.flush();
        writer.close();
    }
}
