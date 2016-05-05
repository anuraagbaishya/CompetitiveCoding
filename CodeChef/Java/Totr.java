import java.util.*;
class Totr{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    String code = sc.next();
    ArrayList<String> sentences = new ArrayList<>();
    for (int i = 0; i < size; i++)
      sentences.add(sc.next());
    for(int i = 0; i < size; i++){
      String sentence = sentences.get(i);
      sentence = sentence.replace("_"," ");
      sentence = sentence.toUpperCase();
      StringBuffer newsentence = new StringBuffer();
      for(int j = 0; j < sentence.length(); j++){

        if(Character.isLetter(sentence.charAt(j))){
          int n = (int)sentence.charAt(j) - 65;
          if(Character.isLowerCase(sentences.get(i).charAt(j)))
            newsentence.append(code.charAt(n));
          else if(Character.isUpperCase(sentences.get(i).charAt(j)))
            newsentence.append((char)(code.charAt(n) - 32));
        }
        else
          newsentence.append(sentence.charAt(j));

      }
      System.out.println(newsentence.toString());
    }
  }
}
