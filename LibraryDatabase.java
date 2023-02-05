import java.util.ArrayList;

public class LibraryDatabase {
    private int capacity;
    Book [] mainArrayList;
    LibraryDatabase(int capacity){
        if (capacity < 0) {
            throw new IllegalArgumentException("capacity needs to be greater than zero");

        }else {
            this.capacity = capacity;
            mainArrayList = new ArrayList<>(capacity);
        }
        //if size>capacity
    }

    public void add(Book book){
        int low = 0;
        int high = mainArrayList.size();
        while(low<=high){
            int middleChanging = ((low+high)/2);
            if(mainArrayList.get(middleChanging).getAuthor().equals(book.getAuthor())){
                mainArrayList.add(middleChanging, book);
            } else if (mainArrayList.get(middleChanging).getAuthor().compareTo(book.getAuthor())<0) {
                high = middleChanging-1;
            }
            else{
                low = middleChanging+1;
            }
        }
    }
}