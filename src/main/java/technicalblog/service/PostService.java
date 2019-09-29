package technicalblog.service;

import org.hibernate.sql.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import technicalblog.model.Post;
import technicalblog.repository.PostRepository;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

   /** @PersistenceUnit(unitName = "techblog")
    private EntityManagerFactory emf;

    public PostService() {
        System.out.println("*** PostService ***");
    }
    public List<Post> getAllPosts() {

        ArrayList<Post> posts = new ArrayList<>();
        EntityManager em = emf.createEntityManager();
       // TypedQuery<Post> query = em.createQuery("SELECT p from Post p", Post.class);
       TypedQuery<Post> query = em.createQuery("select p from Post p", Post.class);
       //TypedQuery<Post> query = em.createQuery("SELECT p from Post p", Post.class);
        List<Post> resultList = query.getResultList();
        return resultList;
    } **/
   @Autowired
   private PostRepository repository;

    public PostService() {
        System.out.println("*** PostService ***");
    }

    public List<Post> getAllPosts() {
        return repository.getAllPosts();
    }






  /**  public ArrayList<Post> getOnePost() {
        ArrayList<Post> posts = new ArrayList<>();
        Connection connection = null;
        try{
            Class.forName("org.postgresql.Driver");

         connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/technicalblog", "postgres", "superuser");
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM posts where id = 4");
            while(rs.next()){
                Post post = new Post();
                post.setTitle(rs.getString("title"));
                post.setBody(rs.getString("body"));
                posts.add(post);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally{
            try{
                connection.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        return posts;

    }**/

  public Post getOnePost() {
      return repository.getLatestPost();
  }

    public void createPost (Post newPost){
    }
}
