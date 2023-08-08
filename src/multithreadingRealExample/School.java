package multithreadingRealExample;

class Show {
    public void showSchool(String name) {
//        public synchronized void showSchool(String name) {
        System.out.println("xoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxox" + name);
        synchronized (this) {
            for (int i = 0; i >= 3; i++) {
                System.out.println("synchronized...");
            }
        }
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + name);
    }
}

class School extends Thread {

    Show sh;
    String name;

    School(Show sh, String name) {
        this.sh = sh;
        this.name = name;
    }

    @Override
    public void run() {
        sh.showSchool(name);
    }
}

class Abcd {
    public static void main(String[] args) {
        Show sh = new Show();
        School school1 = new School(sh, "NBCBHS");
        School school2 = new School(sh, "NBCGHS");

        school1.start();
        school2.start();

    }
}
