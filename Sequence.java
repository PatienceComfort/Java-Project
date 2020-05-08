//Etape 1: Créer la classe Séquence
public class Sequence{
  //attributs
   String seq;
   int taille;
   int nom;
//Constructeur
  public Sequence(int nom){
    this.nom = nom;
  }
//Méthodes
   String getSeq(){
    return seq;
  }
  public Sequence parser(){
    //Permet de lire le fichier et de
    //le séparer en plusieurs objets séquences
  }
  double alignement(){
//insérer code
    return score;
  }
}

//Mettre ailleurs

//Etape 2: Lire le fichier ligne par ligne et instancier les objets séquence
public class Parser{

}


main{
  ouvrir le fichier fasta;
  int longeur = 0;
  String seq = '';
  int nom;
  lire chaque ligne
  si la ligne commence par >, incrémenter nb_de_seq de 1
    int nom = > et ce qui suit

  sinon
    int longueur += length(ligne)
    String seq += ligne;
  S+nb_de_seq = new Sequence (nom);
  S+nb_de_seq.seq = seq;
  S+nb_de_seq.taille = longueur;
}
Normalement à la fin on devrait obtenir nos 21 séquences
