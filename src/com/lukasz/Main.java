package com.lukasz;

import java.util.*;

public class Main {

    private static List<Layer> getInput() {
        List<Layer> listOfLayers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data:");

        String line;
        int i = 0;
        while((line = scanner.nextLine()) != "") {
            if(line.equals("")) break;

            String[] currentLayer = line.split(": ");

            Layer layer = new Layer(Integer.parseInt(currentLayer[0]), Integer.parseInt(currentLayer[1]));
            listOfLayers.add(layer);
            i++;
        }

        return listOfLayers;
    }



    public static void main(String[] args) {
        List<Layer> listOfLayers = getInput();

        Solution solution = new Solution(listOfLayers, 0);
        Solution2 solution2 = new Solution2(listOfLayers);

        System.out.println("Severity of your whole trip is " + solution.getSeverityOfTrip() );
        System.out.println("Safe delay is " + solution2.getDelayToPassWithoutGettingCaught() );
    }
}
