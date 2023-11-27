import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        List<String> values = new ArrayList<>();
//        Pattern pattern = Pattern.compile("<(\\w+)( +.+)*>((.*))</\\1>");
//        Matcher matcher = pattern.matcher("<span class='fa fa-search'></span><span>Search</span>");
//
//        if (matcher.find()) {
//            for (int i = 0; i <= matcher.groupCount(); i++) {
//                if (!matcher.group(i).contains("span")) {
//                    values.add(matcher.group(i));
//                }
//            }
//
//            System.out.println(values);
//        }

        values = getValues("<span class=\"fa fa-search\" style=\"color:\"></span><span style=\"color:\">Search</span>");
//        System.out.println(values);
    }

    public static List<String> getValues(String htmlTag) {
        List<String> values = new ArrayList<>();

        boolean result = "<span class=\"fa fa-search\" style=\"color:\"></span><span style=\"color:\">Search</span>".contains("span style");

//        Pattern pattern = Pattern.compile("<span>(.+?)</span>", Pattern.DOTALL);
        Pattern pattern = Pattern.compile("<span\\s+[A-Za-z]+=\"[A-Za-z]+:\">(.+?)</span>", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(htmlTag);

        if (matcher.find()) {
//            for (int i = 0; i <= matcher.groupCount(); i++) {
//                if (matcher.group(i).contains("span") && !values.contains(matcher.group(i))) {
//                    values.add(matcher.group(i));
//                }
//            }

//            System.out.println(values);
            System.out.println(matcher.group(1));
        }

        return values;
    }
}