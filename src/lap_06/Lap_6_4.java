package lap_06;

public class Lap_6_4 {
    /*
     * String url = "https://google.com";
     * Check http OR https; domain name, .com OR .net
     * */
    public static void main(String[] args) {
        String url = "Http://google.com";
        String[] protocols = url.split("://");
        String[] domainName = url.split("\\.");

        if (protocols[0].equalsIgnoreCase("http"))
            System.out.println("Protocol: http");
        else if (protocols[0].equalsIgnoreCase("https")) {
            System.out.println("Protocol: https");
        } else System.out.println("Protocol: other");

        if (domainName[domainName.length - 1].equalsIgnoreCase("com"))
            System.out.println("Domain name: .com");
        else if (domainName[domainName.length - 1].equalsIgnoreCase("net")) {
            System.out.println("Domain name: .net");
        } else System.out.println("Domain name: other");
    }

}
