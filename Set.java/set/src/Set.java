import java.util.Arrays;
import java.util.LinkedList;

public class Set<T> {
    final int m=10;
    private LinkedList<T>[] matrix;
    public Set() {
        matrix=new LinkedList[m];
        for(int i=0;i<m;i++)
            matrix[i]=new LinkedList<>();
    }
    public int Hash(T key) {
        return (int) key % m;
    }
    public void add(T key) {
        LinkedList<T> list=matrix[Hash(key)];
        for(T t:list){
            if(t==key){
                return;
            }
        }
        list.push(key);
    }
    public boolean find(T key) {
        LinkedList<T> list=matrix[Hash(key)];
        for(T t:list){
            if(t==key){
                return true;
            }
        }
        return false;
    }
    public void Remove(T key) {
        if(!find(key)){
           return;
        }
        matrix[Hash(key)].remove(key);
    }

    @Override
    public String toString() {
        return "Set{" +
                 " ,matrix=" + Arrays.toString(matrix) +

                '}';
    }
}
