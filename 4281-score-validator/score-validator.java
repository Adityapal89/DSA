class Solution {
    public int[] scoreValidator(String[] events) {
        int score = 0;
        int wickets = 0;

        for (int i = 0; i < events.length; i++) {

            // Innings over
            if (wickets == 10) {
                break;
            }
            if (events[i].equals("W")) {
                wickets++;
            } 
            else if (events[i].equals("WD") || events[i].equals("NB")) {
                score++;
            } 
            else {
                score += Integer.parseInt(events[i]);
            }
        }
        return new int[]{score, wickets};
    }
}