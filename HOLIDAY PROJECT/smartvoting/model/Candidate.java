package model;

public class Candidate extends Person {
    private Integer votes;

    public Candidate(Integer id, String name) {
        super(id, name);
        this.votes = 0;
    }

    public void addVote() {
        votes++;
    }

    public Integer getVotes() {
        return votes;
    }

    @Override
    public void display() {
        System.out.println("Candidate: " + getName() + " Votes: " + votes);
    }
}