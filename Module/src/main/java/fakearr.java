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







}
