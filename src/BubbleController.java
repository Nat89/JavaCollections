import java.util.ArrayList;
import java.util.List;


public class BubbleController {
    private List<Integer> temp = new ArrayList<>();

    public List<Integer> sortASC(List<Integer> list) {

        temp = list;
        // petla iterujaca po testach
        for (int i = 1; i < temp.size(); i++) {
            // petla iterujaca po wartosciach listy

            for (int j = 1; j < temp.size(); j++) {
                if (temp.get(j - 1) > temp.get(j)) {
                    swap(j - 1, j);

                }
            }
        }
        return temp;
    }
    public List<Integer> sortASC2(List<Integer> list) {

        temp = list;
        // petla iterujaca po testach
        for (int i = 1; i < temp.size(); i++) {
            // petla iterujaca po wartosciach listy

            for (int j = 1; j < temp.size(); j++) {
                if (temp.get(j - 1) < temp.get(j)) {
                    swap(j - 1, j);

                }
            }
        }
        return temp;
    }



    // metoda zamieniajaca miejscami wartosci na wskazanych indeksach
    public void swap(int index1, int index2) {
        int tempIndex = temp.get(index1);
        // wprowadzam index2 w miejsce index1
        temp.set(index1, temp.get(index2));
        // wprowadzam wartosc dla index1 w miejsce index2
        temp.set(index2, tempIndex);


    }
}
