package Atividade_3.Questao_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class PostRepository {
   private List<Post> posts;
   private String filePath;

   public PostRepository(List<Post> posts, String filepath) {
      this.posts = posts;
      this.filePath = filepath;
   }

   public String getFilePath() {
      return filePath;
   }

   public List<Post> getPosts() {
      return posts;
   }

   public void salvarPostsEmArquivo() {
      try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(getFilePath()))) {
         outputStream.writeObject(posts);
         System.out.println("Posts salvos com sucesso em " + getFilePath());
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public List<Post> lerPostsDeArquivo() {
        List<Post> postsLidos = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            postsLidos = (List<Post>) inputStream.readObject();
            System.out.println("Posts lidos com sucesso de " + getFilePath());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return postsLidos;
    }
}
