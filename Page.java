class Page {
    private String title;
    private WebpageElement[] elements;

    public Page(String title, WebpageElement[] elements) {
        this.title = title;
        this.elements = elements;
    }

    public void displayContent() {
        System.out.println("Title: " + title);
        for (WebpageElement element : elements) {
            System.out.println("ID: " + element.getId());
            System.out.println("Content: " + element.getContent());
            if (element instanceof Link) {
                System.out.println("URL: " + ((Link) element).getUrl());
            }
            System.out.println("------");
        }
    }
}