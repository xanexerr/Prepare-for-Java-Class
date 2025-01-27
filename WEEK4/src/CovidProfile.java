
// Name: Natthapumin Klammat
// ID: 6787028
// Section: 1

// Task 1: สร้าง class CovidProfile (CovidProfile.java) ที่มีattributes 
public class CovidProfile {
        String date;
        String location;
        int accumulatedCases;
        int curedCases;
        int deathCases;

        // Task 2: สร้าง 2 Constructor methods
        // 1. ไม่มี parameter
        public CovidProfile() {
                date = "none";
                location = "none";
                accumulatedCases = 0;
                curedCases = 0;
                deathCases = 0;
        }

        // 2. มี parameter 5 ตัว
        public CovidProfile(String _date, String loc, int noAcc, int noCured, int noDeath) {
                date = _date;
                location = loc;
                accumulatedCases = noAcc;
                curedCases = noCured;
                deathCases = noDeath;
        }

        public String getLocation() {
                return location;
        }

        public int getAccCases() {
                return accumulatedCases;
        }

        public int getCuredCases() {
                return curedCases;
        }

        public int getDeathCases() {
                return deathCases;
        }

        public void setLocation(String loc) {
                location = loc;
        }

        public void setAccCases(int cases) {
                accumulatedCases = cases;
        }

        public void setCuredCases(int cases) {
                curedCases = cases;
        }

        public void setDeathCases(int cases) {
                deathCases = cases;
        }

        public void printCovidInfo() {
                System.out.println(location + " at " + date);
                System.out.println("Accumulative Patient : " + accumulatedCases);
                System.out.println("Cured Patient : " + curedCases);
                System.out.println("Death Case : " + deathCases);
                System.out.println();
        }
        
        
		/*
		Challenge Bonus (Optional):
		1. ใน class CovidProfile ให้ใช้static variable เพื่อนับจำนวน Covidprofile object ที่ถูกสร้างขึ้น จากนั้นให้
		แสดงจำนวนใน main method ใน class CovidReporter.
		2. ใน class CovidProfile, ให้สร้าง method ชื่อ isSevere() ที่ returns ค่า จริงหรือเท็จ (true,false) โดย
		method จะคืนค่าจริงถ้าจำนวนผู้เสียชีวิตมากกว่า 10,000 คน และมีการเรียกใช้ method นี้ใน class
		CovidReporter
		 */
        private static int profileCount = 0;

        {
                profileCount++;
        }

        public static int getProfileCount() {
                return profileCount;
        }

        public boolean isSevere() {
                return deathCases > 10000;
        }

}
