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
    //only expect alive

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
        return arrfield.length;
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

        for(int k =0; k < arrfield.length; k++){
            if( arrfield[k] == 0){ //this was suppose to check if null idk
                throw new NoSuchElementException("Theres still space between the list and where your inserting, go use set method");
            }
        }
        if(aliveele >= arrfield.length){
            int[] newarr = new int[arrfield.length *2];
            for(int j= 0; j< arrfield.length; j++){
                newarr[j]= arrfield[j];
            }
            arrfield =newarr;
        }
        for(int i = arrfield.length-2; i>=ind; i-- ){
            arrfield[i+1] = arrfield[i];
        }
        arrfield[ind]= ele;
        aliveele++;
    }


    // WORK ON THE NULL VS FULL ARRAY THING
    //prof says not to make a new array every time, only if full

    public void addToEnd(int ele){
        if(aliveele >= arrfield.length){
            int[] newarr = new int[arrfield.length *2];
            for(int j= 0; j< arrfield.length; j++){
                newarr[j]= arrfield[j];
            }
            arrfield =newarr;
        }
        arrfield[aliveele] = ele;
        aliveele++;
    }

    //adds ele to tart of list
    public void addToStart(int ele){
        if(aliveele >= arrfield.length){
            int[] newarr = new int[arrfield.length *2];
            for(int j= 0; j< arrfield.length; j++){
                newarr[j]= arrfield[j];
            }
            arrfield =newarr;
        }
        for(int i = arrfield.length-2; i>=0; i-- ){
            arrfield[i+1] = arrfield[i];
        }
        arrfield[0] = ele;
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
