import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void equals(){
        fakearr f1 = new fakearr(3);
        fakearr f2 = new fakearr(3);
        fakearr f3 =new fakearr(3);
        f1.addToEnd(3);
        f2.addToEnd(5);
        f3.addToEnd(3);
        assertEquals(true, f1.equals(f3));
        assertEquals(false,f1.equals(f2));


    }
    @Test
    void equalElts(){
        fakearr f1 = new fakearr(3);
        fakearr f2 = new fakearr(3);
        fakearr f3 =new fakearr(3);
        f1.insert(0,5);
        f2.addToEnd(5);
        assertEquals(true,f1.equalElts(f2));

    }
    @Test
    void empty(){
        int[] a = {10,20,30};
        fakearr ar = new fakearr(a, 3);
        fakearr result = ar.empty();
        assertEquals(0,result.length());
    }
    @Test
    void length(){
        fakearr f1 = new fakearr(3);
        f1.addToEnd(3);
        f1.addToEnd(5);
        f1.addToEnd(3);
        assertEquals(3,f1.length());
    }
    @Test
    void get(){
        fakearr ar = new fakearr(new int[]{10,20,30,0,0},3);
        assertEquals(10, ar.get(0));

    }
    @Test
    void set(){
        fakearr ar = new fakearr(new int[]{10,20,30,0,0},3);
        ar.set(1,99);
        assertEquals(99,ar.get(1));
    }
    @Test
    void insert(){
        fakearr ar = new fakearr(new int[]{10,20,30,0,0},3);
        ar.insert(1,43);
        assertEquals(10,ar.get(0));
        assertEquals(43, ar.get(1));
    }
    @Test
    void addToEnd(){
        fakearr ar = new fakearr(new int[]{10,20,30,0,0},3);
        ar.addToEnd(22);
        assertEquals(22, ar.get(3));
    }
    @Test
    void addToStart(){
        fakearr ar = new fakearr(new int[]{10,20,30,0,0},3);
        ar.addToStart(22);
        assertEquals(22,ar.get(0));

    }
    @Test
    void remove(){
        fakearr ar = new fakearr(new int[]{10,20,30,0,0},3);
        ar.remove(1);
        assertEquals(10,ar.get(0));
        assertEquals(30,ar.get(1));
    }

}
