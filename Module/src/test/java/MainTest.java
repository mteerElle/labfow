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
        fakearr f1 = new fakearr(0);
        assertEquals(f1,f1.empty());
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
        fakearr f1 = new fakearr(3);
        f1.insert(2,3);
        assertEquals(3,f1.get(2));
    }
    @Test
    void set(){
        fakearr f1 = new fakearr(3);
        fakearr f2 = new fakearr(3);
        f1.set(2,4);

    }
    

}
