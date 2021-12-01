package view;

import java.util.ArrayList;
import java.util.Hashtable;

import controller.HashController;

public class Principal {

	public static void main(String[] args) {
		
		HashController hash = new HashController();
		Hashtable<Integer, ArrayList<Integer>> numeros = new Hashtable<Integer, ArrayList<Integer>>();
		ArrayList<Integer> listZero = new ArrayList<Integer>();
		ArrayList<Integer> listDois = new ArrayList<Integer>();
		ArrayList<Integer> listQuatro = new ArrayList<Integer>();
		int[] vet = {2,7,8,8,9,10,99,11,23,32,23,35,63,2,3,6,12};
		int chave;
		
		for(int i = 0; i < vet.length; i++){
			chave = hash.minhaFuncaoHash(vet[i]);
			switch(chave){
			case 0:
				if(listZero.isEmpty()) numeros.put(chave, listZero);
					listZero.add(vet[i]);
					break;
			case 2:
				if(listZero.isEmpty()) numeros.put(chave, listDois);
				listDois.add(vet[i]);
				break;
			case 4:
				if(listZero.isEmpty()) numeros.put(chave, listQuatro);
				listQuatro.add(vet[i]);
				break;
				
			}
		}
		
		System.out.println(numeros.toString());
	}

}
