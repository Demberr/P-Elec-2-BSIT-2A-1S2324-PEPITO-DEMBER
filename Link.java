class Link extends WebpageElement {
    private String url;

    public Link(String id, String content, String url) {
        super(id, content);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}