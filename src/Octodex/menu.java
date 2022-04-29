package Octodex;

public class menu {
     public static void main(String[] args) {
       Dinotocat();
       Catstello();
       Inspectocat();
       Spidertocat();
       Defunktocat();
       Plumber();

    }
    static void Dinotocat(){
         Dinotocat octo = new Dinotocat();
         System.out.println(octo.showMessage());
    }
    static void Catstello(){
         Catstello octo = new Catstello();
         System.out.println(octo.showMessage());
    }
    static void Inspectocat(){
        Inspectocat octo = new Inspectocat();
        System.out.println(octo.showMessage());
    }

    static  void Spidertocat(){
        Spidertocat octo = new Spidertocat();
        System.out.println(octo.showMessage());
    }
    static  void  Defunktocat(){
        Defunktocat octo = new Defunktocat();
        System.out.println(octo.showMessage());
    }
    static  void Plumber(){
        Plumber octo = new Plumber();
        System.out.println(octo.showMessage());
    }


}
