package L16_Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


// Generic <T extends Participants> protect us from including Analysts in Developers Team
public class Team<T extends Participants> {
    private String name;
    private List<Participants> participants;  // we have massive of participants that is why use List<>

    // if we are typing Team by <T extends participant> then we should specidy participants by type T working as self in Python (type to type)
    public void addParticipantToTeam(T participant){
        System.out.println("To Team " + name + " добавлен игрок с именем " + participant.name);
        participants = new ArrayList<>();
        participants.add(participant);

    }

    public void setName(String name) {
        this.name = name;
    }

    //(T team) - allows us to specify teams playing against each other. Developers 1 against Developers 2 but not against Analysts
    public void winnerTeam(Team<T> team) {
        Random random = new Random();
        int randomFinder = random.nextInt(1, 2);
        if(randomFinder == 1) {
            System.out.println("Winning Team is " + this.name);
        }else{
            System.out.println(team.name);

        }

    }

}
