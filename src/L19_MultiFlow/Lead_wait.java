package L19_MultiFlow;

//in multiflow with wait should be one clas with psvm
public class Lead_wait {
    public static void main(String[] args) {

        System.out.println("Concert is started");

        Singer1_wait singer1 = new Singer1_wait();
        Singer2_wait singer2 = new Singer2_wait();
        singer2.setDaemon(true); //second singer look at first singer and when first singer fully finished sing song also stop to sing
                                 // second singer is daemon flow - flow which last finished its work after all others
        singer1.start();// the algorithm of actions of singer1 is described in file Singer1
        singer2.start();// the algorithm of actions of singer2 is described in file Singer2


        while (singer1.isAlive()){//Lead is waiting while singer is alive and after that do its action

        }
            System.out.println("Concert is finished");
    }
}
// problem of multiple access is solved by Critical zone - method which can be done only by one. It is done by synchronize method.
// Object of monitor - flag which is info can we do it or not. If smb use method others are blocked
// Two singers are separated by object monitor
// object at us is microphone. It is one.