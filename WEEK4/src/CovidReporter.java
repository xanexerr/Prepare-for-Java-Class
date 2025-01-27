// Name: Natthapumin Klammat
// ID: 6787028
// Section: 1

//สร้าง class CovidReporter (CovidReporter.java)ซึ่ง class นี้จะมี main method อยู่ 
public class CovidReporter {
    public static void main(String[] args) {
        CovidProfile covid1 = new CovidProfile();
        CovidProfile covid2 = new CovidProfile("2021-01-29", "THAILAND", 17023, 11396, 76);

        covid1.setLocation("CHINA");
        covid1.setAccCases(999);
        covid1.setCuredCases(199);
        covid1.setDeathCases(9);

        System.out.println("=== Covid-19 Information ===");
        System.out.println();
        covid1.printCovidInfo();
        covid2.printCovidInfo();
}
}
