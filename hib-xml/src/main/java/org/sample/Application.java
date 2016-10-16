package org.sample;

public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentDao dao = new StudentDao();
        dao.save();
    }
}
