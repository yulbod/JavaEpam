package task1;

import java.util.Collection;

public class CollectionCreator {
    public CollectionCreator() {
    }

    public void createCollection() {
        Generator generator = new Generator();
        print(generator.generateList(4,1,2));
        print(generator.generateSet(4, 1, 2));
    }



    public void print(Collection<Integer> collection){
        System.out.println(collection);
    }
}
