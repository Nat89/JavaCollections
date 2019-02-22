import java.time.LocalTime;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {

        Queue<LocalTime> times = new ArrayDeque<>();
        // dodawanie wartosci do kolejki jednokierunkowej
        times.add(LocalTime.now());
        times.add(LocalTime.now());
        times.add(LocalTime.now());
        times.add(LocalTime.now());
        times.add(LocalTime.now (12, 00, 00));
        // odczytywanie wartosci z kolejki
        System.out.println(times);

        // usuwanie elementów z kolejki
        System.out.println("Usuniecie najstarszego elementu kolejki: " + times.remove());
        // ---------------------------
        // kolejka dwukierunkowa
        Deque<String>people = new ArrayDeque<>();
        // dodawanie elementow
       people.addFirst("Anna");
       people.addFirst("Anna");
       people.addFirst("Anna");
       people.addFirst("Anna");
       people.addFirst("Anna");
       people.addFirst("Anna");
       people.addFirst("Anna");
       people.addFirst("Anna");
    }
}
