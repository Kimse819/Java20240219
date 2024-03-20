package ch15.lecture.p1List.p2set.Ex;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2){
        if (o1.price < o2.price) return -1;
        else if (o1.price == o2.price) return 0;
        else return 1;
    }
}

// 람다로 작성
//Comparator<Fruit> fruitComparator = (o1, o2) -> {
//    if (o1.price < o2.price) return -1;
//    else if (o1.price == o2.price) return 0;
//    else return 1;
//};

