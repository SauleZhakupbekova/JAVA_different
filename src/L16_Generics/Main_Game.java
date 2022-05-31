package L16_Generics;

public class Main_Game {
    public static void main(String[] args) {
        Analysts analyst = new Analysts("Shane", 22);
        Analysts analyst1 = new Analysts("Chris", 26);
        Analysts analyst2 = new Analysts("Gammy", 35);
        Analysts analyst3 = new Analysts("Arthur", 18);

        Developers developer = new Developers("James", 19);
        Developers developer1 = new Developers("Olga", 22);
        Developers developer2 = new Developers("Hanry", 35);
        Developers developer3 = new Developers("Joe", 26);

        Developers developer4 = new Developers("William", 18);
        Developers developer5 = new Developers("Harry", 22);
        Developers developer6 = new Developers("Kate", 17);
        Developers developer7 = new Developers("Alice", 21);

        Team<Analysts> teamAnalysts = new Team<>();
        teamAnalysts.setName("Mad");
        teamAnalysts.addParticipantToTeam(analyst);
        teamAnalysts.addParticipantToTeam(analyst1);
        teamAnalysts.addParticipantToTeam(analyst2);
        teamAnalysts.addParticipantToTeam(analyst3);

        Team<Developers> teamDevelopers = new Team<>();
        teamDevelopers.setName("Tiger");
        teamDevelopers.addParticipantToTeam(developer);
        teamDevelopers.addParticipantToTeam(developer1);
        teamDevelopers.addParticipantToTeam(developer2);
        teamDevelopers.addParticipantToTeam(developer3);

        Team<Developers> teamDevelopers1= new Team<>();
        teamDevelopers1.setName("Kings");
        teamDevelopers1.addParticipantToTeam(developer4);
        teamDevelopers1.addParticipantToTeam(developer5);
        teamDevelopers1.addParticipantToTeam(developer6);
        teamDevelopers1.addParticipantToTeam(developer7);

        // for avoiding including Analysts to team to developers
        // we use generics in Team public class Team<T extends Participants>
        // and public void addParticipantToTeam(T participant)

        teamDevelopers.winnerTeam(teamDevelopers1); // team Analysts we cannot add in winnerTeam(teamDevelopers1)
    }

}
