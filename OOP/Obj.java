public class Obj {
    public static void main(String[] args) {
        Bankacc p1 = new Bankacc();
        p1.name="charles";
        System.out.println(p1.name);
        p1.setPass("asdfghjkl");
        System.out.println(p1.showPass());

    }
}

class Bankacc{
    String name;
    private String password;
    void setPass(String pwd){
        password = pwd;
        
    }
    String showPass(){
        return password;

    }
}