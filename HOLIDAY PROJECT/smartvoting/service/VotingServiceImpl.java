package service;

import model.*;
import java.util.*;

public class VotingServiceImpl implements VotingService {

    private Map<Integer, Voter> voters = new HashMap<>();
    private Map<Integer, Candidate> candidates = new HashMap<>();

    @Override
    public void registerVoter(Integer id, String name) {
        voters.put(id, new Voter(id, name));
    }

    @Override
    public void addCandidate(Integer id, String name) {
        candidates.put(id, new Candidate(id, name));
    }

    @Override
    public void vote(Integer voterId, Integer candidateId) {
        try {
            Voter voter = voters.get(voterId);
            Candidate candidate = candidates.get(candidateId);

            if (voter == null || candidate == null) {
                throw new Exception("Invalid voter or candidate!");
            }

            if (voter.getHasVoted()) {
                throw new Exception("Voter already voted!");
            }

            candidate.addVote();
            voter.setHasVoted(true);

            System.out.println("Vote successful!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void showResults() {
        for (Candidate c : candidates.values()) {
            c.display();
        }
    }
}