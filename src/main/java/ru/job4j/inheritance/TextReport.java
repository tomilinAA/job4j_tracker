package ru.job4j.inheritance;

public class TextReport {
    public String generate(String name, String body) {
        return name + "name" + System.lineSeparator() + body + "body";
    }

    public class ReportUsage {
        public static void main(String[] args) {
            TextReport report = new TextReport();
            String text = report.generate("Report's name", "Report's body");
            System.out.println(text);
        }
    }
}