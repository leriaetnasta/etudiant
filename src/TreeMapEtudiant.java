import com.sun.source.tree.Tree;

import java.util.*;

public class TreeMapEtudiant {
    private SortedMap<String,Etudiant> treeMap= new TreeMap<>();
    private SortedMap<Integer, Etudiant> cneTreeMap= new TreeMap<>();

    public TreeMapEtudiant(){
        String cin=null;
        for (int i = 0; i < 10; i++) {
            cin= "cin" + (int)(Math.random()*10000);
            treeMap.put(cin, new Etudiant("nom" + i , "prenom" + i, cin, i));
        }
    }
    public void  afficher(){
        Set<Map.Entry<String,Etudiant>> etudiant = treeMap.entrySet();
        Iterator<Map.Entry<String,Etudiant>> it= etudiant.iterator();
        while (it.hasNext()){
            Map.Entry<String,Etudiant> entry = it.next();
            System.out.println(entry.getKey()+"==>"+entry.getValue());
        }

    }
    public Etudiant premierEtudiant(){
        return treeMap.get(treeMap.firstKey());
    }
    public Etudiant dernierEtudiant(){
        return treeMap.get(treeMap.lastKey());
    }
    public SortedMap<String,Etudiant> entreDeuxValeurs(String cle1,String cle2){
        return treeMap.subMap(cle1,cle2);
    }
    public SortedMap<String,Etudiant> superieur(String cle){
        return treeMap.tailMap(cle);
    }
    public SortedMap<String,Etudiant> inferieur(String cle){
        return treeMap.headMap(cle);
    }
    public Comparator<?> renvoyerComparateur(){
        return treeMap.comparator();
    }
    public String renvoyerCin(Etudiant etd){
        Set<Map.Entry<String,Etudiant>> etudiant = treeMap.entrySet();
        Iterator<Map.Entry<String,Etudiant>> it= etudiant.iterator();
        Map.Entry<String,Etudiant> entry = it.next();
        while (it.hasNext()){
            entry = it.next();
            if(entry.getValue()==etudiant)
                return entry.getKey();
        }
        return null;
    }
    public void Joindre(Map<String,Etudiant> map){
        this.treeMap.putAll(map);
    }
    public static void main(String[] args) {
        TreeMapEtudiant treemap= new TreeMapEtudiant();
        treemap.afficher();
    }
}
