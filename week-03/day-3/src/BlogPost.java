
//Create a BlogPost class that has
//an authorName
//a title
//a text
//a publicationDate
//Create a few blog post objects:
//"Lorem Ipsum" titled by John Doe posted at "2000.05.04."
//Lorem ipsum dolor sit amet.
//"Wait but why" titled by Tim Urban posted at "2010.10.10."
//A popular long-form, stick-figure-illustrated blog about almost everything.
//"One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
//Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be
// the center of attention. When I asked to take
// his picture outside one of IBM’s New York City offices, he told me that
// he wasn’t really into the whole organizer profile thing.


class BlogPostEntry {

    String authorName;
    String title;
    String text;
    String publicationDate;

    public BlogPostEntry() {
    }

    public BlogPostEntry(String authorName, String title, String text, String publicationDate) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;

    }

}

public class BlogPost {

    public static void main(String[] args) {

        BlogPostEntry entry1 = new BlogPostEntry();
        entry1.authorName = "John Doe";
        entry1.title = "Lorem Ipsum";
        entry1.text = "Lorem ipsum dolor sit amet.";
        entry1.publicationDate = "2000.05.04.";

        BlogPostEntry entry2 = new BlogPostEntry();
        entry2.authorName = "Tim Urban";
        entry2.title = "Wait but why";
        entry2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        entry2.publicationDate = "2010.10.10.";


    }
}
