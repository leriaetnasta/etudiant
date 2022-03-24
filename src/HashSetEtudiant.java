import java.util.*;

public class HashSetEtudiant {
        private Set<Etudiant> set= new HashSet<>();
        public HashSetEtudiant(){
            for (int i=0; i<10; i++){
                set.add(new Etudiant("nom"+1,"prenom"+1,"cin" + (int)(Math.random()*10000),(int)(Math.random()*10000)));
            }

        }
        public void afficher(){
            Iterator<Etudiant> it= set.iterator();
            while(it.hasNext()){
                Etudiant etd = it.next();
                System.out.println(etd);
            }
        }
        public boolean supprimer(Etudiant et){
            return set.remove(et);
        }
        public boolean verifierExistence(Etudiant et){
            return set.contains(et);
        }
        public static void main(String[] args) {
            HashSetEtudiant set= new HashSetEtudiant();
            set.afficher();
        }


}
