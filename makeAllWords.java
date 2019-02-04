import java.util.List;
import java.util.ArrayList;
public class makeAllWords{
  public static List <String> makeAllWords(int k, int maxnum){
    List<String> ans = new ArrayList<String>();
    char start = 'a';
    for(int i = 0; i < maxnum; i++){
      char newstart = (char)(start + i);
      makeHelper(k - 1, maxnum, "" + newstart, ans);
    }
    return ans;
  }

  private static void makeHelper(int k, int maxnum, String word, List<String> L){
    if(k == 0){
      L.add(word);
    }else{
      char start = 'a';
      for(int i = 0; i < maxnum; i++){
        char newstart = (char)(start + i);
        makeHelper(k - 1, maxnum, word + newstart, L);
      }
    }
  }
}
