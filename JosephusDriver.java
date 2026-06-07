import java.util.*;

public class JosephusDriver {

   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      JosephusSim simulation = new JosephusSim("/Users/boubacarba/Downloads/people.txt");
      
      while(!simulation.isOver()) {
         System.out.println(simulation);
         System.out.println("\nContinue elimination? <press enter>");
         console.nextLine(); // make the user hit enter to continue
         simulation.eliminate();
      }
      
      System.out.println(simulation);
   }

}
/*
# PROGRAM OUTPUT
=== Elimination count is 3 ===

1-Marcelle, 2-Hashir, 3-Boubacar, 4-edgar, 5-Nelson, 6-Sarinya, 7-Dario, 8-Joaquin, 9-Aurel, 10-Crystal, 11-Michael, 12-Jesse, 13-Joshua, 14-Thomas, 15-Angelina, 16-Visal, 17-Zoheb, 18-Owen, 19-Marc, 20-Grace, 21-Milady, 22-Lily

Continue elimination? <press enter>

Boubacar eliminated!

1-edgar, 2-Nelson, 3-Sarinya, 4-Dario, 5-Joaquin, 6-Aurel, 7-Crystal, 8-Michael, 9-Jesse, 10-Joshua, 11-Thomas, 12-Angelina, 13-Visal, 14-Zoheb, 15-Owen, 16-Marc, 17-Grace, 18-Milady, 19-Lily, 20-Marcelle, 21-Hashir

Continue elimination? <press enter>

Sarinya eliminated!

1-Dario, 2-Joaquin, 3-Aurel, 4-Crystal, 5-Michael, 6-Jesse, 7-Joshua, 8-Thomas, 9-Angelina, 10-Visal, 11-Zoheb, 12-Owen, 13-Marc, 14-Grace, 15-Milady, 16-Lily, 17-Marcelle, 18-Hashir, 19-edgar, 20-Nelson

Continue elimination? <press enter>

Aurel eliminated!

1-Crystal, 2-Michael, 3-Jesse, 4-Joshua, 5-Thomas, 6-Angelina, 7-Visal, 8-Zoheb, 9-Owen, 10-Marc, 11-Grace, 12-Milady, 13-Lily, 14-Marcelle, 15-Hashir, 16-edgar, 17-Nelson, 18-Dario, 19-Joaquin

Continue elimination? <press enter>

Jesse eliminated!

1-Joshua, 2-Thomas, 3-Angelina, 4-Visal, 5-Zoheb, 6-Owen, 7-Marc, 8-Grace, 9-Milady, 10-Lily, 11-Marcelle, 12-Hashir, 13-edgar, 14-Nelson, 15-Dario, 16-Joaquin, 17-Crystal, 18-Michael

Continue elimination? <press enter>

Angelina eliminated!

1-Visal, 2-Zoheb, 3-Owen, 4-Marc, 5-Grace, 6-Milady, 7-Lily, 8-Marcelle, 9-Hashir, 10-edgar, 11-Nelson, 12-Dario, 13-Joaquin, 14-Crystal, 15-Michael, 16-Joshua, 17-Thomas

Continue elimination? <press enter>

Owen eliminated!

1-Marc, 2-Grace, 3-Milady, 4-Lily, 5-Marcelle, 6-Hashir, 7-edgar, 8-Nelson, 9-Dario, 10-Joaquin, 11-Crystal, 12-Michael, 13-Joshua, 14-Thomas, 15-Visal, 16-Zoheb

Continue elimination? <press enter>

Milady eliminated!

1-Lily, 2-Marcelle, 3-Hashir, 4-edgar, 5-Nelson, 6-Dario, 7-Joaquin, 8-Crystal, 9-Michael, 10-Joshua, 11-Thomas, 12-Visal, 13-Zoheb, 14-Marc, 15-Grace

Continue elimination? <press enter>

Hashir eliminated!

1-edgar, 2-Nelson, 3-Dario, 4-Joaquin, 5-Crystal, 6-Michael, 7-Joshua, 8-Thomas, 9-Visal, 10-Zoheb, 11-Marc, 12-Grace, 13-Lily, 14-Marcelle

Continue elimination? <press enter>

Dario eliminated!

1-Joaquin, 2-Crystal, 3-Michael, 4-Joshua, 5-Thomas, 6-Visal, 7-Zoheb, 8-Marc, 9-Grace, 10-Lily, 11-Marcelle, 12-edgar, 13-Nelson

Continue elimination? <press enter>

Michael eliminated!

1-Joshua, 2-Thomas, 3-Visal, 4-Zoheb, 5-Marc, 6-Grace, 7-Lily, 8-Marcelle, 9-edgar, 10-Nelson, 11-Joaquin, 12-Crystal

Continue elimination? <press enter>

Visal eliminated!

1-Zoheb, 2-Marc, 3-Grace, 4-Lily, 5-Marcelle, 6-edgar, 7-Nelson, 8-Joaquin, 9-Crystal, 10-Joshua, 11-Thomas

Continue elimination? <press enter>

Grace eliminated!

1-Lily, 2-Marcelle, 3-edgar, 4-Nelson, 5-Joaquin, 6-Crystal, 7-Joshua, 8-Thomas, 9-Zoheb, 10-Marc

Continue elimination? <press enter>

edgar eliminated!

1-Nelson, 2-Joaquin, 3-Crystal, 4-Joshua, 5-Thomas, 6-Zoheb, 7-Marc, 8-Lily, 9-Marcelle

Continue elimination? <press enter>

Crystal eliminated!

1-Joshua, 2-Thomas, 3-Zoheb, 4-Marc, 5-Lily, 6-Marcelle, 7-Nelson, 8-Joaquin

Continue elimination? <press enter>

Zoheb eliminated!

1-Marc, 2-Lily, 3-Marcelle, 4-Nelson, 5-Joaquin, 6-Joshua, 7-Thomas

Continue elimination? <press enter>

Marcelle eliminated!

1-Nelson, 2-Joaquin, 3-Joshua, 4-Thomas, 5-Marc, 6-Lily

Continue elimination? <press enter>

Joshua eliminated!

1-Thomas, 2-Marc, 3-Lily, 4-Nelson, 5-Joaquin

Continue elimination? <press enter>

Lily eliminated!

1-Nelson, 2-Joaquin, 3-Thomas, 4-Marc

Continue elimination? <press enter>

Thomas eliminated!

1-Marc, 2-Nelson, 3-Joaquin

Continue elimination? <press enter>

Joaquin eliminated!

1-Marc, 2-Nelson

Continue elimination? <press enter>

Marc eliminated!

Nelson is the last survivor!
*/