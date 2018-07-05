package fr.exia.JeuBatonFinal;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
int nbreInitialallumettes = 20; // Debut d'initialisation des variables
int nbreAllumettes = 0;
int determinerJoueur = 0;
char reponse = ' ';
String joueur = new String(); // Fin d'initialisation des variables
 
System.out.println("Le nombre initial d'allumettes est de "+ nbreInitialallumettes +"!");
System.out.println("Le but du jeu est tout simple, vous devez enlever 1, 2 ou 3 allumettes par tour!");
System.out.println("Le joueur prenant la dernière allumette perdra la partie!");
System.out.println("--------------------------------------------------------------------------------");
Scanner sc = new Scanner(System.in);//vaut mieux qu'elle soit dehors
int nbreaenlever;
do{ // Tant que l'utilisateur envoie le char 'O', on exécute cette boucle
do{ // Tant que le nbre d'allumettes est > que O on exécute cette boucle
if (determinerJoueur % 2 == 0 || determinerJoueur == 0) // Permet de switcher les joueurs
joueur = "Joueur 1";
else
joueur = "Joueur 2";
determinerJoueur++;
 
System.out.println(joueur+" combien d'allumettes souhaitez vous retirer?");
nbreaenlever = sc.nextInt();
 
if (nbreaenlever > 3 || nbreaenlever < 1)
{
nbreaenlever = 0;
System.out.println("Impossible d'éffectuer cette opération (le nombre d'allumettes à enlever est erroné)");
System.out.println(joueur+" passe son tour!");
}
if (determinerJoueur == 1) // L'incrementation a déjà eu lieu ci-dessus donc la variable vaut 1 au départ
{
nbreAllumettes = nbreInitialallumettes - nbreaenlever;
}
if (determinerJoueur > 1)
{
nbreAllumettes = nbreAllumettes - nbreaenlever;
}
System.out.println("Il reste donc "+nbreAllumettes+" allumettes!");
System.out.println("--------------------------------------------");
 
}while(nbreAllumettes > 0);
if (joueur.equalsIgnoreCase("Joueur 1") )
joueur = "Joueur 2";
else
joueur = "Joueur 1";
System.out.println(joueur+" a gagné la partie!");
System.out.println("--------------------------");
System.out.println("Voulez vous rejouer? (O/N)");
//Scanner sc = new Scanner(System.in);
String str = sc.next();
reponse = str.charAt(0);
if(reponse=='o'|reponse=='O'){
determinerJoueur = 0;
nbreAllumettes = 0;
 
 
}
 
}while(reponse == 'O'|reponse == 'o');
System.out.println("Au revoir!");
}
}