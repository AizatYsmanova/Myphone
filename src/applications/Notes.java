package applications;

import interface1.ApplicationNotes;

public class Notes implements ApplicationNotes {



    @Override
    public void notesName(String word) {
        System.out.println(word);
    }

    @Override
    public void writeNotes(String notes) {
        System.out.println(notes);
    }


    @Override
    public String name() {
        return null;
    }
}
