package Tombola;

import java.util.Random;

public class Tombola {
    public static void tombola(int[][] cartella){
        if (cartella.length != 3 || cartella[0].length != 5){
            System.out.println("Cartella non valida");
            return;
        }

        Random random = new Random();
        int[] numeriEstratti = new int[20];
        int countEstratti = 0;
        int[] primaRiga = cartella[0];
        int[] secondaRiga = cartella[1];
        int[] terzaRiga = cartella[2];
        int countPrimaRiga = 0;
        int countSecondaRiga = 0;
        int countTerzaRiga = 0;

        while(true){
            int nextNumeroEstratto = random.nextInt(0,90) + 1;
            if (contains(numeriEstratti,nextNumeroEstratto)){
                continue;
            }
            System.out.println("Numero estratto: " + nextNumeroEstratto);

            numeriEstratti[countEstratti++] = nextNumeroEstratto;

            if (contains(primaRiga,nextNumeroEstratto)){
                countPrimaRiga++;
                stampaPremio(countPrimaRiga);
            } else if (contains(secondaRiga,nextNumeroEstratto)){
                countSecondaRiga++;
                stampaPremio(countSecondaRiga);
            } else if (contains(terzaRiga,nextNumeroEstratto)){
                countTerzaRiga++;
                stampaPremio(countTerzaRiga);
            }
            if (countPrimaRiga == 5 && countSecondaRiga == 5 && countTerzaRiga == 5){
                System.out.println("TOMBOLA!!");
                return;
            }
            if (countEstratti == 20){
                System.out.println("Gioco terminato, non hai fatto tombola");
                return;
            }
        }
    }

    public static boolean contains(int[] array, int n ){
        for (int i = 0; i < array.length; i++){
            if (array[i] == n){
                return true;
            }
        }
        return false;
    }

    public static void stampaPremio(int count){
        switch (count){
            case 2 :
                System.out.println("AMBO");
                break;
            case 3 :
                System.out.println("TERNA");
                break;
            case 4 :
                System.out.println("QUATERNA");
                break;
            case 5 :
                System.out.println("CINQUINA");
                break;
            default:
        }

    }

    public static void main(String[] args) {
        int[][] cartella = {{5,12,52,71,89},{9,10,30,68,90},{1,21,44,66,88}};
        tombola(cartella);
    }


}
