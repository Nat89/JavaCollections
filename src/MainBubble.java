
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;






public class MainBubble {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4,67,643,4,8));
        BubbleController bc = new BubbleController();
        System.out.println(bc.sortASC(myList));
        System.out.println(bc.sortASC2(myList));
    }
}
