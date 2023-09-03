package test11;

import java.util.ArrayList;
import java.util.Arrays;

public class Word {
    private String word;

    
    public Word(String word){
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return "Word [word=" + word + "]";
    }
}

class Sentence{
    private ArrayList<Word> words;


    public Sentence(){
        words = new ArrayList<>();
    }

    public void addWord(Word word){
        words.add(word);
    }

    public void addWords(ArrayList<Word> words){
        this.words.addAll(words);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.size(); i++){
            sb.append(words.get(i));
            if (i < words.size() -1){
                sb.append(" ");
            }
        }sb.append(".");
        return sb.toString();
    }
}

class Text{
    private String title;
    private ArrayList<Sentence> sentences;

    public Text(String title){
        this.title = title;
        sentences = new ArrayList<>();
    }

    public void addSentence(Sentence sentence){
        sentences.add(sentence);
    }

    public void addSentences(ArrayList<Sentence> sentences){
        this.sentences.addAll(sentences);
    }

    public void printText(){
        System.out.println(title);
        for(Sentence sentence : sentences){
            System.out.println(sentence+" ");
        }
        System.out.println();
    }
}

class Test{
    public static void main(String[] args) {
        Word word1 = new Word("Hello");
        Word word2 = new Word("world");
        Word word3 = new Word("!");

        Sentence sentence1 = new Sentence();
        sentence1.addWords(new ArrayList<>(Arrays.asList(word1, word2, word3)));

        Text text = new Text("Title of the Text");
        text.addSentence(sentence1);
        text.printText();
    }
}

