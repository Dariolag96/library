import java.util.ArrayList;

public class Library {

    private ArrayList<Shelf> shelfs = new ArrayList<>();
    private Publication publication;
    private int id;
    private int position;
    private String author;

    public void addShelf (int id, int numberOfPublications){
     Shelf shelf = new Shelf (id, numberOfPublications);
     this.shelfs.add(shelf);
    }
    public void newBook (int id, Publication publication, int position) {
    for (int i=0; i<shelfs.size(); i++){
        if(shelfs.get(i).getId()==id){
            shelfs.get(i).setPublications(publication, position);
            break;
        }
      }
    }
    public void stampList (){
        for (int i=0; i<shelfs.size(); i++) {
            shelfs.get(i).list();
        }
    }
    public void searchForAuthor (String author){
        for (int i=0;i<shelfs.size();i++) {
            for(int j=0; j<shelfs.get(i).getNumberOfPublications();j++){
                if(this.shelfs.get(i).getPublications(j).getAuthor().equalsIgnoreCase(author)){
                    this.shelfs.get(i).getPublications(j).toString();
                }
            }
        }
    }
    public int checkPosition () {
        int count=0;
        for (int i=0;i<shelfs.size();i++) {
            for (int j=0;j<shelfs.get(i).getNumberOfPublications();j++) {
             if (this.shelfs.get(i).getPublications(j)==null){
                 count++;
             }
            }
        }
        return count;
    }

    public void printList() {
    }
}
