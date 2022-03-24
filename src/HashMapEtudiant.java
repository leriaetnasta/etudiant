import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEtudiant {
    private Map<String,Etudiant> map= new HashMap<>();
    public HashMapEtudiant(){
        String cin= null;
        for (int i = 0; i < 10; i++) {
            cin= "cin" + (int)(Math.random()*10000);
            map.put(cin,new Etudiant("nom"+1,"prenom"+1,cin,(int)(Math.random()*10000)));

        }


    }
    public void  afficherCinEtudiant(){
        Set<Map.Entry<String,Etudiant>> cinEtudiant = map.entrySet();
        Iterator<Map.Entry<String,Etudiant>> it= cinEtudiant.iterator();
        while (it.hasNext()){
            Map.Entry<String,Etudiant> entry = it.next();
            System.out.println(entry.getKey()+"==>"+entry.getValue());
        }

    }
    public boolean VerifierExistenceCin(String cin){
        return map.containsKey(cin);
    }

    public boolean VerifierExistenceEtudiant(Etudiant etd){
        return map.containsValue(etd);
    }
    public String renvoyerEtudiant(Etudiant etd){
        Set<Map.Entry<String,Etudiant>> cinEtudiant = map.entrySet();
        Iterator<Map.Entry<String,Etudiant>> it= cinEtudiant.iterator();
        while (it.hasNext()){
            Map.Entry<String,Etudiant> entry = it.next();
            if(entry.getValue()==etd){
                return entry.getKey();
            }

        }
        return null;
    }
    public void Ajouter(Etudiant etudiant){
        map.put(etudiant.getCin(),etudiant);
    }
    public boolean supprimer(Etudiant etd){

       return map.remove(etd.getCin(),etd);
    }
    public Boolean supprimer(String cin){
        return map.remove(cin)!=null;
    }

    public void Joindre(Map<String,Etudiant> map){
        this.map.putAll(map);
    }

}
