package ch15.lecture.p1List.p2set.Problem;

import ch15.lecture.p1List.p2set.Ex.Person;

public class Stuent implements Comparable<Stuent>{
    public String id;
    public int score;

    public Stuent(String id, int score){
        this.id = id;
        this.score = score;
    }
    @Override
    public int compareTo(Stuent o) {
        if (score < o.score) return -1;
        else if(id == o.id) return 0;
        else return 1;
    }

}
