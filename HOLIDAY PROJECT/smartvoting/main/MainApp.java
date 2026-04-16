package main;

import service.*;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        VotingService service = new VotingServiceImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Candidate");
            System.out.println("2. Register Voter");
            System.out.println("3. Vote");
            System.out.println("4. Show Results");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Candidate ID & Name: ");
                    service.addCandidate(sc.nextInt(), sc.next());
                    break;

                case 2:
                    System.out.print("Enter Voter ID & Name: ");
                    service.registerVoter(sc.nextInt(), sc.next());
                    break;

                case 3:
                    System.out.print("Enter Voter ID & Candidate ID: ");
                    service.vote(sc.nextInt(), sc.nextInt());
                    break;

                case 4:
                    service.showResults();
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}