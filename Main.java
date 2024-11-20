import java.util.*;

public class Main {

    public static void main(String[] args){

        double lengthOfStreet;
        int numberOfLights;
        int maxLength = 0; //legnagyobb lámpa nélküli szakasz
        Scanner scanner = new Scanner(System.in);
        List<Integer> takenPositions = new ArrayList<>(); //lámpák pozícióit tároló lista

        String input = scanner.nextLine(); //beolvasom az első sort
        String[] adatok = input.split(" "); //feldarabolom a szóközök mentén
        lengthOfStreet = Integer.parseInt(adatok[0]);
        numberOfLights= Integer.parseInt(adatok[1]);

        input = scanner.nextLine(); //beolvasom a következő sort
        String[] positions= input.split(" "); //feldarabolom a szóközök mentén


        for(int j = 0; j < numberOfLights; j++) //a foglalt pozíciókat tároló lista feltöltése
        {
            takenPositions.add(Integer.valueOf(positions[j]));
        }

        //ELSŐ LÁMPA KIHELYEZÉSE UTÁNI LEGHOSSZABB SZAKASZ:
        if(takenPositions.get(0) < lengthOfStreet/2) //kapott szám kisebb, mint az az utcahossz fele
        {
            maxLength = (int) (lengthOfStreet - takenPositions.get(0));
        }
        else if(takenPositions.get(0) >= lengthOfStreet/2) //kapott szám nagyobb, vagy egyenlő, mint az utcahossz fele
        {
            maxLength = takenPositions.get(0);
        }

        int[] maxLengths = new int[numberOfLights]; //a szakaszokat tároló tömb létrehozása

        maxLengths[0] = maxLength;

        for(int i = 0; i < numberOfLights; i++)
        {
            if(maxLengths[0] > lengthOfStreet/2)
            {
                if(takenPositions.get(i) < maxLengths[0])
                {
                    maxLengths[i] = (int) (lengthOfStreet/2 + (takenPositions.get(i) - lengthOfStreet/2));
                }
                else
                {
                    maxLengths[i] = maxLengths[0];
                }
            }
            else if(maxLengths[0] <= lengthOfStreet/2)
            {
                if(takenPositions.get(i) > maxLengths[0])
                {
                    int ertek = (int) (lengthOfStreet/2 + (lengthOfStreet/2 - takenPositions.get(i)));
                    maxLengths[i] = ertek;
                }
                else
                {
                    maxLengths[i] = maxLengths[0];
                }

            }

            System.out.println(maxLengths[i]);

        }

    }
}
