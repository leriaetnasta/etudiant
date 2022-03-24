import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class listEtudiant {
    private List<Etudiant> liste= new ArrayList<>();
    public listEtudiant(){
        for (int i=0; i<10; i++){
            liste.add(new Etudiant("nom"+i,"prenom"+i,"cin" + (int)(Math.random()*10000),(int)(Math.random()*10000)));
        }

    }
    public void Ajouter(Etudiant etd){
        if(etd==null)
            return;
        liste.add(etd);
    }
    public void afficher(){
        Iterator<Etudiant> it= liste.iterator();
         while(it.hasNext()){
             Etudiant etd = it.next();
             System.out.println(etd);
         }
    }
    public boolean supprimer(Etudiant et){
        return liste.remove(et);
    }
    public boolean verifierExistence(Etudiant et){
        return liste.contains(et);
    }

    public void trierParCin(){
        Collections.sort(liste,new ComparateurParCne());
    }
    public void TrierEtudiant(){
        Collections.sort(liste, new ComparateurParCne());
    }

    public static void main(String[] args) {
        listEtudiant liste= new listEtudiant();
        liste.afficher();
        liste.trierParCin();
        liste.afficher();

    }
}
