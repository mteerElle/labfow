import java.util.NoSuchElementException;

//Class
public class fakearr {
    //fields
    public  int[] arrfield;
    public  int aliveele;

    //Constructor
    public fakearr(int length){
        arrfield = new int[length];
        aliveele =0;

    }
    //for making test cases easier bc im lazzy asf
    public fakearr(int[] arr, int aliveele){
        this.arrfield = arr;
        this.aliveele = aliveele;
    }

    //methods
    public boolean equals(Object other){
        if(other instanceof fakearr){
            fakearr fa = (fakearr) other;
            if(this.aliveele != fa.aliveele){
                return false;
            }
            for(int i =0; i<arrfield.length; i++){
                if(fa.arrfield[i] != this.arrfield[i]){
                    return false;
                }
            }
            return true;
        }
        if(this.aliveele != fa.aliveele){
             return false;
        }
        for(int i =0; i<arrfield.length; i++){
            if(fa.arrfield[i] != this.arrfield[i]){
                return false;
            }
        }
        return true;
    }

    //prints out arr bc i like it idk
    public void print(){
        for(int i= 0; i< arrfield.length; i++){
            System.out.print(+arrfield[i]+ ", ");
        }
        System.out.println();
    }

    //only expect alive
    //make it so there isn't spaces between ele before compare
    //holy shit i'm so tired
    public boolean equalElts( fakearr other){
         if (this.aliveele != other.aliveele){
             return false;
         }
         for(int i =0; i< aliveele; i++){
             if(this.arrfield[i] != other.arrfield[i]){
                 return false;
             }
         }
         return true;
    }

    //creates new empty list ig???

    public fakearr empty(){
        return new fakearr(0);
    }
    //returns length of arr
    public int length(){
        return aliveele;
    }

    //gets ele at ind
    public int get(int ind){
        if( ind< 0 || ind>= aliveele){
            throw new NoSuchElementException();
        }

            return arrfield[ind];

    }

    //sets an ele at ind
    public void set(int ind, int value){
        if(ind<0 || ind>= aliveele){
            throw new NoSuchElementException();
        }
        arrfield[ind] = value;
        this.print();
    }

    //insert a ele at ind, doesn't work if space bc idk how alive ele suppose to work
    public void insert(int ind, int ele){
        if(ind < 0 || ind > aliveele){
            throw new NoSuchElementException();
        }

        if(aliveele >= arrfield.length){
            int[] newarr = new int[arrfield.length *2];
            for(int j= 0; j< arrfield.length; j++){
                newarr[j]= arrfield[j];
            }
            arrfield =newarr;
        }
        for(int i = arrfield.length-2; i>ind; i-- ){
            arrfield[i] = arrfield[i-1];
        }

        arrfield[ind]= ele;
        aliveele++;
    }


    // WORK ON THE NULL VS FULL ARRAY THING
    //prof says not to make a new array every time, only if full

    // adds an ele to the end of a list

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

        for(int i = aliveele; i>0; i-- ){
            arrfield[i] = arrfield[i-1];
        }
        arrfield[0] = ele;
        aliveele++;
    }

     //remove ele from list
    public void remove(int ind){
        if(ind<0|| ind>= aliveele){
            throw new NoSuchElementException();
        }
        for(int i= ind; i< aliveele-1;i++){
            arrfield[i]= arrfield[i+1];
        }
        arrfield[aliveele-1]=0;
        aliveele--;

    }










}
