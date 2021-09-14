package game;

import java.util.ArrayList;

/*      Ideia:
Geração aleatória simples para tipos diferentes de combates baseado no nível.*/
public class AcharCombate {
    public static void encontro(ArrayList<Personagem> personagens,Mochila mochila) {
        
        Guerreiro n = (Guerreiro)personagens.get(0);
        int l=n.getLvl();
        int r=RandomRoll.encounterRoll();
        if(l<5) {
            if(r>=60) {
                CombateSlime combate = new CombateSlime();
                System.out.println("!~!~! Os heróis são atacados por 2 slimes !~!~!");
                combate.lutar(personagens,mochila);
            }
            if(r<40) {
                CombateZumbi combate = new CombateZumbi();
                System.out.println("!~!~! Os heróis são atacados por 4 zumbis !~!~!");
                combate.lutar(personagens, mochila);
            }
        }else if (l>=5){
            CombateGenerico combate = new CombateGenerico();
                System.out.println("!~!~! Os heróis são atacados por 4 Goblins !~!~!");
                combate.lutar(personagens,mochila);
        }
        
    }
}
