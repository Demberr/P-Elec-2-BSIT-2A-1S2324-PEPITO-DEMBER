class Website {
    private Page homePage;
    private Page aboutPage;
    private Page servicesPage;
    private Page contactPage;

    public Website(Page homePage, Page aboutPage, Page servicesPage, Page contactPage) {
        this.homePage = homePage;
        this.aboutPage = aboutPage;
        this.servicesPage = servicesPage;
        this.contactPage = contactPage;
    }

    public void displayHomePage() {
        System.out.println("Home Page Content:");
        homePage.displayContent();
    }

    public void displayAboutPage() {
        System.out.println("About Page Content:");
        aboutPage.displayContent();
    }

    public void displayServicesPage() {
        System.out.println("Services Page Content:");
        servicesPage.displayContent();
    }

    public void displayContactPage() {
        System.out.println("Contact Page Content:");
        contactPage.displayContent();
    }
}
