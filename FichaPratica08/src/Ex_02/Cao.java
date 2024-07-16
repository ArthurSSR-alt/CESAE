package Ex_02;

public class Cao {
   private String nome;
   private Racas raca;
   private String latido= "Au au au";

   public Cao (String nome, Racas raca){
       this.nome= nome;
       this.raca=raca;

   }
public void setLatido (String latido){
this.latido=latido;

}
public void ladrar(){
    System.out.println(this.latido);

}


}
