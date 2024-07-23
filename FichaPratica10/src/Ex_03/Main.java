package Ex_03;

public class Main {
    public static void main(String[] args) {

        Peixe peixe1 = new Peixe("Baiacu",8,10);
        Peixe peixe2 = new Peixe("Piranha",5,2);
        Peixe peixe3 = new Peixe("Tubarão",200,40);

        Marisco caranguejo = new Marisco("Caranguejo",200,100);
        Marisco ameijoa = new Marisco("Ameijoa", 50,90);
        Marisco lagosta = new Marisco("Lagosta", 150, 200);

        BarcoPesca bp = new BarcoPesca("Santa Maria do Mar","Preto", 2024,20,300,Marca.BENTZ);

        bp.addPeixe(peixe1);
        bp.addPeixe(peixe3);
        bp.addMarisco(ameijoa);

    }

}
