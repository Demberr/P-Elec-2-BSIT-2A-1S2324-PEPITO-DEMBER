public class Main {
    public static void main(String[] args) {
        Link homeLink = new Link("home", "Home", "#top");
        Link aboutLink = new Link("about", "About Us", "#top");
        Link servicesLink = new Link("services", "Our Services", "#top");
        Link contactLink = new Link("contact", "Contact Us", "#top");

        Paragraph homeContent = new Paragraph("home", "Welcome to our Home Page");
        Paragraph aboutContent = new Paragraph("about", "BSIT Gwapings Website is your trusted partner for electronic and vehicle parts...");
        Paragraph servicesContent = new Paragraph("services", "At BSIT Gwapings Website, we offer a wide range of services to cater to your electronic and vehicle parts needs...");
        Paragraph contactContent = new Paragraph("contact", "Have questions or need assistance? Reach out to us today:");

        Page homePage = new Page("Electronic and Vehicle Parts", new WebpageElement[]{homeLink, homeContent});
        Page aboutPage = new Page("About Us", new WebpageElement[]{aboutLink, aboutContent});
        Page servicesPage = new Page("Our Services", new WebpageElement[]{servicesLink, servicesContent});
        Page contactPage = new Page("Contact Us", new WebpageElement[]{contactLink, contactContent});

        Website website = new Website(homePage, aboutPage, servicesPage, contactPage);

        website.displayHomePage();
        System.out.println("--------");
        website.displayAboutPage();
        System.out.println("--------");
        website.displayServicesPage();
        System.out.println("--------");
        website.displayContactPage();
    }
}