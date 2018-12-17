import java.util.ArrayList;
import java.util.List;

public class BookService implements Service{

    private List < Book > books = new ArrayList <> ();

    @Override
     public MyIterator getIterator() {
        return new BookIteratorImpl();
     }

     public void add(Book  books) {
        this.books.add(books);
     }
     private class BookIteratorImpl implements MyIterator {
          private int index=0;

          @Override
          public boolean hasMore() {
               if (index < books.size()) {
                        return true;
               }
               return false;
          }

          @Override
          public Book next() {
           Book buk = books.get(index);
           index++;
           return buk;
          }
     }
}