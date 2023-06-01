package LessonTask.LessonTask11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Method {
    public static void main(String[] args) {
        String a = "Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills!";
        Pattern pattern = Pattern.compile("");
        Matcher matcher = pattern.matcher(a);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
