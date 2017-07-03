/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortMethods;

/**
 *
 * @author leo
 */
public class Methods {

  
    //Bubble
    public static void bubbleSort( int [] v){
        int n = v.length-1; //Igualo n al largo de las filas
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (v[j]>v[j+1]) {
                    int aux = v[j];
                    v[j]=v[j+1];
                    v[j+1]=aux;
                }
            }
        }
    }
    
    //Insertion
    public static void insertionSortMethod(int []v){
        for (int i = 1; i < v.length; i++) {//Comienzo el conteo de 1 porque voy a referenciar a 0 luego
            int aux = v[i];//Gurdo el valor de la posición i en aux
            int j = i-1; //igual j a la posición anterior de i
            while(j>=0 && v[j]>aux){ /*Si j es >=0 o sea que solo va a controlar hasta que llegue a 0, y 
                v[j]>aux o sea, el valor de la posición de j > que el valor de la posición en i*/
                v[j+1]=v[j];//Entonces, como i siempre es 1 mas que j,  igualo la posición de j a la de i y arreglo hacia atrás. 
                j--;
            }
            v[j+1]= aux;
        }
    }
    
    //selection
    public void selectionSort(int [] v){
        
    }
    
    //Merge
    public void mergSort(int [] v1,int [] v2){
        
    }
    
    //Quick
    public void quickSort(int [] v){
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
