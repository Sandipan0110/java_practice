package oops.encaptulation;

public class ChotaDon {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Don {
    public static void main(String[] args) {
        ChotaDon chotaDon = new ChotaDon();
        chotaDon.setName("Sandipan");
        System.out.println("Name is : " + chotaDon.getName());
    }
}
