import java.util.NoSuchElementException;

//Class
public class fakearr {
    //fields
    public static int[] arrfield;
    public static int aliveele;

    //Constructor
    public fakearr(int length){
        arrfield = new int[length];
        aliveele =0;

    }
    //methods
    public boolean equals(fakearr other){
        boolean eq = true;
        if(this.aliveele != other.aliveele){
            eq = false;
        }
        if(this.arrfield.length != other.arrfield.length){
            return false;
        }
        for(int i =0; i<arrfield.length; i++){
            if(other.arrfield[i] != this.arrfield[i]){
                eq = false;
            }
        }
        return eq;
    }

    public boolean equalElts( fakearr other){
         int[] ar;
         if(other.arrfield.length > this.arrfield.length){
             ar = this.arrfield;
         }
         else{
             ar=other.arrfield;
         }
         for(int i =0; i<ar.length; i++){
             if(this.arrfield[i] != other.arrfield[i]){
                 return false;
             }
         }
         return true;
    }

    public fakearr empty(){
        return new fakearr(0);
    }

    public int length(){
        return aliveele;
    }

    public int get(int ind){
        if(arrfield.length >= ind){
            throw new NoSuchElementException();
        }
        else{
            return arrfield[ind];
        }
    }
    public void set(int ind, int value){
        if(arrfield.length>= ind){
            throw new NoSuchElementException();
        }
        else{
            arrfield[ind]=value;
        }
    }
    public void insert(int ind, int ele){
        if(ind >= arrfield.length){
            throw new NoSuchElementException();
        }
        int[] newarr = new int[arrfield.length +1];
        for(int i = 0; i<ind; i++){
            newarr[i] =arrfield[i];
        }
        newarr[ind] = ele;
        for(int j= ind+1; j<newarr.length; j++){
            newarr[j] = arrfield[j-1];
        }
        arrfield = newarr;
        aliveele++;
    }


    // WORK ON THE NULL VS FULL ARRAY THING
    //prof says not to make a new array every time, only if full

    public void addToEnd(int ele){
        int[] newarr;
        if(aliveele == arrfield.length){
             newarr = new int[(arrfield.length)*2 ];
        }
        else{
            newarr = new int[arrfield.length ];
        }
        for(int i=0; i < arrfield.length; i++){
            newarr[i] = arrfield[i];
        }
        newarr[arrfield.length] = ele;
        arrfield = newarr;
        aliveele++;
    }
    public void addToStart(int ele){
        int[] newarr;
        if(aliveele == arrfield.length){
            newarr = new int[(arrfield.length)*2 ];
        }
        else{
            newarr = new int[arrfield.length ];
        }


        newarr[0] = ele;
        for(int i= 1; i<arrfield.length+1; i++){
            newarr[i] = arrfield[i-1];
        }
        arrfield = newarr;
        aliveele++;
    }
     //check ts bc huh
    public void remove(int ind){

        int[] newarr = new int[arrfield.length -1];
        for(int i = 0; i<ind; i++){
            newarr[i] =arrfield[i];
        }
        for(int i= ind+1; i<arrfield.length -1; i++){
            newarr[i-1] = arrfield[i];
        }
        aliveele--;

    }










}
