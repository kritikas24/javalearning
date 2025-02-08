import java.util.LinkedList;
import java.util.List;

class ArrayForml {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> res=new LinkedList<>();
        int len=num.length-1;
        while(len>=0 || k>0){
            if(len>=0){
                k+=num[len--];
            }
            res.addFirst(k%10);
            k/=10;
        }
        return res;
    }
}