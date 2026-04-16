package model;

public class Voter extends Person {
    private Boolean hasVoted;

    public Voter(Integer id, String name) {
        super(id, name);
        this.hasVoted = false;
    }

    public Boolean getHasVoted() {
        return hasVoted;
    }

    public void setHasVoted(Boolean hasVoted) {
        this.hasVoted = hasVoted;
    }

    @Override
    public void display() {
        System.out.println("Voter: " + getName());
    }
}