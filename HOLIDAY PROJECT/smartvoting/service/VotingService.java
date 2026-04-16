package service;

public interface VotingService {
    void registerVoter(Integer id, String name);
    void addCandidate(Integer id, String name);
    void vote(Integer voterId, Integer candidateId);
    void showResults();
}