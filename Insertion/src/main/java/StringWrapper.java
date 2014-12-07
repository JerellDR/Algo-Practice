/**
 * Created by JerellDR on 12/7/2014.
 * On 12/7/2014
 */
public class StringWrapper {
    private static final StringBuilder sBuilder = new StringBuilder();

    public String[] toSort;

    @Override
    public String toString(){
        sBuilder.setLength(0);
        for(String s : toSort) {
            sBuilder.append(s);
        }
        sBuilder.append("\n");
        return sBuilder.toString();
    }
}
